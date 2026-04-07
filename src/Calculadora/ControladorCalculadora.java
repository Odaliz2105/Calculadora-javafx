package Calculadora;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControladorCalculadora {

    @FXML
    private TextField txtN1;

    @FXML
    private TextField txtN2;

    @FXML
    private Label lblResultado;

    private Modelo modelo = new Modelo();

    @FXML
    public void sumar() {
        double n1 = Double.parseDouble(txtN1.getText());
        double n2 = Double.parseDouble(txtN2.getText());
        lblResultado.setText(String.valueOf(modelo.sumar(n1, n2)));
    }

    @FXML
    public void restar() {
        double n1 = Double.parseDouble(txtN1.getText());
        double n2 = Double.parseDouble(txtN2.getText());
        lblResultado.setText(String.valueOf(modelo.restar(n1, n2)));
    }

    @FXML
    public void multiplicar() {
        double n1 = Double.parseDouble(txtN1.getText());
        double n2 = Double.parseDouble(txtN2.getText());
        lblResultado.setText(String.valueOf(modelo.multiplicar(n1, n2)));
    }

    @FXML
    public void dividir() {
        double n1 = Double.parseDouble(txtN1.getText());
        double n2 = Double.parseDouble(txtN2.getText());
        lblResultado.setText(String.valueOf(modelo.dividir(n1, n2)));
    }
}