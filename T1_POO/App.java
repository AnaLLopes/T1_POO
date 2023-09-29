import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        CatalogoProdutos catalogo = new CatalogoProdutos();
        Produto p1 = new Produto(10, "Geladeira", 3000);
        Produto p2 = new Produto(11, "Ar Condicionado", 2500);
        Produto p3 = new Produto(30, "Lava Roupas", 4000);
        catalogo.cadastraProduto(p1);
        catalogo.cadastraProduto(p2);
        catalogo.cadastraProduto(p3);

        Estoque estoque = new Estoque(100);

        estoque.cadastraProduto(p1, 10);
        estoque.cadastraProduto(p2, 20);
        estoque.cadastraProduto(p3, 30);

        Venda venda = new Venda(10);
        
        //catalogo.imprime();
        Produto p = catalogo.consulta(11);
        System.out.println(p);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Menu Principal ===");
            System.out.println("1. Realizar cadastro de venda");
            System.out.println("2. Verificar estoque");
            System.out.println("3. Verificar histórico de vendas");
            System.out.println("4. Cadastrar um produto");
            System.out.println("5. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Opção 1 selecionada: Realizar cadastro de venda");
                    HistoricoVendas.cadastraVenda();
                    break;
                case 2:
                    System.out.println("Opção 2 selecionada: Verificar estoque");
                    System.out.println("Digite o código do produto:");
                    int c = scanner.nextInt();
                    Estoque.getQuantidade(c);
                    break;
                case 3:
                    System.out.println("Opção 3 selecionada: Verificar histórico de vendas");
                    HistoricoVendas.getUltimasVendas():
                    break;
                case 4:
                    System.out.println("Opção 4 selecionada: Cadastrar um produto");
                    System.out.println("Digite o codigo:");
                    int cod = scanner.nextInt();
                    System.out.println("Digite a descricao:");
                    String des = scanner.nextLine();
                    System.out.println("Digite o preço unitario:");
                    double pcu = scanner.nextDouble();
                    
                    break;
                case 5:
                    System.out.println("Saindo do programa. Até logo!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}

