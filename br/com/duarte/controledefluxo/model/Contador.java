package br.com.duarte.controledefluxo.model;

public class Contador {
    private int primeiroNumero;
    private int segundoNumero;

    public int getPrimeiroNumero() {
        return primeiroNumero;
    }

    public int setPrimeiroNumero(int primeiroNumero) {
        this.primeiroNumero = primeiroNumero;
        return primeiroNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public int setSegundoNumero(int segundoNumero) {
        this.segundoNumero = segundoNumero;
        return segundoNumero;
    }

    public void iterarNumeros(int primeiroNumero, int segundoNumero) {
        int calculaDiferenca = segundoNumero - primeiroNumero;

        if(primeiroNumero > segundoNumero) {
            System.out.println("O primeiro número deve ser menor que o segundo número");
        } else {
            for (int i = 0; i < calculaDiferenca; i++) {
                System.out.println("Imprimindo o número " + (i + 1));
            }
        }
    }
}
