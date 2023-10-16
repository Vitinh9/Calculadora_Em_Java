package calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tela extends JFrame implements ActionListener {
    protected JButton btn00, btn01, btn02, btn03, btn04, btn05, btn06, btn07, btn08, btn09, btnIgual, btnAdicao, btnVirgula, btnSubtracao, btnMultiplicacao, btnDivisao, btnCe, btnC;
    protected JTextField txtResult;


    public Tela() {
        this.setLayout(null);
        this.setResizable(false);
        this.setTitle("..::: Minha Calculadora :::.."); // Coloca um titulo na tela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);   // Quando clicar no 'X' de fechar e vai encerrar o processo.
        this.setComponentes();
        this.setAcoesBotoes();
        this.setFonte(new Font("Courier New", Font.PLAIN, 40));
        this.setCorComponente(Color.darkGray);
        this.setCorFonte(Color.white);
        this.setTexto();
        this.setVisible(true); // Isto é o que faz a tela abrir\aparecer
    }

    private void setComponentes() {
        int coluna = 10;
        int linha = 10;
        int alturaMaxima = 750;
        int larguraMaxima = 500;
        int largura = (larguraMaxima / 4) - coluna;
        int altura = (alturaMaxima / 6) - linha;


        this.setBounds(750, 250, larguraMaxima, alturaMaxima); // Coluna , Linha , Largura e Altura
        btn00 = new JButton();
        btn01 = new JButton();
        btn02 = new JButton();
        btn03 = new JButton();
        btn04 = new JButton();
        btn05 = new JButton();
        btn06 = new JButton();
        btn07 = new JButton();
        btn08 = new JButton();
        btn09 = new JButton();
        btnIgual = new JButton();
        btnAdicao = new JButton();
        btnVirgula = new JButton();
        btnSubtracao = new JButton();
        btnMultiplicacao = new JButton();
        btnDivisao = new JButton();
        btnCe = new JButton();
        btnC = new JButton();
        txtResult = new JTextField();

        int segLinha = altura + (linha * 2);
        int priColuna = coluna + (coluna / 2);
        int segColuna = priColuna + largura;
        int terColuna = segColuna + largura;
        int quaColuna = terColuna + largura;
        int terLinha = segLinha + altura;
        int quaLinha = terLinha + altura;
        int quiLinha = quaLinha + altura;
        int sexLinha = quiLinha + altura;


        // Display \ Primeiro Linha
        txtResult.setBounds(priColuna, linha, largura * 4 - coluna, altura);
        // Os quatro primeiros botão \ Segunda Linha
        btnCe.setBounds(priColuna, segLinha, (largura * 2) - coluna, altura - linha);
        btnC.setBounds(terColuna, segLinha, largura - coluna, altura - linha);
        btnDivisao.setBounds(quaColuna, segLinha, largura - coluna, altura - linha);
        btn07.setBounds(priColuna, terLinha, largura - coluna, altura - linha);
        btn08.setBounds(segColuna, terLinha, largura - coluna, altura - linha);
        btn09.setBounds(terColuna, terLinha, largura - coluna, altura - linha);
        btnMultiplicacao.setBounds(quaColuna, terLinha, largura - coluna, altura - linha);
        btn04.setBounds(priColuna, quaLinha, largura - coluna, altura - linha);
        btn05.setBounds(segColuna, quaLinha, largura - coluna, altura - linha);
        btn06.setBounds(terColuna, quaLinha, largura - coluna, altura - linha);
        btnSubtracao.setBounds(quaColuna, quaLinha, largura - coluna, altura - linha);
        btn01.setBounds(priColuna, quiLinha, largura - coluna, altura - linha);
        btn02.setBounds(segColuna, quiLinha, largura - coluna, altura - linha);
        btn03.setBounds(terColuna, quiLinha, largura - coluna, altura - linha);
        btnAdicao.setBounds(quaColuna, quiLinha, largura - coluna, altura - linha);
        btn00.setBounds(priColuna, sexLinha, (largura * 2) - coluna, altura - linha);
        btnVirgula.setBounds(terColuna, sexLinha, largura - coluna, altura - linha);
        btnIgual.setBounds(quaColuna, sexLinha, largura - coluna, altura - linha);


        txtResult.setEditable(false);
        txtResult.setHorizontalAlignment(txtResult.RIGHT);

        this.add(btn00);// Digo que o botão será adicionado a minha tela
        this.add(btn01);
        this.add(btn02);
        this.add(btn03);
        this.add(btn04);
        this.add(btn05);
        this.add(btn06);
        this.add(btn07);
        this.add(btn08);
        this.add(btn09);
        this.add(btnIgual);
        this.add(btnSubtracao);
        this.add(btnAdicao);
        this.add(btnVirgula);
        this.add(btnMultiplicacao);
        this.add(btnDivisao);
        this.add(btnCe);
        this.add(btnC);
        this.add(txtResult);

    }
    private void setTexto() {
        // Descrição do meu botão
        btn00.setText("0");
        btn01.setText("1");
        btn02.setText("2");
        btn03.setText("3");
        btn04.setText("4");
        btn05.setText("5");
        btn06.setText("6");
        btn07.setText("7");
        btn08.setText("8");
        btn09.setText("9");
        btnIgual.setText("=");
        btnAdicao.setText("+");
        btnVirgula.setText(",");
        btnSubtracao.setText("-");
        btnMultiplicacao.setText("*");
        btnDivisao.setText("/");
        btnCe.setText("CE");
        btnC.setText("C");
        txtResult.setText("");

    }

    private void setFonte(Font fontePadrao) {
        txtResult.setFont(fontePadrao);
        btn00.setFont(fontePadrao);
        btn01.setFont(fontePadrao);
        btn02.setFont(fontePadrao);
        btn03.setFont(fontePadrao);
        btn04.setFont(fontePadrao);
        btn05.setFont(fontePadrao);
        btn06.setFont(fontePadrao);
        btn07.setFont(fontePadrao);
        btn08.setFont(fontePadrao);
        btn09.setFont(fontePadrao);
        btnIgual.setFont(fontePadrao);
        btnAdicao.setFont(fontePadrao);
        btnVirgula.setFont(fontePadrao);
        btnSubtracao.setFont(fontePadrao);
        btnMultiplicacao.setFont(fontePadrao);
        btnDivisao.setFont(fontePadrao);
        btnCe.setFont(fontePadrao);
        btnC.setFont(fontePadrao);
        txtResult.setFont(fontePadrao);
    }

    private void setCorComponente(Color cor) {
        txtResult.setBackground(cor);
        btn00.setBackground(cor);
        btn01.setBackground(cor);
        btn02.setBackground(cor);
        btn03.setBackground(cor);
        btn04.setBackground(cor);
        btn05.setBackground(cor);
        btn06.setBackground(cor);
        btn07.setBackground(cor);
        btn08.setBackground(cor);
        btn09.setBackground(cor);
        btnIgual.setBackground(cor);
        btnAdicao.setBackground(cor);
        btnVirgula.setBackground(cor);
        btnSubtracao.setBackground(cor);
        btnMultiplicacao.setBackground(cor);
        btnDivisao.setBackground(cor);
        btnCe.setBackground(cor);
        btnC.setBackground(cor);
    }

    private void setCorFonte(Color cor) {
        txtResult.setForeground(cor);
        btn00.setForeground(cor);
        btn01.setForeground(cor);
        btn02.setForeground(cor);
        btn03.setForeground(cor);
        btn04.setForeground(cor);
        btn05.setForeground(cor);
        btn06.setForeground(cor);
        btn07.setForeground(cor);
        btn08.setForeground(cor);
        btn09.setForeground(cor);
        btnIgual.setForeground(cor);
        btnAdicao.setForeground(cor);
        btnVirgula.setForeground(cor);
        btnSubtracao.setForeground(cor);
        btnMultiplicacao.setForeground(cor);
        btnDivisao.setForeground(cor);
        btnCe.setForeground(cor);
        btnC.setForeground(cor);
    }
    private void setAcoesBotoes(){
        btn00.addActionListener(this);
        btn01.addActionListener(this);
        btn02.addActionListener(this);
        btn03.addActionListener(this);
        btn04.addActionListener(this);
        btn05.addActionListener(this);
        btn06.addActionListener(this);
        btn07.addActionListener(this);
        btn08.addActionListener(this);
        btn09.addActionListener(this);
        btnIgual.addActionListener(this);
        btnAdicao.addActionListener(this);
        btnVirgula.addActionListener(this);
        btnSubtracao.addActionListener(this);
        btnMultiplicacao.addActionListener(this);
        btnDivisao.addActionListener(this);
        btnCe.addActionListener(this);
        btnC.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {


    }

}
