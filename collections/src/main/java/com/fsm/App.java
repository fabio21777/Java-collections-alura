package com.fsm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList <Aula> aulas = new ArrayList<Aula>();
        Aula aula1 = new Aula();
        aula1.setNome("Java");
        aula1.setTempo(30);

        Aula aula2 = new Aula();
        aula2.setNome("C#");
        aula2.setTempo(40);

        Aula aula3 = new Aula();
        aula3.setNome("C++");
        aula3.setTempo(20);

        Aula aula4 = new Aula();
        aula4.setNome("Python");
        aula4.setTempo(10);

        aulas.addAll(Arrays.asList(aula1, aula2, aula3, aula4));

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        aulas.forEach(aula -> {
            System.out.println(aula);
        });

    }
}
