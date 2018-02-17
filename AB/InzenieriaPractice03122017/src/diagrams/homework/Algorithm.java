package diagrams.homework;

import java.util.Scanner;

public class Algorithm {
    public static void main(String[] args) {
        int n = 0;
        do {
            n = enterIntNumber();
        } while (n < 0);
        int count = 0;
        int sum = 0;
        while (count != n) {
            if (count % 2 != 0) {
                count++;
            }else if (count < n) {
                count++;
                sum += count;
            }
        }
        System.out.println("SUMA : " + sum);
    }

    private static int enterIntNumber() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter positive number");
        return scr.nextInt();
    }

}
