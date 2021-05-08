package Classes;

public class Tela {
    
    public static void exibirMenuPrincipal() {
        System.out.println("\n-----------------------------------------------");
        System.out.println("\n                    MENU ");
        System.out.println("\n-----------------------------------------------");
        System.out.println("\n       1 - para cadastro de produtos");
        System.out.println("\n       2 - para consultar os relatórios ");
        System.out.println("\n       3 - para realizar uma venda");
        System.out.println("\n       0 - para sair");
        System.out.println("\n-----------------------------------------------");
        System.out.printf("\nR:");
    }

    public static void exibirMenuCadastro() {
        System.out.println("\n --------CADASTRO DE PRODUTOS--------");
        System.out.println("\n      1 - Consultar os produtos");
        System.out.println("\n      2 - Incluir");
        System.out.println("\n      0 - Voltar ao Menu Anterior");
        System.out.println("\n ------------------------------------");
        System.out.printf("\nR:");
    }

    public static void exibirRelatorios() {
        System.out.println("\n------------- RELATÓRIOS -------------");
        System.out.println("\n 1 - Produtos");
        System.out.println("\n 2 - Vendas por Período - detalhado");
        System.out.println("\n 3 - Vendas por Período – consolidado");
        System.out.println("\n 0 - Voltar ao Menu Anterior");
        System.out.println("\n--------------------------------------");
        System.out.printf("\nR:");
    }

    public static void exibirVendas() {
        System.out.println("\n ------ Sistema de Vendas ------");
        System.out.println("\n 1 - Para realizar vendas");
        System.out.println("\n 0 - Para sair");
        System.out.println("\n -------------------------------");
        System.out.printf("\nR:");
    }
}
