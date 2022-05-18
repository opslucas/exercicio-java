package controle;

import dominio.Lance;
import dominio.Usuario;
import java.util.Scanner;

public class ControlaLance {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        // Criação de usuário
        System.out.println("Insira o seu nome: ");
        String nome = leia.nextLine();
        System.out.println("Insira o seu ID: ");
        int id = leia.nextInt();
        Usuario usuario = new Usuario(id, nome);

        // Criação de lance
        System.out.println("Insira o valor do lance: ");
        double valor = leia.nextDouble();
        Lance lance = new Lance(usuario, valor);

        // Armazenando...
        System.out.println("Seu nome é: " + usuario.getNome());
        System.out.println("O seu ID é: ");
        System.out.println("O valor do seu lance foi: " + lance.getValor());
    }

}
