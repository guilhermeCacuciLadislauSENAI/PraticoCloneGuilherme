import java.util.Scanner;
public class imparOuPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if(numero % 2 == 0){
            System.out.print("\nÉ par!");
        } else{
            System.out.print("\nÉ ímpar!");
        }

    }
}
