import java.util.Scanner;
public class Teste {
    public static void main(String [] args) {
    int idade;
    int meses;
    int dias;

    Scanner ler = new Scanner(System.in);

    System.out.println("Informe sua idade em anos: ");
    idade = ler.nextInt();
    System.out.print("Informe sua idade em meses: ");
    meses = ler.nextInt();
    System.out.print("Informe sua idade em dias: ");
    dias = ler.nextInt();

    System.out.println("Você possui "+ ((idade*360)+(meses*30)+ dias)+"dias de nascido.");


    }
}