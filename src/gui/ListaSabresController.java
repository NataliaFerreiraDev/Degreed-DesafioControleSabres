package gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Modelo;
import model.entities.Sabres;
import model.entities.Situacao;
import model.services.SabresService;

public class ListaSabresController implements Initializable {
	
	private SabresService service;
	
	@FXML
	private TableView<Sabres> tableViewSabres;
	
	@FXML
	private TableColumn<Sabres, Integer> tableColumnId;
	
	@FXML
	private TableColumn<Sabres, Modelo> tableColumnModelo;
	
	@FXML
	private TableColumn<Sabres, String> tableColumnDataFabricacao;
	
	@FXML
	private TableColumn<Sabres, Situacao> tableColumnSituacao;
	
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
	
	private ObservableList<Sabres> obsList;
	
	public void setSabresService(SabresService service) {
		this.service = service;
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
		
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewSabres.prefHeightProperty().bind(stage.heightProperty());
	}
	
	public void updateTableViewSabres() {
		if(service == null) {
			throw new IllegalStateException("Service was null");
		}
		List<Sabres> list = service.findAll();
		obsList = FXCollections.observableArrayList(list);
		tableViewSabres.setItems(obsList);
	}

}
