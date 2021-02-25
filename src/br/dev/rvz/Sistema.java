package br.dev.rvz;

import java.util.List;
import java.util.Scanner;

public class Sistema {

    private static boolean executar = true;

    public static void setExecutar(boolean executar) {
        Sistema.executar = executar;
    }

    public static boolean isExecutar() {
        return executar;
    }

    public static void menu() {
        String mensagem = "1. Pesquisar por e-mail o consumidor\n";
        mensagem += "2. Cadastrar novo consumidor\n";
        mensagem += "3. Cadastrar fatura\n";
        mensagem += "4. Sair e gravar dados no arquivo";
        System.out.println(mensagem);
    }

    public static void executar() throws Exception {
        Controle controle = new Controle();
        while (executar) {
            menu();
            controle.selecionarOpcao(new Scanner(System.in).nextLine());
        }
    }

}
