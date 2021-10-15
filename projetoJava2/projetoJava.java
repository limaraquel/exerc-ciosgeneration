package projetoJava2;

import java.util.Scanner;

public class projetoJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner menu = new Scanner(System.in);

		System.out.println(" +---------------------------------------+");
		System.out.println(" |   Seja Bem-Vinde a ONG JAVA do Bem!   |");
		System.out.println(" +---------------------------------------+\n");
		
		//Pedir infos
		
		System.out.println(" +---------------------------------------+");
		System.out.println(" |             MENU DE OPÇÕES            |");
		System.out.println(" +---------------------------------------+");
		System.out.println(" |       1- Ajudar Moradores de Rua      |");
		System.out.println(" +---------------------------------------+");
		System.out.println(" |       2- Ajudar Orfanatos Carentes    |");
		System.out.println(" +---------------------------------------+");
		System.out.println(" |       3- Ajudar Asilos Carentes       |");
		System.out.println(" +---------------------------------------+");

		System.out.println("\n ---------> Digite uma Opção: ");
		
		int opcao = menu.nextInt();
		
		switch (opcao)
		{
			case 1: 
				System.out.println(" +---------------------------------------+");
				System.out.println(" |        -> Opção 1 Selecionada <-      |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     -> Ajudar Moradores de Rua <-     |");
				System.out.println(" +---------------------------------------+\n");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     Como você gostaria de ajudar?     |");
				System.out.println(" +---------------------------------------+");

				
				System.out.println(" +---------------------------------------+");
				System.out.println(" |            MENU DE OPÇÕES             |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |      1- Doação em Dinheiro            |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |      2- Doação de Alimentos           |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |      3- Doação de Roupas/brinquedos   |");
				System.out.println(" +---------------------------------------+");

				
				System.out.println(" +---------------------------------------+");
				System.out.println(" | *OBS: As doações de alimentos, roupas |");
				System.out.println(" | e brinquedos deverão ser entregues em |");
				System.out.println(" |         nosso ponto de coleta.        |");
				System.out.println(" +---------------------------------------+");
				
				System.out.println("\n ---------> Digite uma Opção: ");
				
				int opcao1 = menu.nextInt();
				
				switch (opcao1)
				{
					case 1:
					System.out.println(" +---------------------------------------+");
					System.out.println(" |  Todo valor doado será convertido em  |");
					System.out.println(" |      alimentos, cobertores, roupas    |");
					System.out.println(" |    medicamentos e itens de higiene    |");
					System.out.println(" +---------------------------------------+");
					
					
					System.out.println("\n------> Qual Valor você deseja doar: ");
					
					
					Float valor=menu.nextFloat();
					
					System.out.println(" +---------------------------------------------+");
					System.out.printf (" |     Seu boleto de R$ %.2f  foi gerado!     |\n", valor);
					System.out.println(" | Acesse o link https://ongjavadobem.org/pay  |");
					System.out.println(" +---------------------------------------------+");
					
					break;
				
					case 2:
					System.out.println(" +---------------------------------------+");
					System.out.println(" |  Suas doações de alimentos devem ser  |");
					System.out.println(" |  entregues em nosso ponto de coleta,  |");
					System.out.println(" |     Localizado na Rua Java, Nº 7 - SP |");
					System.out.println(" |   Horário de Atendimento 08h as 17h.  |");
					System.out.println(" +---------------------------------------+");
					break;
				
					case 3:
						System.out.println(" +-----------------------------------------+");
						System.out.println(" | Suas doações de roupas/brinquedos devem |");
						System.out.println(" | ser entregues em nosso ponto de coleta, |");
						System.out.println(" |    Localizado na Rua Java, Nº 7 - SP    |");
						System.out.println(" |    Horário de Atendimento 08h as 17h.   |");
						System.out.println(" +-----------------------------------------+");
					break;
					default:
						System.out.println("OPÇÃO INVÁLIDA!\n Por favor digite novamente.");
					break;
				}	
				break;
				
			
			case 2:
				System.out.println(" +---------------------------------------+");
				System.out.println(" |        -> Opção 2 Selecionada <-      |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     -> Ajudar Orfanatos carentes <-    |");
				System.out.println(" +---------------------------------------+\n");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     Como você gostaria de ajudar?     |");
				System.out.println(" +---------------------------------------+");
				
				System.out.println(" +---------------------------------------+");
				System.out.println(" |            MENU DE OPÇÕES             |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |      1- Doação em Dinheiro            |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |      2- Doação de Alimentos           |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |      3- Doação de Roupas/Brinquedos   |");
				System.out.println(" +---------------------------------------+");
				
				System.out.println(" +---------------------------------------+");
				System.out.println(" | *OBS: As doações de alimentos, roupas |");
				System.out.println(" | e brinquedos deverão ser entregues em |");
				System.out.println(" |         nosso ponto de coleta.        |");
				System.out.println(" +---------------------------------------+");

				System.out.println("\n ---------> Digite uma Opção: ");
				
				int opcao2 = menu.nextInt();
				
				switch (opcao2)
				{
					case 1:
						System.out.println(" +---------------------------------------+");
						System.out.println(" |  Todo valor doado será convertido em  |");
						System.out.println(" |      alimentos, cobertores, roupas    |");
						System.out.println(" |    medicamentos e itens de higiene    |");
						System.out.println(" +---------------------------------------+");
						System.out.println("\n------> Qual Valor você deseja doar: ");
					 
					Float valor=menu.nextFloat();
					System.out.println(" +---------------------------------------------+");
					System.out.printf (" |     Seu boleto de R$ %.2f  foi gerado!     |\n", valor);
					System.out.println(" | Acesse o link https://ongjavadobem.org/pay  |");
					System.out.println(" +---------------------------------------------+");
					
					break;
				
					case 2:
						System.out.println(" +---------------------------------------+");
						System.out.println(" |  Suas doações de alimentos devem ser  |");
						System.out.println(" |  entregues em nosso ponto de coleta,  |");
						System.out.println(" |     Localizado na Rua Java, Nº 7 - SP |");
						System.out.println(" |   Horário de Atendimento 08h as 17h.  |");
						System.out.println(" +---------------------------------------+");
					break;
				
					case 3:
						System.out.println(" +-----------------------------------------+");
						System.out.println(" | Suas doações de roupas/brinquedos devem |");
						System.out.println(" | ser entregues em nosso ponto de coleta, |");
						System.out.println(" |    Localizado na Rua Java, Nº 7 - SP    |");
						System.out.println(" |    Horário de Atendimento 08h as 17h.   |");
						System.out.println(" +-----------------------------------------+");
					break;
					default:
						System.out.println("OPÇÃO INVÁLIDA!\n Por favor digite novamente.");
					break;
				}
			break;
			
			case 3: 
				System.out.println(" +---------------------------------------+");
				System.out.println(" |        -> Opção 3 Selecionada <-      |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     -> Ajudar Asilos carentes <-      |");
				System.out.println(" +---------------------------------------+\n");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     Como você gostaria de ajudar?     |");
				System.out.println(" +---------------------------------------+");
				
				System.out.println(" +---------------------------------------+");
				System.out.println(" |            MENU DE OPÇÕES             |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |      1- Doação em Dinheiro            |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |      2- Doação de Alimentos           |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |      3- Doação de Roupas/Brinquedos   |");
				System.out.println(" +---------------------------------------+");
				
				System.out.println(" +---------------------------------------+");
				System.out.println(" | *OBS: As doações de alimentos, roupas |");
				System.out.println(" | e brinquedos deverão ser entregues em |");
				System.out.println(" |         nosso ponto de coleta.        |");
				System.out.println(" +---------------------------------------+");


				System.out.println("\n ---------> Digite uma Opção: ");
				
				int opcao3 = menu.nextInt();
				
				switch (opcao3)
				{
					case 1:
						System.out.println(" +---------------------------------------+");
						System.out.println(" |  Todo valor doado será convertido em  |");
						System.out.println(" |      alimentos, cobertores, roupas    |");
						System.out.println(" |    medicamentos e itens de higiene    |");
						System.out.println(" +---------------------------------------+");
						System.out.println("\n------> Qual Valor você deseja doar: ");
						 
					Float valor=menu.nextFloat();
					System.out.println(" +---------------------------------------------+");
					System.out.printf (" |     Seu boleto de R$ %.2f  foi gerado!     |\n", valor);
					System.out.println(" | Acesse o link https://ongjavadobem.org/pay  |");
					System.out.println(" +---------------------------------------------+");
					break;
				
					case 2:
						System.out.println(" +---------------------------------------+");
						System.out.println(" |  Suas doações de alimentos devem ser  |");
						System.out.println(" |  entregues em nosso ponto de coleta,  |");
						System.out.println(" |     Localizado na Rua Java - SP       |");
						System.out.println(" |   Horário de Atendimento 08h as 17h.  |");
						System.out.println(" +---------------------------------------+");
					break;
				
					case 3:
						System.out.println(" +-----------------------------------------+");
						System.out.println(" | Suas doações de roupas/brinquedos devem |");
						System.out.println(" | ser entregues em nosso ponto de coleta, |");
						System.out.println(" |    Localizado na Rua Java, Nº 7 - SP    |");
						System.out.println(" |    Horário de Atendimento 08h as 17h.   |");
						System.out.println(" +-----------------------------------------+");
						
					break;
					default:
						System.out.println("OPÇÃO INVÁLIDA!\n Por favor digite novamente.");
					break;
				}
			break;
			default:
				System.out.println("OPÇÃO INVÁLIDA!\n Por favor digite novamente.");
			break;
		}
	}



	}


