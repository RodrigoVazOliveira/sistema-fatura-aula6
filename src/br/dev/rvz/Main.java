package br.dev.rvz;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       boolean continuar = true;

        try {
            ServicoConsumidor.lerDadosConsumidor();
            ServicoFatura.lerDadosFatura();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        while (continuar) {
           try {
               continuar = Sistema.isExecutar();
               Sistema.executar();
           } catch (Exception e) {
               System.out.println(e.getMessage());
           }
       }
    }
}
