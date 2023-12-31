public class ItemVenda
{
    private Produto produto;
    private double precoUnitarioCobrado;
    private int quantidade;

    public ItemVenda(Produto produtoe, int quant)
        {
            this.quantidade = quant;
            this.produto = produtoe;
            this.precoUnitarioCobrado = produto.getPrecoUnitario();

        }


    public Produto getProduto()
        {
            return produto;
        }

    public double getPrecoUnitario()
    {
        return precoUnitarioCobrado;
    }

    public int getQuantidade()
    {
        return quantidade;
    }

    public double getValorItem()
    {
        return (precoUnitarioCobrado*quantidade); //Na venda vai vir os dados do produto
    }

    @Override
    public String toString() {
        return "ItemVenda [" + produto + ", precoUnitarioCobrado=" + precoUnitarioCobrado + ", quantidade=" + quantidade + "]\n";
    }

}
