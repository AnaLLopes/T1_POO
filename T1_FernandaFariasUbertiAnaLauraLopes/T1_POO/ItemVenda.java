public class ItemVenda
{
    private Produto produto;
    private double precoUnitarioCobrado;
    private int quantidade;


    //precisa ter construtor?
    public ItemVenda(Produto produtoe, int quant)//A quantidade vem por parametro ?
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
        return "ItemVenda [produto=" + produto + 
        ", precoUnitarioCobrado=" + precoUnitarioCobrado + 
        ", quantidade="
                + quantidade + "]";
    }

}
