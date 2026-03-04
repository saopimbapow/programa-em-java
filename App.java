import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("olá, seja bem vindo..");
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> nota = new ArrayList<>();
        Double soma = 0.0;
        Double media;
        Double valor = 0.0;
        int maiorouigual = 0;
        Double maiornota=0.0;
        Double menornota=0.0;
        System.out.println("Digite a quantidade de notas para cadastrar:");
        int qntdenota = scanner.nextInt();

        for(int  i=0; i< qntdenota; i++ ){

            System.out.println("Digite a " + (i+1) + " nota: ");
            valor = scanner.nextDouble();
            nota.add(valor);
            soma += valor;

            if (valor >= 7) {
                maiorouigual++;
            }
            if (i == 0) {
                maiornota = valor;
                menornota = valor;
            }
            if (valor > maiornota) {
                maiornota = valor;
            }
            if (valor < menornota) {
                menornota = valor;
            }  
        }
           media = soma / qntdenota;  

        System.out.println("A menor nota: " + menornota);
        System.out.println("A maior nota: " + maiornota);
        System.out.println("Notas que são maiores ou iguais a 7: " + maiorouigual);
        System.out.println("A soma das notas: " + soma);
        System.out.println("A média das notas: " + media);

        scanner.close();
    }
              
}

