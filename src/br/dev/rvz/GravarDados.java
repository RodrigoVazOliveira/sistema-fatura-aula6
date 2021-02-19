package br.dev.rvz;

import java.io.*;
import java.util.List;
import java.util.concurrent.CompletionService;

public class GravarDados {
    public static void gravarConsumidor(List<CompletionService> listaConsumidor) throws IOException {
        File file = new File(StoreData.CONSUMIDOR.getNameFile());
        file.createNewFile();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(StoreData.CONSUMIDOR.getNameFile()));
        objectOutputStream.writeObject(listaConsumidor);
        objectOutputStream.close();
    }

    public static void gravarFatura(List<Fatura> listaFatura) throws IOException {
        File file = new File(StoreData.FATURA.getNameFile());
        file.createNewFile();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(StoreData.FATURA.getNameFile()));
        objectOutputStream.writeObject(listaFatura);
        objectOutputStream.close();
    }
}
