package Subject;

import Listeners.AnimalAddedListener;
import Models.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals = new ArrayList<>();
    private List<AnimalAddedListener> listeners = new ArrayList<>();

    public void addAnimal(Animal animal) {

        this.animals.add(animal);
        this.notifyAnimalAddedListeners(animal);
    }

    public void registerAnimalAddedListner(AnimalAddedListener animalAddedListener) {

        this.listeners.add(animalAddedListener);
    }

    public void unregisterAnimalAddedListner(AnimalAddedListener animalAddedListener) {

        this.listeners.remove(animalAddedListener);
    }

    protected void notifyAnimalAddedListeners(Animal animal) {

        this.listeners.forEach(listener -> listener.onAnimalAdded(animal));
    }
}
