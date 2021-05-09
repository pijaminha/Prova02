package Classes;

public class Tela {
    
    public static void exibirMenuPrincipal() {
        System.out.println("\n-----------------------------------------------");
        System.out.println("\n                    MENU ");
        System.out.println("\n-----------------------------------------------");
        System.out.println("\n       1 - para cadastro de produtos");
        System.out.println("\n       2 - para consultar os relatórios ");
        System.out.println("\n       3 - para realizar uma venda");
        System.out.println("\n       4 - para sair");
        System.out.println("\n-----------------------------------------------");
        System.out.printf("\nR:");
    }

    public static void exibirMenuCadastro() {
        System.out.println("\n --------CADASTRO DE PRODUTOS--------");
        System.out.println("\n      01 - Consultar os produtos");
        System.out.println("\n      02 - Incluir");
        System.out.println("\n      03 - Voltar ao Menu Anterior");
        System.out.println("\n ------------------------------------");
        System.out.printf("\nR:");
    }

    public static void exibirRelatorios() {
        System.out.println("\n------------- RELATÓRIOS -------------");
        System.out.println("\n 01 - Produtos");
        System.out.println("\n 04 - Voltar ao Menu Anterior");
        System.out.println("\n--------------------------------------");
        System.out.printf("\nR:");
    }

    public static void exibirVendas() {
        System.out.println("\n ------ Sistema de Vendas ------");
        System.out.println("\n 01 - Para realizar vendas");
        System.out.println("\n 02 - Para sair");
        System.out.println("\n -------------------------------");
        System.out.printf("\nR:");
    }
}
