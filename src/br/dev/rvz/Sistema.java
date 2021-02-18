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

    public static void executar() throws Exception {
        boolean continuar = true;

        while (continuar) {
            menu();
            String resposta = new Scanner(System.in).nextLine();

            if (resposta.equals("1")) {
                Fatura fatura = pesquisarFatura();
            }
        }
    }

}