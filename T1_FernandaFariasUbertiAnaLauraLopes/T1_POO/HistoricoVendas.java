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
/** 
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
*/
public Venda[] getUltimasVendas(int inicio , int fim) {
    // Primeiro verifica se os indices sao validos
    //if (inicio < 0 || fim > vendas.length)
      //  throw new IndexOutOfBoundsException();
    //if (inicio > fim)
       // throw new IllegalArgumentException();
    
    // Instancia o array que sera retornado
    Venda a[] = new Venda[100];
    
    for(int i=inicio, j=0; i<fim; i++, j++) {
        a[j] = vendas[i];
    }
    
    // Retorna o array com os elementos da sublist
    return a;
}

@Override
public String toString() {
    return "HistoricoVendas [Vendas = " + Arrays.toString(vendas) + "]";
}

}

