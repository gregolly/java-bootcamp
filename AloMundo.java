public class AloMundo {
  /**
   *
   */
  private static final String hello = "Olá Mundo!";

  public static void main(String[] args) {
    System.out.println(hello);

    for (int contador = 0; contador < 100; contador++) {
      System.out.println(contador);
    }

    double precoProduto = 1.550;
    if (precoProduto < 0) {
      System.out.println("O preço do produto não pode ser negativo!");
    } else {
      System.out.println("Produto cadastrado com sucesso!");
    }
  }
}
