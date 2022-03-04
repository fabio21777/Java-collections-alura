package com.fsm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turma {
    private String instrutor;
    
    private List<Aula> aulas = new ArrayList<>();

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }


    public void adicionarAula(Aula aula) {
        this.aulas.add(aula);
    } 
    
    public List<Aula> getAulasOrdenadas() {
        Collections.sort(aulas);
        return aulas;
    }
    
}
