package br.dev.rvz;

public enum StoreData {
    CONSUMIDOR("consumidor.txt"), FATURA("fatura.txt");
    private String nameFile;

    StoreData(String nameFile) {
        this.nameFile = nameFile;
    }

    public String getNameFile() {
        return nameFile;
    }
}
