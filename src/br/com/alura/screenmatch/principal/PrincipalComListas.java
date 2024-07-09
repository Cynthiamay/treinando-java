package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(10);
        Serie lost = new Serie("Lost", 2000);
        Filme outroFilme = new Filme("Avatar 2", 2023);
        outroFilme.avalia(5);

//        ArrayList<Titulo> lista = new ArrayList<>(); ou List
        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for(Titulo item: lista) {
            System.out.println(item.getNome());

            if (item instanceof Filme filme) { //verifica e cria a variavel
                System.out.println("Nota para o filme " + filme.getNome() + ": " + filme.getClassificacao());
            }
        }

        ArrayList<String> artistas = new ArrayList<>();
        artistas.add("pituca");
        artistas.add("mike");
        artistas.add("mike");
        artistas.add("perola");
        artistas.add("mateus");
        artistas.add("cynthia");

        Collections.sort(artistas);
        System.out.println(artistas);

        Collections.sort(lista); //ordenacao alfabetica titulo
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento)); //ordena por ano
        System.out.println(lista);

    }
}
