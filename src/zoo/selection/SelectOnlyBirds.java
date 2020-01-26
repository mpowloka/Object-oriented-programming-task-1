package zoo.selection;

import animal.Animal;
import animal.Bird;

import java.util.ArrayList;
import java.util.List;

public class SelectOnlyBirds implements AnimalSelectionStrategy {
    @Override
    public List<Animal> select(List<Animal> animals) {
        List<Animal> newList = new ArrayList<>();
        for(Animal animal: animals) {
            if (animal instanceof Bird){
                newList.add(animal);
            }
        }
        return newList;
    }
}
