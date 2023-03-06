import java.util.Arrays;
import java.util.Scanner;

public class FindPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        int[] prime = new int[a.length];
        int k = 0;


        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
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
        int[] primeNum = new int[k]; // array to store prime values

        for (int i = 0; i < primeNum.length; i++) {
            primeNum[i] = prime[i];
        }
        for (int i = 0; i < primeNum.length; i++) {
            System.out.println(primeNum[i]);
        }
        System.out.println(" duplicate removed");

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
}
