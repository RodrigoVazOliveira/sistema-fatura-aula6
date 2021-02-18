package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;

public class ServicoFAtura {
    private static List<Fatura> faturas = new ArrayList<>();

    public static Fatura pesquisarFaturaPeloEmailDoConsumidor(String email) {
        Fatura faturaRetorno = null;
        for(Fatura fatura : faturas) {
            if (fatura.getConsumidor().getEmail().equalsIgnoreCase(email)) {
                faturaRetorno = fatura;
            }
        }
        return faturaRetorno;
    }
}
