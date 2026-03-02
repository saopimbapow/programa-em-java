import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String>  nomes  = new ArrayList<>();
        ArrayList<Integer> id  = new ArrayList<>();
        ArrayList<String> cargo  = new ArrayList<>();
        ArrayList<Integer> salário = new ArrayList<>();

        System.out.println("Quantidade de pessoas: ");
        int quantidade = scanner.nextInt();
        int i ;
        for(i = 0;  i < quantidade; i++ ){

            System.out.print("nome:");
            nomes.add(scanner.next());

            System.out.print("id:");
            id.add(scanner.nextInt());

            System.out.print("cargo:");
            cargo.add(scanner.next());
            
            System.out.print("salário:");
            salário.add(scanner.nextInt());
        }
        
        System.out.println("\n ---lista dos cadastros--- \n");

       

        System.out.println("\n pessoa: " + (i));
        System.out.println("\n nome: " + nomes );
        System.out.println("\n id: " + id );
        System.out.println("\n cargo: " + cargo );
        System.out.println("\n salário: " + salário );
          
    
    }
}
