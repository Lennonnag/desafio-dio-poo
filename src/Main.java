import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) throws Exception {

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("PHP");
        curso2.setDescricao("Descrição curso PHP");
        curso2.setCargaHoraria(7);

        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setData(LocalDate.now());
        mentoria1.setDescricao("Descrição mentoria java");
        mentoria1.setTitulo("Mentoria java");

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp JAVA Developer");
        bootcamp.setDescricao("Descrição Bootcamp JAVA Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLennon = new Dev();
        devLennon.setNome("Lennon");
        devLennon.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Lennon: " + devLennon.getConteudosInscritos());
        devLennon.progredir();
        devLennon.progredir();
        System.out.println("--------------------------");
        System.out.println("Conteúdos inscritos Lennon: " + devLennon.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Lennon: " + devLennon.getConteudosConcluidos());
        System.out.println("XP: " + devLennon.calcularTotalXp());
        System.out.println("--------------------------");
        
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("--------------------------");
        System.out.println("Conteúdos inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.calcularTotalXp());
        System.out.println("--------------------------");
        
    }
}
