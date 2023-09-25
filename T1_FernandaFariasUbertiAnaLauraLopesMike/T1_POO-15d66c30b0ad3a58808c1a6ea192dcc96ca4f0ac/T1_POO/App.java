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
    }
}
