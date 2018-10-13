package Listeners;

import Models.Animal;

public class PrintNameAnimalAddedListener implements AnimalAddedListener{

    @Override
    public void onAnimalAdded(Animal animal) {
        System.out.println("The new animal added is " + animal.getName());
    }
}
