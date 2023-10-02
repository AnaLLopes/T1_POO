public class ItemEstoque
{
    private Produto produto;
    private int quantidade;


public ItemEstoque(Produto produto, int quantidade)
        {
            this.produto = produto;
            this.quantidade = quantidade;
        }

public int getQuantidade()
    {
        return quantidade;
    }

public boolean baixaEstoque(int quant)
    {
        if(quant<quantidade)
        {
            quantidade = quantidade - quant;
            return true;
        }
        return false;
    }
public boolean reposicaoEstoque(int quant)
    {
        quantidade = quantidade + quant;
        return true;
    }

public Produto getProduto()
    {
        return produto;
    }

@Override
public String toString() {
    return "ItemEstoque " + produto + ", Quantidade =" + quantidade + "]\n";

}

}