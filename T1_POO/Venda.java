public class Venda 
{
    private int numero; //seria o numero do recibo da venda?
    private ItemVenda[] itens;
    private double imposto;

    public Venda(int numero)
    {
        this.numero = numero;
         itens = new ItemVenda[0]; //não precisa colocar tamanho?
    }
   
    public boolean insereItem(int codigo, int quantidade, double precoUnitario) {
        Produto achaproduto = Estoque.getProduto(codigo);
        if (achaproduto != null) {
            double subtotalItem = quantidade * precoUnitario;
            ItemVenda item = new ItemVenda(achaproduto, quantidade, precoUnitario, subtotalItem);
            ItemVenda[] novoItens = new ItemVenda[itens.length + 1];
            System.arraycopy(itens, 0, novoItens, 0, itens.length);
            novoItens[itens.length] = item;
            itens = novoItens;
            return true;
        }
        return false; 
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
    public double getSubtotal() {
        double subtotal = 0;
        for (int i = 0; i < itens.length; i++) {
            subtotal += itens[i].getSubtotal();
        }
        return subtotal;
    }
    
}  

