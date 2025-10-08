import java.util.Scanner;

public class calculoimposto {
    public static void main(String[] args) throws Exception {
        
       Scanner entrada = new Scanner(System.in);

        System.out.print("digite o seu salário: ");
        double salario = entrada.nextDouble();
        double imposto = 0;

        if (salario <= 34712.00) {
            
            imposto = (salario * 0.097);

         
        }
        else if (salario <=68.507) {

            imposto = (salario * 0.495);

            
        }
         System.out.println("o imposto do salário será de " + imposto);
    }

}
