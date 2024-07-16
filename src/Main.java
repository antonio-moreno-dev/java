import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double soma = 0.0;
        double media =0.0;


        System.out.print("Quantos elementos vai estar no seu vetor:");
        int n = sc.nextInt();

        double [] vect = new double[n];

        for (int i =0; i < n; i++){
            System.out.print("Digite um numero:");
            vect[i] = sc.nextDouble();
            soma = soma + vect[i];
        }


        media = soma / n;

        System.out.printf("MEDIA DOS VETORES = %.3f%n", media);
        System.out.println("Elementos a baixo da media:");

        for (int i = 0; i < n; i++){
            if (vect [i] < media) {
                System.out.printf("%.1f%n ",vect[i]);

            }
        }



        sc.close();
    }
}