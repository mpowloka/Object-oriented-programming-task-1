package zoo.selection;

import animal.Animal;

import java.util.List;

public class SelectAllAnimals implements AnimalSelectionStrategy {
    @Override
    public List<Animal> select(List<Animal> animals) {
        return animals;
    }
}
