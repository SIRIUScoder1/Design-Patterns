package ObserverPattern.src.Driver;

import ObserverPattern.src.Listeners.CountingAnimalAddedListener;
import ObserverPattern.src.Listeners.PrintNameAnimalAddedListener;
import ObserverPattern.src.Models.Animal;
import ObserverPattern.src.Subject.Zoo;

public class Main {

    public static void main(String args[]) {

        Zoo zoo = new Zoo();

        zoo.registerAnimalAddedListner(new PrintNameAnimalAddedListener());
        zoo.registerAnimalAddedListner(new CountingAnimalAddedListener());

        zoo.addAnimal(new Animal("Tiger")) ;
        zoo.addAnimal(new Animal("Lion")) ;
        zoo.addAnimal(new Animal("Bear")) ;
    }
}
