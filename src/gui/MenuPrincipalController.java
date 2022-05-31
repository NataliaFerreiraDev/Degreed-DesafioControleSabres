package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Consumer;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import model.services.ManutencaoService;
import model.services.SabresService;


/**
 * 
 * @author Natalia Ferreira DAngelo
 * Menu principal do sistema de controle de sabres.
 *
 */
public class MenuPrincipalController implements Initializable {

	@FXML
	private MenuItem menuItemCadastrar;

	@FXML
	private MenuItem menuItemAtualizar;
	
	@FXML
	private MenuItem menuItemListarSabres;
	
	@FXML
	private MenuItem menuItemListarManutencoes;

	@FXML
	private MenuItem menuItemPesquisarSabres;

	@FXML
	private MenuItem menuItemSobre;
	
	@FXML
	public void onMenuItemCadastrarAction() {
		loadView("/gui/CadastrarSabres.fxml", x -> {});
	}

	@FXML
	public void onMenuItemAtualizarAction() {
		loadView("/gui/AtualizarSabres.fxml", x -> {});
	}
	
	@FXML
	public void onMenuItemListarSabresAction() {
		loadView("/gui/ListaSabres.fxml", (ListaSabresController controller) -> {
			controller.setSabresService(new SabresService());
			controller.updateTableViewSabres();
		});
	}
	
	@FXML
	public void onMenuItemListarManutencoesAction() {
		loadView("/gui/ListaManutencoes.fxml", (ListaManutencaoController controller) -> {
			controller.setManutencaoService(new ManutencaoService());
			controller.updateTableViewManutencoes();
		});
	}
		
	@FXML
	public void onMenuItemPesquisarSabresAction() {
		loadView("/gui/PesquisaSabres.fxml", x -> {});
	}

	@FXML
	public void onMenuItemSobreAction() {
		loadView("/gui/Sobre.fxml", x -> {});
	}

	@Override
	public void initialize(URL uri, ResourceBundle rb) {
	}

	private synchronized<T> void loadView(String absoluteName, Consumer<T> initializingAction) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			
			Scene mainScene = Main.getMainScene();
			VBox mainVbox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
			
			Node mainMenu = mainVbox.getChildren().get(0);
			mainVbox.getChildren().clear();
			mainVbox.getChildren().add(mainMenu);
			mainVbox.getChildren().addAll(newVBox.getChildren());
			
			T controller = loader.getController();
			initializingAction.accept(controller);
			
		} catch (IOException ex) {
			Alerts.showAlert("IOException", "Error loading view", ex.getMessage(), AlertType.ERROR);
		}
	}

}
