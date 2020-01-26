package zoo.processing;

import animal.Animal;

public class PrintWeight implements AnimalProcessingStrategy {
    @Override
    public void process(Animal animal) {
        System.out.println(animal.getWeight());
    }
}
