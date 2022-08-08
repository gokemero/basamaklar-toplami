import java.util.Scanner;
public class proje {
    public static void main(String[] args) {
        System.out.print("Bir sayı giriniz :");
        Scanner input = new Scanner(System.in);
        int girilen = input.nextInt();
        int i = 0;
        int t = girilen;
        int basamak = 0;
        int top = 0;
        while(i<t){
            t /=10;
            basamak++;
        }
        while(basamak>0){
            int m = 1;
            for(int k =1;k<basamak;k++){
                m *=10;
            }
            int z = girilen/m;
            girilen = girilen-(z*m);
            basamak--;
            System.out.println(z);
            top += z;

        }
        System.out.print("Toplamları :"+ top);

    }
}
