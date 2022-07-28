package br.com.dio.desafio.dominio;

import java.util.Objects;

public class Atividade {

    private final String tipo;
    private final String titulo;
    private final String descricao;

    public Atividade(String tipo, String titulo, String descricao) {
        this.tipo = tipo;
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int calculaXP() {
        return 0;
    }

    @Override
    public String toString() {
        return "Atividade{" +
                "tipo='" + this.tipo + '\'' +
                ", titulo='" + this.titulo + '\'' +
                ", descricao='" + this.descricao + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Atividade)) return false;
        Atividade atividade = (Atividade) o;
        return this.tipo.equals(atividade.getTipo())
                && this.titulo.equals(atividade.getTitulo())
                && this.descricao.equals(atividade.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.tipo, this.titulo, this.descricao);
    }

}
