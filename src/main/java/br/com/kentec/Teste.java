package br.com.kentec;

public class Teste {

    private String mensagem;
    private String nome;
    private String email;

    // Construtor vazio
    public Teste() {
    }

    // Construtor com todos os campos
    public Teste(String mensagem, String nome, String email) {
        this.mensagem = mensagem;
        this.nome = nome;
        this.email = email;
    }

    // Getters e Setters
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método toString para facilitar a exibição
    @Override
    public String toString() {
        return "Teste{" +
                "mensagem='" + mensagem + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

