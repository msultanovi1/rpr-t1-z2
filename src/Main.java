import java.util.Scanner;

public class Main {

    private static int sumaCifara(int broj){
        int trenutnaCifra, suma = 0;
        while(broj!=0){
            trenutnaCifra = broj%10;
            suma = suma + trenutnaCifra;
            broj = broj/10;
        }
        return suma;
    }

    public static void main(String[] args) {
        int n;
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        n = ulaz.nextInt();
        for(int i=1; i<=n; i++){
            if(i%(sumaCifara(i))==0) System.out.println(i);
        }
    }
}
