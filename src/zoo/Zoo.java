package zoo;

import animal.Animal;
import zoo.selection.AnimalSelectionStrategy;
import zoo.processing.AnimalProcessingStrategy;

import java.util.List;

public abstract class Zoo {
    protected AnimalProcessingStrategy animalProcessingStrategyType;
    protected AnimalSelectionStrategy animalSelectionStrategyType;
    public abstract void showAnimals(List<Animal> animals);
}