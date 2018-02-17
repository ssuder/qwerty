public class dekorator_animal extends animal {
    public dekorator_animal (int age){
        super(age);
    }
    public in getAge(){
        System.out.println("Dekorator");
        return super.getAge();
    }
    public in setAge(){
        System.out.println("Dekorator");
        return super.setAge();
    }
}
