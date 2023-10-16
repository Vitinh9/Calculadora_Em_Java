package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends Tela implements ActionListener {
    private double valorAtual = 0, valoresAntigos = 0;
    String inteiro = "", decimal = "", strResult = "";
    private boolean virgula = false, adiciona = false, subtrai = false, multiplica = false, divide = false;

    Calculos c = new Calculos();

    public Calculadora() {

    }

    private void setResetValores() {
        strResult = "";
        decimal = "";
        inteiro = "";
       // valorAtual = 0;
        virgula = false;
    }

    private void setConverteDecimal(String strNumeroPressionado) {
        if (virgula) {
            decimal += Integer.parseInt(strNumeroPressionado);
        } else {
            inteiro += Integer.parseInt(strNumeroPressionado);
        }
        strResult = inteiro + "." + decimal;
        valorAtual = Double.parseDouble(strResult);
    }

    private void setResetSinais() {
        adiciona = false;
        subtrai = false;
        multiplica = false;
        divide = false;
        virgula = false;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCe) {
            setResetValores();
            setResetSinais();
            valoresAntigos = 0;
            valorAtual = 0;
        } else if (e.getSource() == btnC) {
            setResetValores();
            valorAtual=0;
        } else if (e.getSource() == btn00) {
            setConverteDecimal(btn00.getText());
        } else if (e.getSource() == btn01) {
            setConverteDecimal(btn01.getText());
        } else if (e.getSource() == btn02) {
            setConverteDecimal(btn02.getText());
        } else if (e.getSource() == btn03) {
            setConverteDecimal(btn03.getText());
        } else if (e.getSource() == btn04) {
            setConverteDecimal(btn04.getText());
        } else if (e.getSource() == btn05) {
            setConverteDecimal(btn05.getText());
        } else if (e.getSource() == btn06) {
            setConverteDecimal(btn06.getText());
        } else if (e.getSource() == btn07) {
            setConverteDecimal(btn07.getText());
        } else if (e.getSource() == btn08) {
            setConverteDecimal(btn08.getText());
        } else if (e.getSource() == btn09) {
            setConverteDecimal(btn09.getText());
        } else if (e.getSource() == btnAdicao) {
            resultado();
            adiciona = true;
            valoresAntigos = valorAtual;
            setResetValores();

        } else if (e.getSource() == btnSubtracao) {
            resultado();
            subtrai = true;
            valoresAntigos = valorAtual;
            setResetValores();

        } else if (e.getSource() == btnMultiplicacao) {
            resultado();
            multiplica = true;
            valoresAntigos = valorAtual;
            setResetValores();

        } else if (e.getSource() == btnDivisao) {
            resultado();
            divide = true;
            valoresAntigos = valorAtual;
            setResetValores();
        } else if (e.getSource() == btnVirgula) {
            virgula = true;
        } else if (e.getSource() == btnIgual) {
            resultado();
        }
        txtResult.setText(Double.toString(valorAtual));
    }


    private void resultado() {
        if (adiciona)
            valorAtual = c.soma(valoresAntigos, valorAtual);
        else if (subtrai)
            valorAtual = c.subitracao(valoresAntigos, valorAtual);
        else if (multiplica)
            valorAtual = c.multiplicacao(valoresAntigos, valorAtual);
        else if (divide)
            valorAtual = c.divisao(valoresAntigos, valorAtual);
        setResetSinais();
    }
}
