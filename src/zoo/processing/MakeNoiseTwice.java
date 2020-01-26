package zoo.processing;

import animal.Animal;

public class MakeNoiseTwice implements AnimalProcessingStrategy {
    @Override
    public void process(Animal animal) {
        animal.makeNoise();
        animal.makeNoise();
    }
}
