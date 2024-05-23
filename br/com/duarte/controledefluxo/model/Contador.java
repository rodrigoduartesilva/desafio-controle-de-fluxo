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

    public void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        int calculaDiferenca = segundoNumero - primeiroNumero;


        if(primeiroNumero > segundoNumero) {
            throw new ParametrosInvalidosException();
        } else {
            for (int i = 0; i < calculaDiferenca; i++) {
                System.out.println("Imprimindo o número " + (i + 1));
            }
        }
    }
}
