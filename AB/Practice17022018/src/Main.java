/**
 * Created by student on 17.02.2018.
 */
public class Main {



    public static void main(String[] args) {
        Animal animal =  new AnimalDekorator(Animal.getInstance("TOM","CAT"));
        System.out.println(animal.getName());
        System.out.println(animal.getType());
    }
}
