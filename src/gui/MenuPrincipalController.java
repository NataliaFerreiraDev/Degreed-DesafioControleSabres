package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

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
		loadView("/gui/CadastrarSabres.fxml");
	}

	@FXML
	public void onMenuItemAtualizarAction() {
		loadView("/gui/AtualizarSabres.fxml");
	}
	
	@FXML
	public void onMenuItemListarSabresAction() {
		loadView2("/gui/ListaSabres.fxml");
	}
	
	@FXML
	public void onMenuItemListarManutencoesAction() {
		loadView3("/gui/ListaManutencoes.fxml");
	}
	
	@FXML
	public void onMenuItemPesquisarSabresAction() {
		loadView("/gui/PesquisaSabres.fxml");
	}

	@FXML
	public void onMenuItemSobreAction() {
		loadView("/gui/Sobre.fxml");
	}

	@Override
	public void initialize(URL uri, ResourceBundle rb) {
	}

	private synchronized void loadView(String absoluteName) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			
			Scene mainScene = Main.getMainScene();
			VBox mainVbox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
			
			Node mainMenu = mainVbox.getChildren().get(0);
			mainVbox.getChildren().clear();
			mainVbox.getChildren().add(mainMenu);
			mainVbox.getChildren().addAll(newVBox.getChildren());
			
		} catch (IOException ex) {
			Alerts.showAlert("IOException", "Error loading view", ex.getMessage(), AlertType.ERROR);
		}
	}
	
	private synchronized void loadView2(String absoluteName) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			
			Scene mainScene = Main.getMainScene();
			VBox mainVbox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
			
			Node mainMenu = mainVbox.getChildren().get(0);
			mainVbox.getChildren().clear();
			mainVbox.getChildren().add(mainMenu);
			mainVbox.getChildren().addAll(newVBox.getChildren());
			
			ListaSabresController controller = loader.getController();
			controller.setSabresService(new SabresService());
			controller.updateTableViewSabres();
			
		} catch (IOException ex) {
			Alerts.showAlert("IOException", "Error loading view", ex.getMessage(), AlertType.ERROR);
		}
	}
	
	private synchronized void loadView3(String absoluteName) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			
			Scene mainScene = Main.getMainScene();
			VBox mainVbox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
			
			Node mainMenu = mainVbox.getChildren().get(0);
			mainVbox.getChildren().clear();
			mainVbox.getChildren().add(mainMenu);
			mainVbox.getChildren().addAll(newVBox.getChildren());
			
			ListaManutencaoController controller = loader.getController();
			controller.setManutencaoService(new ManutencaoService());
			controller.updateTableViewManutencoes();
			
		} catch (IOException ex) {
			Alerts.showAlert("IOException", "Error loading view", ex.getMessage(), AlertType.ERROR);
		}
	}

}
