package Driver;

import Listeners.CountingAnimalAddedListener;
import Listeners.PrintNameAnimalAddedListener;
import Models.Animal;
import Subject.Zoo;

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
