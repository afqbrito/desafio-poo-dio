package br.com.dio.desafio.dominio;

import java.time.LocalDate;

import static br.com.dio.desafio.dominio.Global.XP_PADRAO;

public class Mentoria extends Atividade {

    private final LocalDate data;

    public Mentoria(String titulo, String descricao, LocalDate data) {
        super("Mentoria (Live)", titulo, descricao);
        this.data = data;
    }

    public LocalDate getData() {
        return this.data;
    }

    @Override
    public int calculaXP() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {
        return "Mentoria(Atividade){" +
                "tipo='" + this.getTipo() + '\'' +
                ", titulo='" + this.getTitulo() + '\'' +
                ", descricao='" + this.getDescricao() + '\'' +
                ", data=" + this.data +
                '}';
    }

}
