package gui;

import entities.Calculadora;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalcController {
	Calculadora calc = new Calculadora(0, 0, ' ');
	boolean next = false;
	char esc;
	double resultado;
	@FXML
	public void alterna() {
		if(labelOperacao.getText()!=" ") {
			next=true;
		}
	}

	@FXML
	private TextField txtNumeroUm;
	@FXML
	private TextField txtNumeroDois;
	@FXML
	private Label labelOperacao;
	@FXML
	private Label labelResultado;

	@FXML
	private Button zerar;
	@FXML
	public void onBtZerar() {
		txtNumeroUm.setText("");
		txtNumeroDois.setText("");
		next = false;
		labelResultado.setText("");
	}
	
	
	@FXML
	private Button um;

	@FXML
	public void onBtUmAction() {
		if (next == false) {
			txtNumeroUm.setText(txtNumeroUm.getText() + "1");
		} else {
			txtNumeroDois.setText(txtNumeroDois.getText() + "1");
		}
	}

	@FXML
	private Button dois;

	@FXML
	public void onBtDoisAction() {
		if (next == false) {
			txtNumeroUm.setText(txtNumeroUm.getText() + "2");
		} else {
			txtNumeroDois.setText(txtNumeroDois.getText() + "2");
		}
	}

	@FXML
	private Button tres;

	@FXML
	public void onBtTresAction() {
		if (next == false) {
			txtNumeroUm.setText(txtNumeroUm.getText() + "3");
		} else {
			txtNumeroDois.setText(txtNumeroDois.getText() + "3");
		}
	}

	@FXML
	private Button quatro;

	@FXML
	public void onBtQuatroAction() {
		if (next == false) {
			txtNumeroUm.setText(txtNumeroUm.getText() + "4");
		} else {
			txtNumeroDois.setText(txtNumeroDois.getText() + "4");
		}
	}

	@FXML
	private Button cinco;

	@FXML
	public void onBtCincoAction() {
		if (next == false) {
			txtNumeroUm.setText(txtNumeroUm.getText() + "5");
		} else {
			txtNumeroDois.setText(txtNumeroDois.getText() + "5");
		}
	}

	@FXML
	private Button seis;

	@FXML
	public void onBtSeisAction() {
		if (next == false) {
			txtNumeroUm.setText(txtNumeroUm.getText() + "6");
		} else {
			txtNumeroDois.setText(txtNumeroDois.getText() + "6");
		}
	}

	@FXML
	private Button sete;

	@FXML
	public void onBtSeteAction() {
		if (next == false) {
			txtNumeroUm.setText(txtNumeroUm.getText() + "7");
		} else {

			txtNumeroDois.setText(txtNumeroDois.getText() + "7");
		}
	}

	@FXML
	private Button oito;

	@FXML
	public void onBtOitoAction() {
		if (next == false) {
			txtNumeroUm.setText(txtNumeroUm.getText() + "8");
		} else {
			txtNumeroDois.setText(txtNumeroDois.getText() + "8");
		}
	}

	@FXML
	private Button nove;

	@FXML
	public void onBtNoveAction() {
		if (next == false) {
			txtNumeroUm.setText(txtNumeroUm.getText() + "9");
		} else {
			txtNumeroDois.setText(txtNumeroDois.getText() + "9");
		}
	}

	@FXML
	private Button zero;

	@FXML
	public void onBtZeroAction() {
		if (next == false) {
			txtNumeroUm.setText(txtNumeroUm.getText() + "0");
		} else {
			txtNumeroDois.setText(txtNumeroDois.getText() + "0");
		}
	}

	@FXML
	private Button adicao;

	@FXML
	public void onBtAdicao() {
		next = true;
	    esc = 'A';
		labelOperacao.setText("+");
	}

	@FXML
	private Button subtracao;

	@FXML
	public void onBtSub() {
		labelOperacao.setText("-");
		next = true;
		esc = 'S';
		
		
	}

	@FXML
	private Button div;

	@FXML
	public void onBtDiv() {
		next = true;
		esc = 'D';
		labelOperacao.setText("/");
	}

	@FXML
	private Button multi;

	@FXML
	public void onBtMulti() {
		next = true;
	    esc = 'M';
		labelOperacao.setText("*");
	}

	@FXML
	private Button igual;

	@FXML
	public void onBtIgual() {
		if (esc == 'A') {
			int um = Integer.parseInt(txtNumeroUm.getText());
			int dois = Integer.parseInt(txtNumeroDois.getText());
			calc = new Calculadora(um, dois, 'A');
			resultado = calc.soma();
			
			labelResultado.setText(String.format("%.2f",resultado) );
		} else if (esc == 'S') {
			int um = Integer.parseInt(txtNumeroUm.getText());
			int dois = Integer.parseInt(txtNumeroDois.getText());
			calc = new Calculadora(um, dois, 'S');
			resultado = calc.sub();
			labelResultado.setText(String.format("%.2f", resultado));
		} else if (esc == 'D') {
			int um = Integer.parseInt(txtNumeroUm.getText());
			int dois = Integer.parseInt(txtNumeroDois.getText());
			calc = new Calculadora(um, dois, 'D');
			resultado = calc.div();
			labelResultado.setText(String.format("%.2f", resultado));
		} else if (esc == 'M') {
			int um = Integer.parseInt(txtNumeroUm.getText());
			int dois = Integer.parseInt(txtNumeroDois.getText());
			calc = new Calculadora(um, dois, 'M');
			resultado = calc.multi();
			labelResultado.setText(String.format("%.2f", resultado));
		}
	}

}
