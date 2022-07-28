import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        Curso curso1 = new Curso("curso java", "descrição curso java", 8);
        Curso curso2 = new Curso("curso js", "descrição curso js", 4);
        Mentoria mentoria = new Mentoria(
                "mentoria de java", "descrição mentoria java", hoje.plusDays(40)
        );

        Bootcamp bootcamp = new Bootcamp(
                "Bootcamp Java Developer",
                "Descrição Bootcamp Java Developer",
                List.of(curso1, curso2, mentoria),
                hoje.plusDays(30),
                hoje.plusDays(60)
        );

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getAtividadesPendentes());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getAtividadesPendentes());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getAtividadesConcluidas());
        System.out.println("XP: " + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getAtividadesPendentes());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getAtividadesPendentes());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getAtividadesConcluidas());
        System.out.println("XP: " + devJoao.calcularTotalXp());

    }

}
