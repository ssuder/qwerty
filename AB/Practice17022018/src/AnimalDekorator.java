/**
 * Created by student on 17.02.2018.
 */
public class AnimalDekorator extends Animal{
    private Animal animal;

    public AnimalDekorator(Animal animal){
        this.animal = animal;
    }
@Override
    public String getName() {
        System.out.println("Log4j : enter Animal#getName()");
        return super.getName();
    }

    @Override
    public String getType() {
        System.out.println("Log4j : enter Animal#getType()");
        return super.getType();
    }
}
