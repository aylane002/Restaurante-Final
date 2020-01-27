package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ControllerComanda {






        @FXML
        private TableColumn<?, ?> colunaGarcom;

        @FXML
        private TableColumn<?, ?> colunaValor;

        @FXML
        private TextField textFieldDesconto;

        @FXML
        private TableColumn<?, ?> colunaPedido;

        @FXML
        private TableView<?> tabelaComanda;

        @FXML
        private Button botaoFinalizarPedido;

        @FXML
        private TextField textFieldTotal;

        @FXML
        private Button botaoAplicarDesconto;

        @FXML
        private Button botaoLiberarMesa;;



}
