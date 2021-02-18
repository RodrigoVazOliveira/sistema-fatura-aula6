package br.dev.rvz;

public class Consumidor {

    private String nomeCompleto;
    private String email;

    public Consumidor() {
    }

    public Consumidor(String nomeCompleto, String cpf) {
        this.nomeCompleto = nomeCompleto;
        this.email = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
