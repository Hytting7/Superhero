package dk.kea;

import java.util.ArrayList;

public class Database {

    Superhero batman = new Superhero("Bruce Wayne", "Batman", "Penge", 1939, true, 1.5);
    Superhero superman = new Superhero("Clarke Kent", "Superman", "Alt", 1920, false, 2000);
    Superhero spiderman = new Superhero("Peter Parker", "Spider-man", "Edderkoppesans", 1955, true, 10);
    Superhero wonderWoman = new Superhero("Diana", "Wonder Woman", "Superstyrke", 1950, false, 50);
    public ArrayList<Superhero> superheroes = new ArrayList<>();

    public Superhero defaultSuperheroes;

    {
        superheroes.add(batman);
        superheroes.add(superman);
        superheroes.add(spiderman);
        superheroes.add(wonderWoman);
    }

    public void createsuperhero(Superhero superhero) {
        superheroes.add(superhero);
    }

    public ArrayList<Superhero> superheroes() {
        return superheroes;
    }

    public ArrayList<Superhero> searchForSuperheroes(String search) {
        ArrayList<Superhero> searchArrayList = new ArrayList<>();
        for (Superhero superhero : superheroes) {
            if (superhero.getSuperhelteNavn().toLowerCase().contains(search.toLowerCase())) {
                searchArrayList.add(superhero);
            }
        }
        return searchArrayList;
    }
}

