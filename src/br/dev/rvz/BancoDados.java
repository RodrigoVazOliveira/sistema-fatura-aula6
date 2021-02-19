package br.dev.rvz;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BancoDados {
    public static void gravarConsumidor(List<Consumidor> listaConsumidor) throws IOException {
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

    public static List<Fatura> lerFaturas() throws IOException {
        List<Fatura> lista = new ArrayList<>();
        File file = new File(StoreData.FATURA.getNameFile());
        if (file.exists()) {
            ObjectInputStream objectInputStream = new ObjectInputStream(
                    new FileInputStream(file)
            );
            lista = (List<Fatura>) objectInputStream.readObject();
        } else {
            throw new IOException("Arquivo não existe!");
        }
    }
}
