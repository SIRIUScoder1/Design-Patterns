package ObserverPattern.src.Listeners;

import ObserverPattern.src.Models.Animal;

public class CountingAnimalAddedListener implements AnimalAddedListener {

    private static int animalsAddedCount = 0;

    @Override

    public void onAnimalAdded (Animal animal) {

        animalsAddedCount++;
        System.out.println("Total animals added: " + animalsAddedCount);

    }

}