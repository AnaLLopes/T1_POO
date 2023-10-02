import java.util.Scanner;

public class App {
    public static boolean insereCod(int cod, int[] arrayCod, int tamanho)
    {
        for(int i = 0; i<arrayCod.length;i++)
        {
            arrayCod[i] = cod;
        }
        return true;
    }

    public static boolean contemCod(int cod, int tamanho, int[] arraycod) { 
        for(int i=0; i<tamanho; i++) {
            if (cod==arraycod[i]) {
                return true;
            }
        }
        return false; 
    }
    public static void main(String args[]) {

        CatalogoProdutos catalogo = new CatalogoProdutos();
        Produto p1 = new Produto(10, "Geladeira", 3000);
        Produto p2 = new Produto(11, "Ar Condicionado", 2500);
        Produto p3 = new Produto(30, "Lava Roupas", 4000);
        catalogo.cadastraProduto(p1);
        catalogo.cadastraProduto(p2);
        catalogo.cadastraProduto(p3);

        int[] codigos = new int [100];
        int tamanho = codigos.length;
 
        App.insereCod(10,codigos, tamanho);
        App.insereCod(11,codigos, tamanho);
        App.insereCod(30,codigos, tamanho);

        Estoque e = new Estoque(3); //criei o estoque(mudar o tamanhao)

        
        HistoricoVendas hv =  new HistoricoVendas(5); //criei o historico 

        e.cadastraProduto(p1, 10);
        e.cadastraProduto(p2, 20);
        e.cadastraProduto(p3, 30);

        Venda venda = new Venda(4);
        
        //catalogo.imprime();
        Produto p = catalogo.getProduto(11);
        System.out.println(p);

        
        Scanner scanner = new Scanner(System.in);
        boolean aleatorio = true;

        while (aleatorio) {
            System.out.println("=== Menu Principal ===");
            System.out.println("1. Realizar venda");
            System.out.println("2. Verificar quantidade do produto no estoque"); 
            System.out.println("3. Verificar histórico de vendas");//ver o erro
            System.out.println("4. Cadastrar um produto no estoque");
            System.out.println("5. Mostrar o estoque"); 
            System.out.println("6. Realizar reposição");
            System.out.println("7. Cadastrar produto");
            System.out.println("8. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            boolean sec = true;
            switch (opcao) {
                case 1:
                    System.out.println("Opção 1 selecionada: Realizar venda");
                    System.out.println("Digite quantos produto irão ter na venda:");
                    int n = scanner.nextInt();
                    Venda vendam =  new Venda(n);
                    while(sec){
                        System.out.println("===============");
                        System.out.println("1. Inserir item na venda");
                        System.out.println("2. Finalizar venda");
                        System.out.println("===============");
                        int nv = scanner.nextInt();
                        if (nv<1 || nv>2){
                            System.out.println("O número digitado é inválido! Digite um número válido!");
                        }
                        else{
                            switch(nv)
                            {
                                case 1:
                                    System.out.println("Digite o código do produto:");
                                    int cod = scanner.nextInt();
                                    boolean resp = contemCod(cod, tamanho, codigos);
                                    if(resp == true){
                                    System.out.println("Digite a quantidade do produto:");
                                    int quant = scanner.nextInt();
                                    boolean insereItemNaVenda = vendam.insereItem(cod, quant, e);
                                    boolean baixa = e.baixaEstoque(cod,quant);
                                    System.out.println("Item inserido com sucesso!");
                                    }
                                    else
                                    {System.out.println("Codigo digitado errado! Digite novamente ");}
                                    break;
                        
                                case 2:
                                    vendam.imprimeRecibo();
                                    boolean cadastrav = hv.cadastraVenda(vendam);
                                    System.out.println("Venda finalizada!");
                                    sec = false;
                                    break;
                            
                            }
                        }
                    }
                    break;
                
                case 2:
                    System.out.println("Opção 2 selecionada: Verificar quantidade do produto no estoque");
                    System.out.println("Digite o código do produto:");
                    int c = scanner.nextInt();
                    boolean respc = contemCod(c, tamanho, codigos);
                    if(respc == true){
                    System.out.println("Quantidade disponível: " + e.getQuantidadeDisponivel(c));
                    }
                    else{System.out.println("Codigo digitado errado! Digite novamente ");}
                    break;
                case 3:
                    System.out.println("Opção 3 selecionada: Verificar histórico de vendas");
                        while(sec){
                        System.out.println("===============");
                        System.out.println("1. Verificar histórico completo");
                        System.out.println("2. Verificar últimas vendas");
                        System.out.println("===============");
                        int menuhv = scanner.nextInt();
                        if (menuhv<1||menuhv>2){
                            System.out.println("O número digitado é inválido! Digite um número válido!");

                        }
                        else{
                            switch(menuhv)
                            {
                                case 1:
                                    System.out.println(hv);
                                    sec = false;
                                    break;
                        
                                case 2:
                                System.out.println("Digite a quantidade de vendas que deseja ver");
                                int quantv = scanner.nextInt();
                                Venda[] ultimasVendas = hv.getUltimasVendas(quantv);
                                if(ultimasVendas != null)
                                {
                                    for(Venda imprimiArrayVendas: ultimasVendas)
                                    {
                                        System.out.println(imprimiArrayVendas);
                                    }
                                }
                                else
                                {
                                    System.out.println("O histórico de vendas não possui nenhuma venda cadastrada");
                                }
                                    sec = false;
                                    break;
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("Opção 4 selecionada: Cadastrar um produto");
                    System.out.println("Digite o codigo:");
                    int cod = scanner.nextInt();
                    System.out.println("Digite a descrição:");
                    String des = scanner.nextLine();
                    System.out.println("Digite o preço unitário:");
                    double pcu = scanner.nextDouble();
                    Produto x2 = new Produto(cod, des, pcu);
                    System.out.println("Digite a quantidade:");
                    int quant = scanner.nextInt();
                    boolean cadastra = e.cadastraProduto(x2, quant);
                    break;
                case 5:
                    System.out.println(e);
                    break;
                case 6:
                System.out.println("Opção 6: Realizar reposição");
                    System.out.println("Digite o código do produto:");
                    int codr = scanner.nextInt();
                    boolean respr = contemCod(codr, tamanho, codigos);
                    if(respr == true){
                    System.out.println("Digite a quantidade do produto:");
                    int quantr = scanner.nextInt();
                    boolean rep = e.reposicaoEstoque(codr, quantr);
                    System.out.println("Reposição realizada com sucesso!");}
                    else {System.out.println("O número digitado é inválido! Digite um número válido!");}
                case 7: 
                    System.out.println("Opção 7: Cadastrar produto");
                    System.out.println("Digite o código do produto:");
                    int codc = scanner.nextInt();
                    System.out.println("Digite a descrição do produto:");
                    String desc = scanner.nextLine();
                    System.out.println("Digite o preço unitário do produto");
                    double prec = scanner.nextDouble();
                    Produto p7 = new Produto(codc, desc, prec);
                    boolean caa = catalogo.cadastraProduto(p7);
                    boolean caas =App.insereCod(codc,codigos, tamanho);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;
                case 8:
                    System.out.println("Saindo do programa. Até logo!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}
