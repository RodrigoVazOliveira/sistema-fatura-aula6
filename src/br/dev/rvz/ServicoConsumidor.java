package br.dev.rvz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {
    private static List<Consumidor> consumidores = new ArrayList<>();

    public static Consumidor cadastrarConsumidor(String nomeCompleto, String email) throws Exception {
        validarEmail(email);
        Consumidor consumidor = new Consumidor(nomeCompleto, email);
        consumidores.add(consumidor);
        return consumidor;
    }

    public static void validarEmail(String email) throws Exception {
        if (!email.contains("@")){
            throw new Exception("e-mail inválido!");
        }
        for(Consumidor consumidor : consumidores) {
            if (consumidor.getEmail().equals(email)) {
                throw new Exception("O E-mail " + email + " já existe");
            }
        }
    }

    public static Consumidor pesquisarConsumidorPorEmail(String email) throws Exception{
        for (Consumidor consumidor : consumidores ) {
            if (consumidor.getEmail().equalsIgnoreCase(email)) {
                return consumidor;
            }
        }
        throw new Exception("Nenhum consumidor foi localizado com e-mail " + email);
    }

    public static void gravarListaConsumidorNoArquivo() throws IOException {
        BancoDados.gravarConsumidor(consumidores);
    }

    public static void lerDadosConsumidor() throws IOException, ClassNotFoundException {
        consumidores = BancoDados.lerConsumidor();
    }
}
