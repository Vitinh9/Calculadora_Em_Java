package calculadora;

public class Calculos {


    public double soma(double valor, double outrovalor) {
        return valor + outrovalor;
    }

    public double subitracao(double valor, double outrovalor) {
        return valor - outrovalor;
    }

    public double divisao(double divisor, double dividendo) {

        double quociente = 0;
        if (dividendo == 0) {
        } else {
            quociente = divisor / dividendo;
        }

        return quociente;
    }

    public double multiplicacao(double valor, double outrovalor) {
        return valor * outrovalor;
    }

    public double restoDaDivisao(double divisor, double dividendo) {

        double resto = 0;
        if (dividendo == 0) {
        } else {
            resto = divisor % dividendo;
        }

        return resto;
    }

}