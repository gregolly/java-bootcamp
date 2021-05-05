import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
    Scanner dado = new Scanner(System.in);
    System.out.println("Digite seu peso: ");
    int peso = dado.nextInt();
    System.out.println("Digite sua altura: ");
    int altura = dado.nextInt();

    int imc = peso / (altura * altura);

    if (imc < 18.5) {
      System.out.println("Seu imc é: " + imc + " Você está magro!");
    } else if (imc > 18.5 && imc < 24.9) {
      System.out.println("Seu imc é: " + imc + " Você está normal!");
    } else if (imc > 24.9 && imc < 30) {
      System.out.println("Seu imc é: " + imc + " Você está com sobrepeso!");
    } else if (imc > 30) {
      System.out.println("Seu imc é: " + imc + " Você está com obeso!");
    }
  }
}
