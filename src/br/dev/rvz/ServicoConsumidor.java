package br.dev.rvz;

import java.util.ArrayList;
import java.util.List;

public class ServicoConsumidor {
    private static List<Consumidor> consumidores = new ArrayList<>();

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
}
