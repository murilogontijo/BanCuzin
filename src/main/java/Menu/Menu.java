package Menu;


public class Menu {
	
	public static void menuPrincipal (){
		System.out.println( "Olá, bem vindo ao BanCuzin!" );
		System.out.println( "Digite um comando para prosseguir:" );
		System.out.println( "A - Gerenciar agencias" );
		System.out.println( "B - Gerenciar clientes" );
		System.out.println( "C - Gerenciar contas" );
		System.out.println( "D - Gerenciar empréstimos/financiamentos" );
		System.out.println( "S - S para sair" );

	}
	
	public static void menuAgencias (){
		System.out.println("Digite um comando para prosseguir:");
		System.out.println("C - Cadastrar uma agencia");
		System.out.println("B - Buscar por uma agencia especifica");
		System.out.println("A - Atualziar os dados de uma agencia");
		System.out.println("D - Deletar uma agência");
		System.out.println("L - Listar todas as agencias");
		System.out.println("I - Importar agencias");
		System.out.println("V - Voltar ao menu principal");
	}

}
