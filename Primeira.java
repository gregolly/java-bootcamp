import java.util.Scanner;

class Primeira {
  public static void main(String[] args) {
    System.out.println("Curso de Java");

    Scanner entrada = new Scanner(System.in);
    System.out.println("Oi, qual é o seu nome?");
    String s = entrada.next();

    System.out.println("Oi " + s + ", tudo bem?");
  }
}