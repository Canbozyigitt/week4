import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random random=new Random(10);
        Scanner input=new Scanner(System.in);

        int a=random.nextInt();
        int b=random.nextInt();
        System.out.println("1. sayı: "+a+"+ 2.sayı: "+b);
        System.out.println("sonuç: ");
        int num=input.nextInt();
        int result=a+b;
        while (true){
            if(result==num){
                System.out.println("sonuç doğru");
                break;

            }
            else {
                System.out.println("sonuç yanlış");
                break;
            }


        }


    }
}