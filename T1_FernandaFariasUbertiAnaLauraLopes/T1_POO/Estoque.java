import java.util.Arrays;

public class Estoque 
{
   public static Object produto;
private ItemEstoque[] itens;

public Estoque (int tamanho)
{
     this.itens = new ItemEstoque[tamanho];
}


public int getQuantidadeDisponivel(int codigo)
    {
        for(int i = 0; i<itens.length; i++)
        {
            if(itens[i].getProduto().getCodigo() == codigo)
            {
                return itens[i].getQuantidade();
            }
        }
        return -1; // se não encontrar o produto
    }

public boolean baixaEstoque(int codigo, int quantidade)
    {
      for(int i = 0; i<itens.length; i++)
        {
            if(itens[i].getProduto().getCodigo() == codigo)
            {
                itens[i].baixaEstoque(quantidade);
                return true;
            }
        }  
        return false;
    }

public boolean reposicaoEstoque(int codigo, int quantidade)
    {
     for(int i = 0; i<itens.length; i++)
            {
                if(itens[i].getProduto().getCodigo() == codigo)
                {
                    itens[i].reposicaoEstoque(quantidade);
                    return true;
                }
            }  
            return false; 
    }

public boolean cadastraProduto(Produto produto, int quantidade)
    {
        ItemEstoque ie1 = new ItemEstoque(produto, quantidade);

        for(int i = 0; i<itens.length; i++)
            {
            if(itens[i]==null)
            {
                itens[i] = ie1;
                return true;
            }  
            }  
        return false; 
    }

public   Produto getProduto(int codigo) 
    {
        for(int i = 0; i<itens.length; i++)
        {
            if(itens[i].getProduto().getCodigo() == codigo)
            {
                return itens[i].getProduto();
            }
        }
        return null; //caso o produto não exista
    }


@Override
public String toString() {
    return "Estoque [Itens= " + Arrays.toString(itens) + "]";
}
}