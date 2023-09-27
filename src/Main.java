import java.util.Scanner;

import static java.lang.Math.random;

public class Main {
    public static final int SIZE_ARRAY=10;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<SIZE_ARRAY;i++) {
            System.out.print(fillArray()[i]+ ", ");
        }
        System.out.println("\n Podaj liczbe ktora chcesz odszukac w zbiorze: ");
        int lookedForNumber = scanner.nextInt();

        findArray(lookedForNumber);
    }

    public static int[] fillArray() {
        int[]arrayOfNumbers = new int[SIZE_ARRAY];
        for (int i =0;i<SIZE_ARRAY;i++) {
            arrayOfNumbers[i] = (int) (random() * 100);
        }
        return arrayOfNumbers;
    }

    public static void findArray(int lookedForNumber) {
        boolean found = false;
        for (int i = 0; i < SIZE_ARRAY; i++) {

            if (fillArray()[i] == lookedForNumber) {
                if (fillArray()[i] == (SIZE_ARRAY - 1)) {
                    found = false;
                } else
                    found = true;
                break;
            } else {
                found = false;
            }


        }
        if (found==true) {
            System.out.println("Znaleziono liczbe w zbiorze: " + lookedForNumber);
        }
        else if (found!=true){
            System.out.println("Nie znaleziono liczby w zbiorze");
        }
        else System.out.println("Bląd");



    }
}