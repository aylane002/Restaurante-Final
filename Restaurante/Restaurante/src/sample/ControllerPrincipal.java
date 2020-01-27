package sample;


import javafx.collections.*;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class ControllerPrincipal {

    @FXML
    private ComboBox<String> comboBoxOcupadas;

    @FXML
    private Button botaoReservarMesa;

    @FXML
    private ComboBox<Funcionario> comboBoxGarcom = new ComboBox<Funcionario>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    ObservableList<Funcionario> obsFuncionario;

    @FXML
    private ListView<Mesa> listViewOcupadas;

    @FXML
    private ListView<Mesa> listViewReservadas;

    @FXML
    private Button botaoDesocuparMesa;

    @FXML
    private ListView<Mesa> listViewLivres;

    @FXML
    private Button botaoAbrirMesa;

    @FXML
    private ComboBox<String> comboBoxPedidos;

    private List<Mesa> mesas = new ArrayList<>();
    private List<Mesa> mesasOcupadas = new ArrayList<>();

    private ObservableList<Mesa> obsMesas;
    private ObservableList<Mesa> obsMesasOcupadas;
    private Object FXCollections;

    public ControllerPrincipal(){
        mesas = new ArrayList<>();


    }

    public void carregarMesas(){
        Mesa mesa1 = new Mesa(1);

        Mesa mesa2 = new Mesa(2);
        Mesa mesa3 = new Mesa(3);
        Mesa mesa4 = new Mesa(4);
        Mesa mesa5 = new Mesa(5);

        mesas.add(mesa1);
        mesas.add(mesa2);
        mesas.add(mesa3);
        mesas.add(mesa4);
        mesas.add(mesa5);

        obsMesas = FXCollections.observableArrayList((mesas));
        obsMesasOcupadas = FXCollections.observableArrayList((mesas));
        listViewLivres.setItems(obsMesasOcupadas);
    }
    @FXML
    public void initialize(){
        System.out.println("ihuuuu");
        carregarMesas();
        Funcionario func1 = new Funcionario("João", 22, "opa");
        funcionarios.add(func1);


        

    }
}
