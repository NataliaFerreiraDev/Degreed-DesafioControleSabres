package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MenuPrincipalController implements Initializable {

	@FXML
	private MenuItem menuItemCadastrar;
	
	@FXML
	private MenuItem menuItemAtualizar;
	
	@FXML
	private MenuItem menuItemListar;
	
	@FXML
	private MenuItem menuItemPesquisar;
	
	@FXML
	private MenuItem menuItemSobre;
	
	@FXML
	public void onMenuItemCadastrarAction() {
		System.out.println("Cadastrado com sucesso!!!");
	}
	
	@FXML
	public void onMenuItemAtualizarAction() {
		System.out.println("Atualizado com sucesso!!!");
	}
	
	@FXML
	public void onMenuItemListarAction() {
		System.out.println("Listar todos!!!");
	}
	
	@FXML
	public void onMenuItemPesquisarAction() {
		System.out.println("Pesquisar sabre!!!");
	}
	
	@FXML
	public void onMenuItemSobreAction() {
		System.out.println("Sobre!!!");
	}
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
	}
	
}
