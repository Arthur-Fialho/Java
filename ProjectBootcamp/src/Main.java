import java.time.LocalDate;
import java.util.Set;

import br.com.bootcamp.project.domain.Bootcamp;
import br.com.bootcamp.project.domain.Conteudo;
import br.com.bootcamp.project.domain.Curso;
import br.com.bootcamp.project.domain.Dev;
import br.com.bootcamp.project.domain.Mentoria;

public class Main {
    
    // Método para exibir listas de conteúdos de forma organizada
    public static void exibirConteudos(String titulo, Set<Conteudo> conteudos) {
        System.out.println(titulo);
        if (conteudos.isEmpty()) {
            System.out.println("  ➤ Nenhum conteúdo");
        } else {
            conteudos.forEach(conteudo -> System.out.println("  ➤ " + conteudo));
        }
        System.out.println();
    }
    
    // Método para exibir informações do desenvolvedor
    public static void exibirInfoDev(Dev dev) {
        System.out.println("👨‍💻 DESENVOLVEDOR: " + dev.getNome().toUpperCase());
        System.out.println("════════════════════════════════════════");
        exibirConteudos("📋 CONTEÚDOS INSCRITOS:", dev.getConteudosInscritos());
        exibirConteudos("✅ CONTEÚDOS CONCLUÍDOS:", dev.getConteudosConcluidos());
        System.out.println("🏆 XP TOTAL: " + dev.calcularTotalXp());
        System.out.println("════════════════════════════════════════\n");
    }
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devArthur = new Dev();
        devArthur.setNome("Arthur");
        devArthur.inscreverBootcamp(bootcamp);
        
        System.out.println("🚀 ESTADO INICIAL:");
        exibirInfoDev(devArthur);
        
        devArthur.progredir();
        devArthur.progredir();
        
        System.out.println("📈 APÓS PROGRESSÃO:");
        exibirInfoDev(devArthur);

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        
        System.out.println("🚀 ESTADO INICIAL:");
        exibirInfoDev(devJoao);
        
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        
        System.out.println("📈 APÓS PROGRESSÃO:");
        exibirInfoDev(devJoao);

    }
        
}

