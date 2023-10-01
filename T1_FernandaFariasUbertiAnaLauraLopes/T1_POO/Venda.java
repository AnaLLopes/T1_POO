import java.util.Arrays;

public class Venda 
{
    private int numero; //seria o numero do recibo da venda?
    private ItemVenda[] itensv;
    private double imposto;
    private int contadorItens;

    public Venda(int quantiadesdeprodutos)
    {
         this.itensv = new ItemVenda[quantiadesdeprodutos]; 
         this.imposto = getTotal()*0.25;
         this.contadorItens = 0;
        
    }

    public int getNumero()
    {
        return numero;
    }

   
    
    public  boolean insereItem(int codigo, int quantidade, Estoque estoque)//unico jeito que eu pensei para poder achar o produto, é enviando o o estoque junto
    {
     Produto produto = estoque.getProduto(codigo);

    int validacaodaquant = estoque.getQuantidadeDisponivel(codigo);
    
    if(validacaodaquant>quantidade)
        {
            ItemVenda iv1 = new ItemVenda(produto, quantidade);
            boolean quant = estoque.baixaEstoque(codigo, quantidade);

            if(quant == true){

            for(int i = 0; i<itensv.length; i++)
            {
                if(itensv[i]==null)
                {
                    itensv[i] = iv1;
                    contadorItens++;
                    break;
                }
            }
            return true;
        }

    }
    return false;
}

    public void imprimeRecibo()
    {
     int contador = 1;
      System.out.println("Recibo da venda numero: " + numero );
      System.out.println("Número do item"+"   "+"Código"+"   "+"Descrição"+"    "+"Preço Unitário Cobrado"+"    "+"Quantidade"+"    "+"Valordo Item");  
               for(int i =0; i< itensv.length;i++)
               {
                if(itensv[i]!=null)
                {System.out.println(contador+"                  "+itensv[i].getProduto().getCodigo()+"           "+itensv[i].getProduto().getDescricao()+"            "+itensv[i].getPrecoUnitario()+"              "+itensv[i].getQuantidade()+"          "+itensv[i].getValorItem()); 
                contador++; }         
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
        for(int i = 0; i<itensv.length; i++)
        {
            if(itensv[i]!=null)
            {
                soma = soma + itensv[i].getValorItem();
            }
            
        }
        return soma; 
    }

    public boolean removeItem(int codigo)
    {
        for(int i = 0; i<contadorItens; i++)
        {
            if(itensv[i].getProduto().getCodigo()==codigo)
            {
                itensv[i] = null;
                return true;
            }
        }
        return false;
    }
   
    public boolean conclui(Venda venda, HistoricoVendas historico)//enviei o hisotrico por parametro
    {
      boolean cadastra = historico.cadastraVenda(venda);
       return cadastra;
    }

    @Override
    public String toString() {
        return "Venda [numero=" + numero + ", itens=" + Arrays.toString(itensv) + ", imposto=" + imposto + "]";
    }

   
}