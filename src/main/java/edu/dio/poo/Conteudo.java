package edu.dio.poo;

public abstract class Conteudo {
    private String titulo;
    private String descricao;
    private Double XP_PADRAO = 10d;

    public abstract Double calcularXP();
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getXP_PADRAO() {
        return XP_PADRAO;
    }
}
