import java.util.ArrayList;
import java.util.Scanner;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op, cont=0;
		Scanner ler = new Scanner(System.in);
		
		//Estoque Loja de 1,99
		
		ArrayList<String> estoque = new ArrayList();
		
		estoque.add("utensilios de cozinha");
		estoque.add("pote");
		estoque.add("presilha");
		estoque.add("carrinho de brinquedo");
		estoque.add("porta-retrato");
		estoque.add("ferramenta de jardim");
		estoque.add("bola de plástico");
		
		do
		{
			System.out.println("\n-----------------------------------------");
			System.out.println("\n(1) Deseja adicionar produtos ao estoque?");
			System.out.println("\n(2) Deseja remover produtos do estoque?");
			System.out.println("\n(3) Deseja atualizar produtos do estoque?");
			System.out.println("\n(4) Deseja mostrar todos os produtos do estoque?");
			System.out.println("\n(0) Deseja sair do programa?");
			System.out.println("\n-----------------------------------------");
			System.out.println("\nDigite sua opção: ");
			op = ler.nextInt();
			
			switch(op)
			{
			case 1:
				ler.nextLine(); 
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = ler.nextLine();
				estoque.add(produto);
				if (estoque != null)
				{
			        for (String item : estoque)
			        {
			            if (item != null && item.equals(estoque))
			            {
			                cont++;
			            }
			        }
			    }
				break;
			case 2:
				ler.nextLine();
				System.out.println("\nDigite o produto que deseja remover do estoque: ");
				String produtor = ler.nextLine();
				if(estoque.contains(produtor)) 
				{
					estoque.remove(produtor);
				}
				else
				{
					System.out.println("\nProduto não existe no estoque!!!!");
				}
				break;
			case 3:
				ler.nextLine();
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = ler.nextLine();
				System.out.println("\nDigite o produto que entrará no lugar do "+verifica+" : ");
				String novo = ler.nextLine();
				if(estoque.contains(verifica)) 
				{
					estoque.remove(verifica); 
					estoque.add(novo); 
				}
				else
				{
					System.out.println("\nProduto não existente!!!!");
				}
				break;
			case 4:
				ler.nextLine();
				System.out.println("\nProdutos do estoque: ");
				System.out.println(estoque);
				break;
				default:
					System.out.println("Finalizou o programa!!!");
			}
		}
		while(op!=0);

	}

}


