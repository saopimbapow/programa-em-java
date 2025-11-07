import java.util.Scanner;
import java.util.Random;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        int i = 0;
        int j = 0;
        System.out.println("Bem-vindo ao jogo Pedra, Papel e Tesoura!");
        
        while (true) {
            System.out.println("\nEscolha uma opção: (0) Pedra, (1) Papel, (2) Tesoura ou (3) Sair");
            int escolhaUsuario = scanner.nextInt();
            
            if (escolhaUsuario == 3) {
                System.out.println("Obrigado por jogar! Até a próxima.");
                break;
            }
            
            if (escolhaUsuario < 0 || escolhaUsuario > 2) {
                System.out.println("Escolha inválida. Tente novamente.");
                continue;
            }
            
            int escolhaComputador = random.nextInt(3);
            System.out.println("Você escolheu: " + opcoes[escolhaUsuario]);
            System.out.println("O computador escolheu: " + opcoes[escolhaComputador]);
            
            if (escolhaUsuario == escolhaComputador) {
                System.out.println("Empate!");
            } else if ((escolhaUsuario == 0 && escolhaComputador == 2) || 
                       (escolhaUsuario == 1 && escolhaComputador == 0) || 
                       (escolhaUsuario == 2 && escolhaComputador == 1)) {
                System.out.println("Você venceu!");
            } else {
                System.out.println("Você perdeu!");
            }
            if ((escolhaUsuario == 0 && escolhaComputador == 2) || 
                (escolhaUsuario == 1 && escolhaComputador == 0) || 
                (escolhaUsuario == 2 && escolhaComputador == 1)) {
                
                i++;
                System.out.println("Placar: " + i + " máquina: " + j );   
                
            }
            else if (escolhaUsuario == escolhaComputador){

                System.out.println("Placar: " + i + " máquina: " + j );

            }
            else{
                
                j++;
                System.out.println("Placar: você: " + i + " máquina: " + j );

            }
        }
        
        scanner.close();
    }
}
