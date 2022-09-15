import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz  = ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz = ");
        int n2 = input.nextInt();
        int ebob =1;
        for (int i=n1; i>1; i--){
            if (n1%i == 0 && n2%i == 0){
                ebob = i;
                break;
            }

        }
        int ekokk=1;
        for (int i = 1; i<=(n1 * n2); i++){
            if (i%n1 == 0 && i%n2 == 0){
                ekokk = i;
                break;
            }
        }

        int ekok = (n1*n2)/ebob;
        System.out.println("ebob = " + ebob);
        System.out.println("ekok = " + ekok);
        System.out.println("ekok = " + ekokk);
    }
}
