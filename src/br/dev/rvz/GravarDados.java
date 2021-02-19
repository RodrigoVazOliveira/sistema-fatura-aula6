package br.dev.rvz;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GravarDados {
    public static void gravarConsumidor(Consumidor consumidor) throws IOException {
        File file = new File(StoreData.CONSUMIDOR.getNameFile());
        if (file.createNewFile()) {
            FileWriter fileWriter = new FileWriter(StoreData.CONSUMIDOR.getNameFile(), true);
            fileWriter.write(consumidor + "\n");
            fileWriter.close();
        } else {
            FileWriter fileWriter = new FileWriter(StoreData.CONSUMIDOR.getNameFile(), true);
            fileWriter.write(consumidor + "\n");
            fileWriter.close();
        }
    }

    public static void gravarFatura(Fatura fatura) throws IOException {
        File file = new File(StoreData.FATURA.getNameFile());
        if (file.createNewFile()) {
            FileWriter fileWriter = new FileWriter(StoreData.FATURA.getNameFile(), true);
            fileWriter.write(fatura + "\n");
            fileWriter.close();
        } else {
            FileWriter fileWriter = new FileWriter(StoreData.FATURA.getNameFile(), true);
            fileWriter.write(fatura + "\n");
            fileWriter.close();
        }
    }
}
