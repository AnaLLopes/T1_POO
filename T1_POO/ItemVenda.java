public class ItemVenda
{
    private int numero;
    private Produto produto;
    private double precoUnitarioCobrado;
     //esse preco nao seria o mesmo do produto?
     //porque se for, nao tem necessidade de fazer o getvalorItem, sendo que ja tem o getPreco
    private int quantidade;


    //precisa ter construtor?
    public ItemVenda(Produto produtoe)
        {
            numero = produto.getCodigo();
            produto = produtoe;
            precoUnitarioCobrado = produto.getPrecoUnitario();
            //o que eu devo colocar em quantidade
        }

    public int getNumero()
        {
            return numero;
        }

    public Produto getProduto()
        {
            return produto;
        }

    public double getPrecoUnitario()
    {
        return precoUnitarioCobrado;
    }

    public double getQuantidade()
    {
        return quantidade;
    }

    public double getValorItem()
    {
        return precoUnitarioCobrado;
    }

}


