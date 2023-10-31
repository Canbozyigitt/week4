import java.util.Scanner;
public class ornek {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int result=0;
        while (true){
            System.out.println("bir sayı giriniz: ");
            int sayi=input.nextInt();
            if(sayi==0){
                System.out.println("toplam: "+result);
            }
            else {
                result+=sayi;
            }
        }

    }
}
