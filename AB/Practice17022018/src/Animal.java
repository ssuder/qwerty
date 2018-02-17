/**
 * Created by student on 17.02.2018.
 */
public class Animal {
    private static Animal instance;
    private String name;
    private String type;

    protected Animal(){

    }

    protected Animal(String name, String type){
        this.name = name;
        this.type = type;
    }

    public static Animal getInstance(String name, String type){
        if(instance == null){
            instance = new Animal(name,type);
        }
        return instance;
    }
    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
