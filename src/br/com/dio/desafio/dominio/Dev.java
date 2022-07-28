package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private final String nome;
    private final Set<Atividade> atividadesPendentes = new LinkedHashSet<>();
    private final Set<Atividade> atividadesConcluidas = new LinkedHashSet<>();

    public Dev(String nome) {
        this.nome = nome;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        bootcamp.inscreveDev(this);
        this.atividadesPendentes.addAll(bootcamp.getAtividades());
    }

    public void progredir() {
        Optional<Atividade> atividade = this.atividadesPendentes.stream().findFirst();

        if (atividade.isPresent()) {
            this.atividadesConcluidas.add(atividade.get());
            this.atividadesPendentes.remove(atividade.get());
        } else System.err.println("Você não está matriculado em nenhum conteúdo!");
    }

    public double calcularTotalXp() {
        int xp = 0;
        for (Atividade atividade : this.atividadesConcluidas) xp += atividade.calculaXP();

        return xp;
    }

    public String getNome() {
        return this.nome;
    }

    public Set<Atividade> getAtividadesPendentes() {
        return this.atividadesPendentes;
    }

    public Set<Atividade> getAtividadesConcluidas() {
        return this.atividadesConcluidas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(this.nome, dev.nome)
                && Objects.equals(this.atividadesPendentes, dev.atividadesPendentes)
                && Objects.equals(this.atividadesConcluidas, dev.atividadesConcluidas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.nome, this.atividadesPendentes, this.atividadesConcluidas);
    }
}
