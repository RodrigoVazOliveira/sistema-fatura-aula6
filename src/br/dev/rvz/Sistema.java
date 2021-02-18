package br.dev.rvz;

import java.util.Scanner;

public class Sistema {
    public static void menu() {
        String mensagem = "1. Pesquisar por e-mail o consumidor\n";
        mensagem += "2. Cadastrar novo consumidor\n";
        mensagem += "3. Cadastrar fatura";
        mensagem += "4. Sair";
        System.out.println(mensagem);
    }


    private static Fatura pesquisarFatura() throws Exception {
        System.out.println("Digite o email: ");
        String email = new Scanner(System.in).nextLine();
        return ServicoFatura.pesquisarFaturaPeloEmailDoConsumidor(email);
    }

    private static Consumidor cadastrarConsumidor() throws Exception {
        System.out.println("Por favor, digite o nome completo e o email: ");
        Consumidor consumidor = ServicoConsumidor.cadastrarConsumidor(new Scanner(System.in).nextLine(),
                new Scanner(System.in).nextLine());
        return  consumidor;
    }

    private static Fatura cadastrarFatura() throws Exception {
        System.out.println("Por favor, digite o email, valor e data de vencimento:");
        Fatura fatura = ServicoFatura.cadastrarFatura(new Scanner(System.in).nextLine(),
                new Scanner(System.in).nextDouble(),
                new Scanner(System.in).nextLine());
        return fatura;
    }

    public static boolean executar() throws Exception {
        boolean continuar = true;
        while (continuar) {
            menu();
            String resposta = new Scanner(System.in).nextLine();

            if (resposta.equals("1")) {
                Fatura fatura = pesquisarFatura();
                System.out.println(fatura);
            } else if (resposta.equals("2")) {
                Consumidor consumidor = cadastrarConsumidor();
                System.out.println(consumidor);
            } else if (resposta.equals("3")) {
                Fatura fatura = cadastrarFatura();
                System.out.println(fatura);
            } else if (resposta.equals("4")) {
                continuar = false;
            }
        }
        return continuar;
    }

}
