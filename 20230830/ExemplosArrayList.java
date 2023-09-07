import java.util.ArrayList;

public class ExemplosArrayList {
    public static void main(String args[]) {
        ArrayList<String> lista = new ArrayList<>();

        // Adicionar elemento no final
        lista.add("Maria");
        lista.add("Pedro");
        lista.add("Lucas");
        lista.add("Mateus");
        System.out.println(lista);

        // Adicionar elemento em uma posicao especifica
        lista.add(0, "Joao");
        System.out.println(lista);

        // Remover um elemento
        System.out.println("Removendo " + lista.remove(1));
        System.out.println(lista);
        System.out.println("Removendo " + lista.remove("Joao2"));
        System.out.println(lista);

        // Obter tamanho
        System.out.println("Numero de elementos: " + lista.size());

        // Iterar elementos
        for (int i = 0; i < lista.size(); i++) {
            System.out.printf("%02d: %s\n", i, lista.get(i));
        }

        for (String s: lista) {
            System.out.println(s);
        }

        System.out.println("Esta vazia? " + lista.isEmpty());
    }
}