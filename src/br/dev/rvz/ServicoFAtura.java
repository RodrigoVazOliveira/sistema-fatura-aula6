package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;

public class ServicoFAtura {
    private static List<Fatura> faturas = new ArrayList<>();

    public static List<Fatura> getFaturas() {
        return faturas;
    }
}
