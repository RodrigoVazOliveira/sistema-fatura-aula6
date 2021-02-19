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

 
}
