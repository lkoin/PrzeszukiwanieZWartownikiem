import java.util.Scanner;

import static java.lang.Math.random;

public class Main {
    public static final int SIZE_ARRAY=15;
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
//        for (int i=0;i<SIZE_ARRAY;i++) {
//            System.out.print(fillArray()[i]+ ", ");
//        }

        System.out.println("\n Podaj liczbe ktora chcesz odszukac w zbiorze: ");
        int lookedForNumber = scanner.nextInt();
        int rezutlat =findArray(lookedForNumber,fillArray());

        System.out.println("Podana liczba znajduje sie pod indexem = "+rezutlat);

    }

    public static int[] fillArray() {
        int[]arrayOfNumbers = new int[SIZE_ARRAY];
        for (int i =0;i<SIZE_ARRAY;i++) {
            arrayOfNumbers[i] = (int) (random() * 100);
        }
        return arrayOfNumbers;
    }

    public static int findArray(int lookedForNumber,int[] arrayOfNumbers) {
        int[] arrayNumbersWithSentry = new int[SIZE_ARRAY + 1];
        for (int i = 0; i < SIZE_ARRAY; i++) {
            System.out.print(arrayOfNumbers[i]+ ", ");
            arrayNumbersWithSentry[i] = arrayOfNumbers[i];
        }
        arrayNumbersWithSentry[SIZE_ARRAY] = lookedForNumber;
        int indexNumber = 0;
        for (int i = 0; i <= SIZE_ARRAY; i++) {
            if (arrayNumbersWithSentry[i] == lookedForNumber) {
                indexNumber = i;
                break;
            }

        }
        return indexNumber;
    }



    }
