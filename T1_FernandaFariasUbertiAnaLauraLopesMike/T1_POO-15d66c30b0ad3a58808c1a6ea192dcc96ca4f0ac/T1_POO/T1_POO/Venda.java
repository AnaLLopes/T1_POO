public class Venda 
{
    private int numero; //seria o numero do recibo da venda?
    private ItemVenda[] itens;
    private double imposto;

    public Venda()
    {
         itens = new ItemVenda[numero]; //não precisa colocar tamanho?
    }
    public boolean insereItem(int codigo, int quantidade)
    {
        Produto achaproduto = Estoque.getProduto(codigo);
    }

    public int getNumero()
    {
        return numero;
    }

    public double total()
    {
         double soma = 0;
        for(int i = 0; i<numero; i++)
        {
            soma = soma + itens[i].getPrecoUnitario();
        }
        if(soma>250)
        {
            return soma*0.1;
        }
        return soma; 
    }
    public double calculaImposto()
    {
        double soma = 0;
        for(int i = 0; i<numero; i++)
        {
            soma = soma + itens[i].getPrecoUnitario();
        }
        double impostos = soma * 25/100;
        return impostos;
    }
    public double getSubtotal()
    {
       double subtotal = 
        //precisa calcular o imposot o desocnto dos 250
    }
}
