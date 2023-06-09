// 1. Faça um Programa que peça um número e então mostre a mensagem
// O número informado foi [número

package prog_exercicios;

import java.util.Scanner; //Importei a classe Scanner para permitir a entrada de dados pelo usuário.

public class exercicio1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (var input = new Scanner(System.in)) {
            System.out.print("Digite um número: "); // Usei o método print() da classe System.out para exibir a mensagem
                                                    // "Digite um número: " no console.
            int numero = input.nextInt(); // Usei o método nextInt() do objeto input para ler um número inteiro digitado
                                          // pelo usuário e armazená-lo na variável numero.

            System.out.println("O número informado foi: " + numero); // Usei o método println() da classe System.out
                                                                     // para
                                                                     // exibir a mensagem "O número informado foi: "
                                                                     // seguida
                                                                     // do valor armazenado na variável numero.
        }
    }
}
