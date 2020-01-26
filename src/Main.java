import animal.*;
import zoo.*;
import zoo.processing.MakeNoiseOnce;
import zoo.processing.MakeNoiseTwice;
import zoo.selection.SelectAllAnimals;
import zoo.selection.SelectOnlyBirds;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat(4));
        animals.add(new Dog(20));
        animals.add(new Pigeon(false, 15));
        animals.add(new Eagle(true, 12, "Joe"));
        System.out.println("\nOnly birds\n");

        final Zoo showOnlyBirdsZoo = new ZooImpl(
                new MakeNoiseOnce(),
                new SelectOnlyBirds()
        );

        final Zoo showEachAnimalTwiceZoo = new ZooImpl(
                new MakeNoiseTwice(),
                new SelectAllAnimals()
        );

        final Zoo showEachBirdTwiceZoo = new ZooImpl(
                new MakeNoiseTwice(),
                new SelectOnlyBirds()
        );

        showOnlyBirdsZoo.showAnimals(animals);
        System.out.println("\nEach animal in the zoo 2 times\n");
        showEachAnimalTwiceZoo.showAnimals(animals);
        System.out.println("\nEach bird 2 times\n");
        showEachBirdTwiceZoo.showAnimals(animals);

    }
}
