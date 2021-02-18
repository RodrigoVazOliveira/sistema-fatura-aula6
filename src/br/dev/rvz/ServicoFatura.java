package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;

public class ServicoFatura {
    private static List<Fatura> faturas = new ArrayList<>();

    public static Fatura pesquisarFaturaPeloEmailDoConsumidor(String email) throws Exception {
        for(Fatura fatura : faturas) {
            if (fatura.getConsumidor().getEmail().equalsIgnoreCase(email)) {
                return  fatura;
            }
        }
        throw new Exception("Fatura não existe!");
    }

    public static Fatura cadastrarFatura(Consumidor consumidor, double valor, String dataVemcimento) throws Exception {
        ServicoConsumidor.pesquisarConsumidorPorEmail(consumidor.getEmail());
        Fatura fatura = new Fatura(consumidor, valor, dataVemcimento);
        faturas.add(fatura);
        return fatura;
    }
}
