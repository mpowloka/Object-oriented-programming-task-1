package zoo;

import animal.Animal;
import zoo.selection.AnimalSelectionStrategy;
import zoo.processing.AnimalProcessingStrategy;

import java.util.List;

public class ZooImpl extends Zoo {
    private final AnimalProcessingStrategy animalProcessingStrategy;
    private final AnimalSelectionStrategy animalSelectionStrategy;

    public ZooImpl(AnimalProcessingStrategy animalProcessingStrategy, AnimalSelectionStrategy animalSelectionStrategy) {
        this.animalProcessingStrategy = animalProcessingStrategy;
        this.animalSelectionStrategy = animalSelectionStrategy;
    }

    @Override
    public void showAnimals(List<Animal> animals) {
        for(Animal animal : animalSelectionStrategy.select(animals)) {
            animalProcessingStrategy.process(animal);
        }
    }
}
