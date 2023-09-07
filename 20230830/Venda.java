public class Venda 
{
    private int numero; //seria o contador de vendas?
    private ItemVenda[] itens;

    public Venda()
    {
         itens = new ItemVenda[numero]; //não precisa colocar tamanho?
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
        if(numero>10)
        double subtotal = (calculaImposto() + total());
    
        
    }
}
