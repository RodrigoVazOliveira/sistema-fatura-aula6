package br.dev.rvz;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Controle {
    HashMap<String, String> opcoes = new HashMap<>();

    public Controle() {
        opcoes.put("1","opcaoUm");
        opcoes.put("2","opcaoDois");
        opcoes.put("3","opcaoTres");
        opcoes.put("4","opcaoQuatro");
    }

    public void selecionarOpcao(String opcao) throws Exception {
        Method method = this.getClass().getMethod(opcoes.get(opcao));
        method.invoke(this);

    }

    public void opcaoUm() throws Exception {
        List<Fatura> fatura = pesquisarFatura();
        System.out.println(fatura);
    }

    public void opcaoDois() throws Exception {
        Consumidor consumidor = cadastrarConsumidor();
        System.out.println(consumidor);
    }

    public void opcaoTres() throws Exception {
        Fatura fatura = cadastrarFatura();
        System.out.println(fatura);
    }

    public void opcaoQuatro() throws IOException {
        ServicoConsumidor.gravarListaConsumidorNoArquivo();
        ServicoFatura.gravarListaDeFaturaNoArquivo();
        Sistema.setExecutar(false);
    }

    private List<Fatura> pesquisarFatura() throws Exception {
        System.out.println("Digite o email: ");
        String email = new Scanner(System.in).nextLine();
        return ServicoFatura.pesquisarFaturaPeloEmailDoConsumidor(email);
    }

    private Consumidor cadastrarConsumidor() throws Exception {
        System.out.println("Por favor, digite o nome completo e o email: ");
        Consumidor consumidor = ServicoConsumidor.cadastrarConsumidor(new Scanner(System.in).nextLine(),
                new Scanner(System.in).nextLine());
        return  consumidor;
    }

    private  Fatura cadastrarFatura() throws Exception {
        System.out.println("Por favor, digite o email, valor e data de vencimento:");
        Fatura fatura = ServicoFatura.cadastrarFatura(new Scanner(System.in).nextLine(),
                new Scanner(System.in).nextDouble(),
                new Scanner(System.in).nextLine());
        return fatura;
    }
}
