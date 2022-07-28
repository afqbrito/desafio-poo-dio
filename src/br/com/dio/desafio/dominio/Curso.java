package br.com.dio.desafio.dominio;

import static br.com.dio.desafio.dominio.Global.XP_PADRAO;

public class Curso extends Atividade {

    private final int cargaHoraria;

    public Curso(String titulo, String descricao, int cargaHoraria) {
        super("Curso", titulo, descricao);
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public int calculaXP() {
        return XP_PADRAO * this.cargaHoraria;
    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso(Atividade){" +
                "tipo='" + this.getTipo() + '\'' +
                ", titulo='" + this.getTitulo() + '\'' +
                ", descricao='" + this.getDescricao() + '\'' +
                ", cargaHoraria=" + this.cargaHoraria +
                '}';
    }

}
