package com.fsm;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TurmaMain {
    public static void main(String[] args) {
        Turma turma = new Turma();
        turma.setInstrutor("José");
        turma.adicionarAula(new Aula("Java", 50));
        turma.adicionarAula(new Aula("C#", 40));
        turma.adicionarAula(new Aula("C++", 20));
        
        List<Aula> aulas = turma.getAulasOrdenadas();

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

        turma.getAulas().forEach(aula -> {
            System.out.println(aula);
        });
    }
}
