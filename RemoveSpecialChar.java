import java.util.Scanner;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();

        String string = str1.replaceAll("[^a-zA-Z0-9+]", "");

        System.out.println(string);

    }
}
