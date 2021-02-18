package br.dev.rvz;

import java.util.Scanner;

public class Sistema {
    public static void menu() {
        String mensagem = "1. Pesquisar por e-mail o consumidor\n";
        System.out.println(mensagem);
    }


    private static Fatura pesquisarFatura() throws Exception {
        System.out.println("Digite o email: ");
        String email = new Scanner(System.in).nextLine();
        return ServicoFAtura.pesquisarFaturaPeloEmailDoConsumidor(email);
    }

}
