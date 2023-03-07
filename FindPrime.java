import java.util.Arrays;
import java.util.Scanner;

public class FindPrime {

    private static int size;
    private static int k = 0;
    private static final Scanner sc = new Scanner(System.in);

    private static int[] a, prime, primeNum;

    private static void getArray() {
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
    }

    private static void getPrimeArray() {
        for (int i = 0; i < size; i++) {
            int factor = 0;
            for (int j = 1; j < a[i] * a[i]; j++) {
                if (a[i] % j == 0) {
                    factor++;
                }
            }
            if (factor <= 2) {
                prime[k] = a[i];
                k++;
            }
        } // array for getting prime numbers

        System.out.println("prime array");
        primeNum = new int[k]; // array to store prime values

        {
            int i = 0;
            while (i < primeNum.length) {
                primeNum[i] = prime[i];
                i++;
            }
        }
        int i = 0;
        while (i < primeNum.length) {
            System.out.println(primeNum[i]);
            i++;
        }
    }

    private static void sortedArrayWithUniqueValues() {
        Arrays.sort(primeNum);
        for (int i = 0; i < primeNum.length; i++) {
            int count = 0;
            for (int j = 0; j < primeNum.length; j++) {
                if (primeNum[i] == primeNum[j] && j < i) {
                    break;
                }
                if (primeNum[i] == primeNum[j]) {
                    count++;
                }
            }
            if (count != 0) {
                System.out.println(primeNum[i]);
            }
        }
    }

    public static void main(String[] args) {

        size = sc.nextInt();
        a = new int[size];
        prime = new int[a.length];
        k = 0;
        getArray();     // ARRAY INPUT

        System.out.println("Prime Numbers from array");
        getPrimeArray();        // ARRAY OF PRIME ELEMENTS FROM USER INPUT ARRAY

        System.out.println(" duplicate removed");
        sortedArrayWithUniqueValues();      // SORTED ARRAY WITHOUT ANY DUPLICATE VALUES
    }
}
