import java.util.Arrays;

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
    }
     return null;
}

public Venda[] getUltimasVendas(int n)
{
    if (n >= 0 && n < vendas.length) {
        Venda[] ultimasVendas = new Venda[n];
        int contadorUltimasVendas = 0;
    
        for(int i = vendas.length - 1; i>=0 && contadorUltimasVendas < n ; i--)
            {
            
                    ultimasVendas[contadorUltimasVendas] = vendas[i];
                    contadorUltimasVendas++;
                
            
            }
    return ultimasVendas;
}
else {
        return null;
    }
}

@Override
public String toString() {
    return "HistoricoVendas [" + Arrays.toString(vendas) + "]";
}

}

