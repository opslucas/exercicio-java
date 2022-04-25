package controle;
import dominio.Retangulo;
import java.util.Scanner;

public class ControlaRetangulo {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Insira  a base do retângulo: ");
        int base = leia.nextInt();
        System.out.println("Insira a altura do retângulo: ");
        int altura = leia.nextInt();

        Retangulo retangulo = new Retangulo(base, altura);

        System.out.println("A área do retângulo é: " + retangulo.calcularArea());
        System.out.println("O perímetro do retângulo é: " + retangulo.calcularPerimetro());
    }
}
