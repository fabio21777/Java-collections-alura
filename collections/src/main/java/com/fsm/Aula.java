package com.fsm;

public class Aula implements Comparable<Aula> {
    private String nome;

    private Integer tempo;

    

    public Aula(String nome, Integer tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }

    public Aula() {

    }

    public String getNome() {
        return nome;
    }




    public void setNome(String nome) {
        this.nome = nome;
    }




    public Integer getTempo() {
        return tempo;
    }




    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Aula [nome=" + nome + "]";
    }


    @Override
    public int compareTo(Aula outraAula ) {
        return this.getNome().compareTo(outraAula.getNome());
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aula other = (Aula) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    

    
}
