import java.util.Scanner;
public class ornek4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            for(int j = num; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
