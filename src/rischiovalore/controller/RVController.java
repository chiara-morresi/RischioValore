package rischiovalore.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import rischiovalore.model.Dato;

public class RVController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> boxFamProdotto;

    @FXML
    private ComboBox<String> boxSottofamProdotto;

    @FXML
    private ComboBox<String> boxMarchi;
    
    @FXML
    private ListView<String> listMarchi;

    @FXML
    private TextField txtCodiceProdotto;

    @FXML
    private Label lblMessaggio;

    @FXML
    private TableView<Dato> tableDati;

    @FXML
    private TableColumn<Dato, String> codCliente;

    @FXML
    private TableColumn<Dato, String> sottofamiglia;

    @FXML
    private TableColumn<Dato, String> marchio;

    @FXML
    private TableColumn<Dato, Integer> codProduttore;

    @FXML
    private TableColumn<Dato, Integer> codProdotto;

    @FXML
    private TableColumn<Dato, Float> listino;

    @FXML
    private TableColumn<Dato, Float> fatturatoRicambisti;

    @FXML
    private TableColumn<Dato, Float> volumeRicambisti;

    @FXML
    private TableColumn<Dato, Float> kgAcquisto;

    @FXML
    private TableColumn<Dato, Float> fatturato;

    @FXML
    private TableColumn<Dato, Float> volumeVenduto;

    @FXML
    private TableColumn<Dato, String> data;

    @FXML
    private TableColumn<Dato, Integer> regione;

    @FXML
    void doCerca(ActionEvent event) {

    }

    @FXML
    void doFiltra(ActionEvent event) {

    }

    @FXML
    void doMarchi(ActionEvent event) {

    }

    @FXML
    void doMostra(ActionEvent event) {

    	boxFamProdotto.getItems().addAll("Prova", "poli", "casa");
    }
    
    @FXML
    void doMostraSottofamiglia(MouseEvent event) {
    	String e = boxFamProdotto.getValue();
    	boxSottofamProdotto.getItems().add(e);
    	
    }


    @FXML
    void doReset(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert boxFamProdotto != null : "fx:id=\"boxFamProdotto\" was not injected: check your FXML file 'RV.fxml'.";
        assert boxSottofamProdotto != null : "fx:id=\"boxSottofamProdotto\" was not injected: check your FXML file 'RV.fxml'.";
        assert boxMarchi != null : "fx:id=\"boxMarchi\" was not injected: check your FXML file 'RV.fxml'.";
        assert listMarchi != null : "fx:id=\"listMarchi\" was not injected: check your FXML file 'RV.fxml'.";
        assert txtCodiceProdotto != null : "fx:id=\"txtCodiceProdotto\" was not injected: check your FXML file 'RV.fxml'.";
        assert lblMessaggio != null : "fx:id=\"lblMessaggio\" was not injected: check your FXML file 'RV.fxml'.";
        assert tableDati != null : "fx:id=\"tableDati\" was not injected: check your FXML file 'RV.fxml'.";
        assert codCliente != null : "fx:id=\"codCliente\" was not injected: check your FXML file 'RV.fxml'.";
        assert sottofamiglia != null : "fx:id=\"sottofamiglia\" was not injected: check your FXML file 'RV.fxml'.";
        assert marchio != null : "fx:id=\"marchio\" was not injected: check your FXML file 'RV.fxml'.";
        assert codProduttore != null : "fx:id=\"codProduttore\" was not injected: check your FXML file 'RV.fxml'.";
        assert codProdotto != null : "fx:id=\"codProdotto\" was not injected: check your FXML file 'RV.fxml'.";
        assert listino != null : "fx:id=\"listino\" was not injected: check your FXML file 'RV.fxml'.";
        assert fatturatoRicambisti != null : "fx:id=\"fatturatoRicambisti\" was not injected: check your FXML file 'RV.fxml'.";
        assert volumeRicambisti != null : "fx:id=\"volumeRicambisti\" was not injected: check your FXML file 'RV.fxml'.";
        assert kgAcquisto != null : "fx:id=\"kgAcquisto\" was not injected: check your FXML file 'RV.fxml'.";
        assert fatturato != null : "fx:id=\"fatturato\" was not injected: check your FXML file 'RV.fxml'.";
        assert volumeVenduto != null : "fx:id=\"volumeVenduto\" was not injected: check your FXML file 'RV.fxml'.";
        assert data != null : "fx:id=\"data\" was not injected: check your FXML file 'RV.fxml'.";
        assert regione != null : "fx:id=\"regione\" was not injected: check your FXML file 'RV.fxml'.";

    }
}
