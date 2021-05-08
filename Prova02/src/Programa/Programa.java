package Programa;

//#region
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import Classes.Produto;
import Classes.Tela;
//#endregion


public class Programa {
    public static void main(String[] args) {
                        List<Produto> produtos = new ArrayList<>();
                        int opc = 0;
                        Scanner ler = new Scanner(System.in);

            do {
                        Tela.exibirMenuPrincipal();
                        opc = ler.nextInt();
                        ler.nextLine();

            switch (opc) {
case 1 /*Cadastros*/:
                int opc1 = 0;
                Tela.exibirMenuCadastro();
                opc1 = ler.nextInt();
            
                        switch (opc1){
            
                case 01:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há nenhum produto cadastrado");
                    } else {
                        System.out.println("\n-------------  Produtos  ------------- ");
                        for (Produto produto : produtos) {
                        System.out.println("\n" + "->"+ produto);     
                    }}
                break;
            
                case 02:
                    System.out.println("\n-----------------------------------------------");
                    System.out.println("\n            Cadastro de Produtos");
                    System.out.println("\n-----------------------------------------------");
            
                    System.out.println("\n-> Codigo do produto");
                    System.out.printf("\nR:");
                    int codigo = ler.nextInt();
                    ler.nextLine();
            
                    System.out.println("\n-> Quantidade de produtos adicionados");
                    System.out.printf("\nR:");
                    int quantidade = ler.nextInt();
                    ler.nextLine();
            
                    System.out.println("\n-> Nome do produto adicionado");
                    System.out.printf("\nR:");
                    String nome = ler.nextLine();
            
                    System.out.println("\n-> Valor do produto");
                    System.out.printf("\nR:");
                    double valor = ler.nextDouble();
            
                    produtos.add(new Produto(codigo, quantidade, nome, valor));
                    System.out.println("\n-> O produto foi adicionado!");
            
                break;
            
                case 03:
                    System.out.println("\n-> Entendido, voltando ao menu!");
                return;
            }
            break;
case 2 /*Relatórios*/:
                        int opc2 = 0;
                        Tela.exibirRelatorios();
                        opc2 = ler.nextInt();

            switch (opc2) {
                        case 01:
                        if (produtos.isEmpty()) {
                            System.out.println("Não há nenhum produto cadastrado");
                        } else {
                        System.out.printf("\n%s\n", "---------------------------------------------------------------------------");
                        System.out.printf("\t%s\t%20s\t%15s\t%12s", "Código","Produto", "Valor(R$)", "Quantidade");
                        System.out.printf("\n%s\n", "---------------------------------------------------------------------------");

            for(Produto produto : produtos) {
                        System.out.printf("\t%s\t%20s\t%15.2f\t%12d\n", produto.getCodigo(), produto.getNome(), produto.getValor(), produto.getQuantidade());
                }
                        DoubleSummaryStatistics stats = produtos.stream().collect(Collectors.summarizingDouble(Produto::getValor));
                        System.out.printf("%s\n", "---------------------------------------------------------------------------");
                        System.out.printf("Maior Valor: R$ %.2f\tMenor Valor: R$ %.2f\tValor Médio: R$ %.2f\n", stats.getMax(), stats.getMin(), stats.getAverage());
    break;}
                        case 04:
                        System.out.println("\nEntendido! Encerrando a aplicação...");
return;
                }
    break;
    case 3/*Vendas*/: 
                        int opc3 = -1;
                        int quantidade = 0;
                        Tela.exibirVendas();
                        opc3 = ler.nextInt();
                        ler.nextLine();
                        

            do {    
 
            switch (opc3) {
                        case 01:
                            System.out.println("------------------------------- Venda -------------------------------");

            for(Produto produto : produtos) {

                            int qntdProdVenda;
                            System.out.println("\n-> Código do produto a ser vendido");
                            ler.nextLine();

                            System.out.println("\n-> Insira a quantidade de produtos vendidos");
                            qntdProdVenda = ler.nextInt();
                            ler.nextLine();

            if (qntdProdVenda <= quantidade) {

                                System.out.println("\n-> Não há essa quantidade de produtos em estoque, impossível fazer a venda");

            } else {
            if (qntdProdVenda > quantidade) {

                                produto.setQuantidade(produto.getQuantidade() - qntdProdVenda);
                                System.out.println("\nVenda realizada com sucesso!");
                            }
                        }
                        break;
                 }
                } 
            } while (opc3 != 0);
break;
                        case 0:
                            System.out.println("\nEntendido! Encerrando a aplicação...");
                        break;
    

    case 4/*Encerrando*/:
                        System.out.println("\nEntendido! Encerrando a aplicação...");
    break;

    default: 
                        System.out.println("\nEssa opção não conta no nosso sistema!");
    return;
    
    
                
    
}
                        } while (opc != 0);
ler.close();
}

    }

