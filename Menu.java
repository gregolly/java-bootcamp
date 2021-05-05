import java.util.Scanner;

public class Menu {
  public static void main(String[] args) {
    System.out.println("| Menu             |");
    System.out.println("|   Opções:             |");
    System.out.println("|         1. Opção 1       |");
    System.out.println("|         2. Opção 2       |");
    System.out.println("|         3. Sair       |");
    Scanner menu = new Scanner(System.in);

    System.out.println("Selecione uma opção: ");
    int opcao = menu.nextInt();

    int numero = 3;
    do {
      switch (opcao) {
        case 1:
          System.out.print("Opção 1 selecionada");
          break;
        case 2:
          System.out.print("Opção 2 selecionada");
          break;
        case 3:
          System.out.print("Sair");
          break;
        default:
          System.out.println("Seleção inválida");
          break;
      }
    } while (opcao != numero);
  }
}
