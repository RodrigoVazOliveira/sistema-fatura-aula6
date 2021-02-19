package br.dev.rvz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServicoFatura {
    private static List<Fatura> faturas = new ArrayList<>();

    public static List<Fatura> pesquisarFaturaPeloEmailDoConsumidor(String email) throws Exception {
        List<Fatura> faturasConsumidor = new ArrayList<>();
        faturasConsumidor = faturas.stream().filter(obj -> obj.getConsumidor().getEmail().equals(email))
                .collect(Collectors.toList());
/*        for(Fatura fatura : faturas) {
            if (fatura.getConsumidor().getEmail().equalsIgnoreCase(email)) {
                faturasConsumidor.add(fatura);
            }
        }*/
        if (!faturasConsumidor.isEmpty()) {
            return faturasConsumidor;
        } else {
            throw new Exception("Não existe fatura para esse consumidor!");
        }
    }

    public static Fatura cadastrarFatura(String email, double valor, String dataVemcimento) throws Exception {
        Consumidor consumidor = ServicoConsumidor.pesquisarConsumidorPorEmail(email);
        Fatura fatura = new Fatura(consumidor, valor, dataVemcimento);
        faturas.add(fatura);
        return fatura;
    }

    public static void gravarListaDeFaturaNoArquivo() throws IOException {
        BancoDados.gravarFatura(faturas);
    }

    public static void lerDadosFatura() throws IOException, ClassNotFoundException {
        faturas = BancoDados.lerFaturas();
    }
}
