package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {

    private final String titulo;
    private final String descricao;
    private final List<Atividade> atividades;
    private final LocalDate dataInicial;
    private final LocalDate dataFinal;
    private final List<Dev> devsInscritos = new ArrayList<>();

    public Bootcamp(String titulo, String descricao, List<Atividade> atividades,
                    LocalDate dataInicial, LocalDate dataFinal) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.atividades = atividades;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public List<Atividade> getAtividades() {
        return this.atividades;
    }

    public LocalDate getDataInicial() {
        return this.dataInicial;
    }

    public LocalDate getDataFinal() {
        return this.dataFinal;
    }

    public void inscreveDev(Dev dev) {
        this.devsInscritos.add(dev);
    }

    public List<Dev> getDevsInscritos() {
        return this.devsInscritos;
    }

    public int calculaXP() {
        int xp = 0;
        for (Atividade atividade : this.atividades) xp += atividade.calculaXP();

        return xp;
    }

    @Override
    public String toString() {
        return "Modulo{"
                + "titulo='" + this.titulo + "'"
                + ", descricao='" + this.descricao + "'"
                + ", dataInicial=" + this.dataInicial
                + ", dataFinal=" + this.dataFinal
                + ", atividades=[" + Global.collectionToString(this.atividades) + "]"
                + ", devsInscritos=[" + Global.collectionToString(this.devsInscritos) + "]"
                + "}";
    }

}
