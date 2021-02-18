package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;

public class ServicoFatura {
    private static List<Fatura> faturas = new ArrayList<>();

    public static List<Fatura> pesquisarFaturaPeloEmailDoConsumidor(String email) throws Exception {
        List<Fatura> faturas = new ArrayList<>();
        for(Fatura fatura : faturas) {
            if (fatura.getConsumidor().getEmail().equalsIgnoreCase(email)) {
                faturas.add(fatura);
            }
        }
        if (!faturas.isEmpty()) {
            return faturas;
        }
        throw new Exception("Não existe fatura para esse consumidor!");
    }

    public static Fatura cadastrarFatura(String email, double valor, String dataVemcimento) throws Exception {
        Consumidor consumidor = ServicoConsumidor.pesquisarConsumidorPorEmail(email);
        Fatura fatura = new Fatura(consumidor, valor, dataVemcimento);
        faturas.add(fatura);
        return fatura;
    }
}
