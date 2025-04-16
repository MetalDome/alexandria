package Servico;

import Enum.StatusAtual;

public class InformacoesBasicas {

    private String nome;
    private String cliente;
    private String autorPrincipal;
    private String motivoDoProjeto;
    private StatusAtual statusAtual; // Enum StatusAtual
    private String linkDoRepositorio;
    private String dificuldadeTecnicas;

    public InformacoesBasicas() {
    }

    public InformacoesBasicas(String nome, String cliente, String autorPrincipal, String motivoDoProjeto, StatusAtual statusAtual, String linkDoRepositorio, String dificuldadeTecnicas) {
        this.nome = nome;
        this.cliente = cliente;
        this.autorPrincipal = autorPrincipal;
        this.motivoDoProjeto = motivoDoProjeto;
        this.statusAtual = statusAtual;
        this.linkDoRepositorio = linkDoRepositorio;
        this.dificuldadeTecnicas = dificuldadeTecnicas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getAutorPrincipal() {
        return autorPrincipal;
    }

    public void setAutorPrincipal(String autorPrincipal) {
        this.autorPrincipal = autorPrincipal;
    }

    public String getMotivoDoProjeto() {
        return motivoDoProjeto;
    }

    public void setMotivoDoProjeto(String motivoDoProjeto) {
        this.motivoDoProjeto = motivoDoProjeto;
    }

    public StatusAtual getStatusAtual() {
        return statusAtual;
    }

    public void setStatusAtual(StatusAtual statusAtual) {
        this.statusAtual = statusAtual;
    }

    public String getLinkDoRepositorio() {
        return linkDoRepositorio;
    }

    public void setLinkDoRepositorio(String linkDoRepositorio) {
        this.linkDoRepositorio = linkDoRepositorio;
    }

    public String getDificuldadeTecnicas() {
        return dificuldadeTecnicas;
    }

    public void setDificuldadeTecnicas(String dificuldadeTecnicas) {
        this.dificuldadeTecnicas = dificuldadeTecnicas;
    }

    @Override
    public String toString() {
        return "InformacoesBasicas{" +
                "nome='" + nome + '\'' +
                ", cliente='" + cliente + '\'' +
                ", autorPrincipal='" + autorPrincipal + '\'' +
                ", motivoDoProjeto='" + motivoDoProjeto + '\'' +
                ", statusAtual=" + statusAtual +
                ", linkDoRepositorio='" + linkDoRepositorio + '\'' +
                ", dificuldadeTecnicas='" + dificuldadeTecnicas + '\'' +
                '}';
    }
}
