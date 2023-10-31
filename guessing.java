import java.util.Scanner;
public class guessing {
    public static void main(String[] args) {
        int randomsayi1=(int) (Math.random()*100);
        Scanner input=new Scanner(System.in);
        while (true){
            System.out.println("tahmininizi giriniz: ");
            int  guess=input.nextInt();
            if(guess==randomsayi1){
                System.out.println("tahmin doğru");

            } else if (guess>=randomsayi1)
            {
                System.out.println("küçült");

            }
            else {
                System.out.println("büyült");
            }
        }



    }
}
