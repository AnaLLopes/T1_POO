public class App {
    public static void main(String args[]) {
        CatalogoProdutos catalogo = new CatalogoProdutos();

        catalogo.cadastra(new Produto(10, "Geladeira", 3000));
        catalogo.cadastra(new Produto(11, "Ar Condicionado", 2500));
        catalogo.cadastra(new Produto(30, "Lava Roupas", 4000));

        //catalogo.imprime();
        Produto p = catalogo.consulta(11);
        System.out.println(p);
    }
}
