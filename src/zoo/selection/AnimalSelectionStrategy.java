package zoo.selection;

import animal.Animal;
import animal.Bird;

import java.util.ArrayList;
import java.util.List;

public interface AnimalSelectionStrategy {
    List<Animal> select(List<Animal> animals);
}

