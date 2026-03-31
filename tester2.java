import java.util.Scanner;
import java.util.Arrays;;

public class tester2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String nome serve para armazenar todos os nomes dentro do Array pessoas.
        System.out.println("digite os nomes: ");
        String nome = scanner.nextLine();
        int contador = 0;

        String[] pessoas = nome.trim().split(",");
        // Usei o trim() para não contar os espaços na hora de contar os caracteres, E
        // usei o split para separar cada nomee por virgulas.
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].length() > 5) {
                contador++;

            }
            // nesse for eu fiz um loop que se os nomes dentro do (Array pessoas) conterem
            // mais de 5 caracteres, vai adcionar dentro do contador.
        }
        String[] novoContadorNome = new String[contador];
        // Aqui eu criei um novo Array para adcionar todos os nomes que possuem mais do
        // que 5 caracteres.
        int newIndex = 0;

        for (String mundo : pessoas) {
            if (mundo.length() > 5) {
                novoContadorNome[newIndex] = mundo;
                newIndex++;
            }
        }
        // Eu usei um for each para imprimir todos os nomes que possui mais de 5
        // caracteres.
        System.out.println(Arrays.toString(novoContadorNome));
    }

}
