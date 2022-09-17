package dk.kea;

import java.util.ArrayList;

public class Database {

   private ArrayList<Superhero> superheroes = new ArrayList<>();

   public void createsuperhero(Superhero superhero) {
      superheroes.add(superhero);
   }

   public ArrayList<Superhero> superheroes(){
      return superheroes;
   }
}

