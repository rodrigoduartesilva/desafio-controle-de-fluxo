package br.com.duarte.controledefluxo.main;

import br.com.duarte.controledefluxo.model.Contador;
import br.com.duarte.controledefluxo.model.ParametrosInvalidosException;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) throws ParametrosInvalidosException {
        int parametroUm;
        int parametroDois;

        Scanner scanner = new Scanner(System.in);
        Contador contador = new Contador();

        System.out.print("Digite o primeiro parâmetro: ");
        parametroUm = contador.setPrimeiroNumero(scanner.nextInt());

        System.out.print("Digite o segundo parâmetro: ");
        parametroDois = contador.setSegundoNumero(scanner.nextInt());

        try {
            contador.contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException error) {
            System.err.println("O segundo parâmetro deve ser maior que o primeiro parâmetro.");
            System.err.println(error);
        } finally {
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Aplicação finalizada!");
                    System.exit(0);
                }
            }, 1000L);
        }
    }
}
