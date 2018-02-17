/**
 * Created by student on 17.02.2018.
 */
public class Main {



    public static void main(String[] args) {
        AnimalDekorator animalD =  new AnimalDekorator(Animal.getInstance("TOM","CAT"));
        System.out.println(animalD.getName());
        System.out.println(animalD.getType());
    }
}
