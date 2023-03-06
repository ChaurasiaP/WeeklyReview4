import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] && j < i) {
                    break;
                }
                if (a[j] == a[i]) {
                    count++;
                }
            }
            if (count != 0) {
                System.out.println(a[i] + " " + count);
            }
        }
    }
}
