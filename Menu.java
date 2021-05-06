import java.util.Scanner;

public class Menu {
  public static void main(String[] args) {

    int opcao = 0;
    do {
      System.out.println("|        Menu           |");
      System.out.println("|       Opções :        |");
      System.out.println("|      1. Opção 1       |");
      System.out.println("|      2. Opção 2       |");
      System.out.println("|        Sair           |");
      Scanner menu = new Scanner(System.in);

      System.out.println("| Selecione uma Opção:  |");
      opcao = menu.nextInt();

      switch (opcao) {

        case 1:
          System.out.println("Opcao 1 Selecionada");
          break;

        case 2:
          System.out.println("Opcao 2 Selecionada");
          break;

        case 3:
          System.out.println("Sair");
          break;

        default:
          System.out.println("Opcão Inválida");
          break;
      }
    } while (opcao < 3);
  }
}
