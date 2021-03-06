package br.dev.rvz;

import java.io.Serializable;

public class Fatura implements Serializable {
    private Consumidor consumidor;
    private double valor;
    private String dataVencimento;

    public Fatura(Consumidor consumidor, double valor, String dataVencimento) {
        this.consumidor = consumidor;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public Consumidor getConsumidor() {
        return consumidor;
    }

    public void setConsumidor(Consumidor consumidor) {
        this.consumidor = consumidor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        return "\nFatura{" +
                "consumidor=" + consumidor +
                ", valor=" + valor +
                ", dataVencimento='" + dataVencimento + '\'' +
                '}';
    }
}