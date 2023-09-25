public class CatalogoProdutos {
    private Produto[] produtos;

    public CatalogoProdutos() {
        this.produtos = new Produto[100]; //Coloquei esse valor pois o nosso não irá ter muitos produtos
    }

public boolean cadastraProduto(Produto produto) {
        for (int i = 0; i < produtos.length; i++) {
        if (produtos[i] == null) {
            produtos[i] = produto;
            return true; 
        }
    }
    return false;
}

public Produto getProduto(int codigo) {
        for(int i = 0; i<produtos.length; i++) 
        {
            if (produtos[i].getCodigo() == codigo)
            return produtos[i];
        }
        return null;
    }

    public void imprime() {
        for (Produto p: produtos) {
            System.out.println(p);
        }
    }
}
