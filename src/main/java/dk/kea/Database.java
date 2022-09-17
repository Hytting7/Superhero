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

   public ArrayList<Superhero> searchForSuperheroes(String search){
      ArrayList<Superhero> searchArrayList = new ArrayList<>();
      for (Superhero superhero: superheroes){
         if (superhero.getSuperhelteNavn().toLowerCase().contains(search.toLowerCase())){
            searchArrayList.add(superhero);
         }
      }
      return searchArrayList;
   }
}

