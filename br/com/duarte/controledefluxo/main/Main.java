package br.com.duarte.controledefluxo.main;

import br.com.duarte.controledefluxo.model.Contador;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int parametroUm;
        int parametroDois;

        Scanner scanner = new Scanner(System.in);
        Contador contador = new Contador();

        System.out.print("Digite o primeiro parâmetro: ");
        parametroUm = contador.setPrimeiroNumero(scanner.nextInt());

        System.out.print("Digite o segundo parâmetro: ");
        parametroDois = contador.setSegundoNumero(scanner.nextInt());

        contador.iterarNumeros(parametroUm, parametroDois);
    }
}
