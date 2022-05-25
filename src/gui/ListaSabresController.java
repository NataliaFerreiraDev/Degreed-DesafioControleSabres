package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Manutencao;
import model.entities.Sabres;

public class ListaSabresController implements Initializable {
	
	@FXML
	private TableView<Sabres> tableViewSabres;
	
	@FXML
	private TableColumn<Sabres, Integer> tableColumnId;
	
	@FXML
	private TableColumn<Sabres, String> tableColumnModelo;
	
	@FXML
	private TableColumn<Sabres, String> tableColumnDataFabricacao;
	
	@FXML
	private TableColumn<Sabres, String> tableColumnSituacao;
	
	@FXML
	private TableColumn<Sabres, String> tableColumnJedi;
	
	@FXML
	private TableColumn<Sabres, String> tableColumnModeloBotao;
	
	@FXML
	private TableColumn<Sabres, String> tableColumnSistema;
	
	@FXML
	private TableColumn<Sabres, String> tableColumnGalaxia;
	
	@FXML
	private TableColumn<Sabres, String> tableColumnModeloSensor;
	
	@FXML
	private TableColumn<Sabres, String> tableColumnValidadeSensor;
	
	@FXML
	private TableView<Manutencao> tableViewManutencoes;
	
	@FXML
	private TableColumn<Sabres, String> tableColumnIdManutencao;
	
	@FXML
	private TableColumn<Sabres, String> tableColumnDataManutencao;
	
	@FXML
	private TableColumn<Sabres, String> tableColumnResponsavel;
	
	@FXML
	private Button btnNew;
	
	@FXML 
	public void onBtnNewAction() {
		System.out.println("onBtnNewAction");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializaNodes();
	}

	private void initializaNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
		tableColumnDataFabricacao.setCellValueFactory(new PropertyValueFactory<>("dataFabricacao"));
		tableColumnSituacao.setCellValueFactory(new PropertyValueFactory<>("situacao"));
		tableColumnJedi.setCellValueFactory(new PropertyValueFactory<>("jedi"));
		tableColumnModeloBotao.setCellValueFactory(new PropertyValueFactory<>("modeloBotao"));
		tableColumnSistema.setCellValueFactory(new PropertyValueFactory<>("sistema"));
		tableColumnGalaxia.setCellValueFactory(new PropertyValueFactory<>("galaxia"));
		tableColumnModeloSensor.setCellValueFactory(new PropertyValueFactory<>("modeloSensor"));
		tableColumnValidadeSensor.setCellValueFactory(new PropertyValueFactory<>("validadeSensor"));
		tableColumnIdManutencao.setCellValueFactory(new PropertyValueFactory<>("idManutencao"));
		tableColumnDataManutencao.setCellValueFactory(new PropertyValueFactory<>("dataManutencao"));
		tableColumnResponsavel.setCellValueFactory(new PropertyValueFactory<>("responsavel"));
		
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewSabres.prefHeightProperty().bind(stage.heightProperty());
		
	}

}
