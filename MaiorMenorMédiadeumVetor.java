import java.util.Scanner;

public class MaiorMenorMédiadeumVetor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos números você quer digitar: ");
        int numeros = entrada.nextInt();

        double[] numeros2 = new double[numeros]; // cria um array com o tamanho informado

        for (int i = 0; i < numeros; i++) {
            System.out.print("\nDigite o número " + (i + 1) + ": ");
            numeros2[i] = entrada.nextInt(); // armazena o número no array
        }

        System.out.print("\nVocê digitou: ");
        for (int i = 0; i < numeros; i++) {
            System.out.print( numeros2[i]);
            if (i < numeros - 1) System.out.print(", ");
        }

        double maior = numeros2[0];
        double menor = numeros2[0];
        double soma = 0;

        for (int i = 0; i < numeros2.length; i++) {
            double n = numeros2[i];
            soma += n;
            if (numeros2[i] > maior) {
                maior = numeros2[i];
            }
            if (numeros2[i] < menor) {
                menor = numeros2[i];
            }  
        }
        System.out.println("\nmaior número: " + maior);
        System.out.println("\nmenor número: " + menor);

        double media = soma/numeros2.length; 

        System.out.println("\nMédia: " + media);

        entrada.close();
    }
}
