public class HistoricoVendas 
{
 private Venda[] vendas;   

public HistoricoVendas(int tamanho)// o tamanho do array recebe por parametro?
{
    vendas = new Venda[tamanho];
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
    for (Venda venda : vendas) {
        if (venda != null && venda.getNumero() == numero) {
            return venda; 
        }
    }
    return null;
}

public Venda[] getUltimasVendas(int n) {
    int totalVendas = 0;
    for (int i = 0; i < vendas.length; i++) {
        Venda venda = vendas[i];
        if (venda != null) {
            totalVendas++;
        }
    }

    Venda[] ultimasVendas = new Venda[n];
    int j = 0;

    for (int i = totalVendas - 1; i >= 0 && j < n; i--) {
        if (vendas[i] != null) {
            ultimasVendas[j] = vendas[i];
            j++;
        }
    }

    return ultimasVendas;
}

}



