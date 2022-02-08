import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        String[] sp = s.split(" ");

        System.out.printf("%d", Long.parseLong(sp[0]) + Long.parseLong(sp[1]));

    }
}