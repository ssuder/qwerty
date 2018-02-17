import java.util.Scanner;

/**
 * Created by zp112907 on 03.12.2017.
 */
public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Cat cat = new Cat();
//        dog.name = "DOGname";
//        cat.name = "CATname";
//        System.out.println(dog.name);
//        System.out.println(cat.name);
        faktorial();
    }

    public static int faktorial() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if (n < 0) {
            faktorial();
            return 0;
        }
        int count = 0;
        int factorial = 1;
        do {
            factorial = ++count * factorial;
        } while (count > n);

        System.out.println("N = " + n);
        System.out.println(factorial);
        return factorial;
    }

    public static void summa(){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(n < 0){
            return;
        }
        int count = 0;
        int suma = 0;
    }

}
