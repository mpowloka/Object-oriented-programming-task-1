package zoo.processing;

import animal.Animal;

public class MakeNoiseOnce implements AnimalProcessingStrategy {
    @Override
    public void process(Animal animal) {
        animal.makeNoise();
    }
}
