import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vogais = 0, digitos = 0, outros = 0; 
        String input;

        System.out.println("digite caracteres (digite '.' para encerrar):");

        
        input = teclado.nextLine();

        
        if (input.charAt(input.length() - 1) == '.') {
            // Remove o ponto para não contar na análise
            input = input.substring(0, input.length() - 1);
        }

        
        for (int i = 0; i < input.length(); i++) {
            char caractere = input.charAt(i);

            // Verifica se é um dígito
            if (caractere >= '0' && caractere <= '9') {
                digitos++;
            } 
            // Verifica se é uma vogal (minúscula ou maiúscula)
            else if (caractere == 'a' || caractere == 'e' || caractere == 'i' || 
                     caractere == 'o' || caractere == 'u' || caractere == 'A' || 
                     caractere == 'E' || caractere == 'I' || caractere == 'O' || 
                     caractere == 'U') {
                vogais++;
            } 
            
            else {
                outros++;
            }
        }

        
        System.out.println("quantidade de vogais: " + vogais);
        System.out.println("quantidade de digitos: " + digitos);
        System.out.println("quantidade de outros caracteres: " + outros);

        teclado.close(); // Fecha o scanner
    }
}
