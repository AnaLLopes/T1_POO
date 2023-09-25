public class HistoricoVendas 
{
 private Venda[] vendas;   

public HistoricoVendas(int tamanho)// o tamanho do array recebe por parametro?
{
    this.vendas = new Venda[tamanho];
}

public boolean cadastraVenda(Venda venda) {
        for (int i = 0; i < vendas.length; i++) {
        if (vendas[i] == null) {
            vendas[i] = venda;
            return true; 
        }
    }
    return false;
}

public Venda getVenda(int numero) {
    for(int i = 0; i<vendas.length;i++)
    {
        if(vendas[i].getNumero() == numero)
        {
            return vendas[i];
        }
    return null;
    }
}

public Venda[] getUltimasVendas(int numero) {
    int totalVendas = 0;
    for (int i = 0; i < vendas.length; i++) {
        Venda venda = vendas[i];
        if (venda != null) {
            totalVendas++;
        }
    }

    Venda[] ultimasVendas = new Venda[numero];
    int j = 0;

    for (int i = totalVendas - 1; i >= 0 && j < numero; i--) {
        if (vendas[i] != null) {
            ultimasVendas[j] = vendas[i];
            j++;
        }
    }

    return ultimasVendas;
}

}

