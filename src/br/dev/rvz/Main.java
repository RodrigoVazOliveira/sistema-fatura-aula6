package br.dev.rvz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       try {
           Sistema.executar();
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
    }
}
