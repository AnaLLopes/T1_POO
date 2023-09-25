public class Venda 
{
    private int numero; //seria o numero do recibo da venda?
    private ItemVenda[] itens;
    private double imposto;

    public Venda(int quantiadesdeprodutos)
    {
         this.itens = new ItemVenda[quantiadesdeprodutos]; 
         this.imposto = getTotal()*0.25;
    }

    public int getNumero()
    {
        return numero;
    }
    
    public boolean insereItem(int codigo, int quantidade)
    {
    
     Produto produto = getProduto(codigo);

    int validacaodaquant = produto.getQuantidadeDisponivel();
    if(validacaodaquant>quantidade)
        {
            ItemVenda iv1 = new ItemVenda(produto, quantidade);
            boolean quant = produto.baixaEstoque(codigo, quantidade);
            for(int i = 0; i<itens.length; i++)
            {
                if(itens[i]==null)
                {
                    itens[i] = iv1;
                }
            }
            return true;
        }

        return false;
    }

    public void imprimeRecibo()
    {
     int contador = 1;
      System.out.println("Recibo da venda numero: " + numero );
      System.out.println("Número do item"+" "+"Código"+" "+"Descrição"+" "+"Preço Unitário Cobrado"+" "+"Quantidade"+" "+"Valordo Item");  
               for(int i =0; i< itens.length;i++)
               {
                System.out.println(contador+" "+itens[i].getProduto().getCodigo()+" "+itens[i].getProduto().getDescricao()+" "+itens[i].getPrecoUnitario()+" "+itens[i].getQuantidade()+" "+itens[i].getValorItem()); 
                contador++;          
               }
    System.out.println("Total: " + getTotal()); 
    System.out.println("Deconto: " + getDesconto());   
    System.out.println("Imposto: " + getImposto());   
    System.out.println("Valor da Venda: " + getSubtotal());
    }

    public double getDesconto()
    {
       if(getTotal() > 250)
       {
        return getTotal()*0.1;
       }
      return getTotal();

    }


    public double getImposto()
    {
        return imposto;
    }

    public double getSubtotal()
    {
        double subtotal = getDesconto() + getImposto();
        return subtotal;
    }

    public double getTotal()
    {
         double soma = 0;
        for(int i = 0; i<itens.length; i++)
        {
            soma = soma + itens[i].getValorItem();
        }
        return soma; 
    }

    public boolean removeItem(int numero)
    {
        for(int i = 0; i<itens.length; i++)
        {
            if(itens[i].getProduto().getCodigo()==numero)
            {
                itens[i] = null;
                return true;
            }
        }
        return false;
    }
   
    public boolean conclui(Venda venda)
    {
      boolean cadastra = cadastraVenda(venda);
       return cadastra;
    }
   
}