/**
 * Created by student on 17.02.2018.
 */
public class AnimalDekorator{
    private Animal animal;

    public AnimalDekorator(Animal animal){
        this.animal = animal;
    }

    public String getName() {
        System.out.println("Log4j : enter Animal#getName()");
        return animal.getName();
    }


    public String getType() {
        System.out.println("Log4j : enter Animal#getType()");
        return animal.getType();
    }
}
