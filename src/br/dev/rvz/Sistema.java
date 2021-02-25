package br.dev.rvz;

import java.util.List;
import java.util.Scanner;

public class Sistema {
    public static void menu() {
        String mensagem = "1. Pesquisar por e-mail o consumidor\n";
        mensagem += "2. Cadastrar novo consumidor\n";
        mensagem += "3. Cadastrar fatura\n";
        mensagem += "4. Sair e gravar dados no arquivo";
        System.out.println(mensagem);
    }

    public static boolean executar() throws Exception {
        boolean continuar = true;
        Controle controle = new Controle();
        while (continuar) {
            menu();
            controle.selecionarOpcao(new Scanner(System.in).nextLine());
        }
        return continuar;
    }

}
