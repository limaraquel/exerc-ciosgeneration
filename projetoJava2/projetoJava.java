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
		System.out.println(" |             MENU DE OP��ES            |");
		System.out.println(" +---------------------------------------+");
		System.out.println(" |       1- Ajudar Moradores de Rua      |");
		System.out.println(" +---------------------------------------+");
		System.out.println(" |       2- Ajudar Orfanatos Carentes    |");
		System.out.println(" +---------------------------------------+");
		System.out.println(" |       3- Ajudar Asilos Carentes       |");
		System.out.println(" +---------------------------------------+");

		System.out.println("\n ---------> Digite uma Op��o: ");
		
		int opcao = menu.nextInt();
		
		switch (opcao)
		{
			case 1: 
				System.out.println(" +---------------------------------------+");
				System.out.println(" |        -> Op��o 1 Selecionada <-      |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     -> Ajudar Moradores de Rua <-     |");
				System.out.println(" +---------------------------------------+\n");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     Como voc� gostaria de ajudar?     |");
				System.out.println(" +---------------------------------------+");

				
				System.out.println(" +---------------------------------------+");
				System.out.println(" |            MENU DE OP��ES             |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |      1- Doa��o em Dinheiro            |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |      2- Doa��o de Alimentos           |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |      3- Doa��o de Roupas/brinquedos   |");
				System.out.println(" +---------------------------------------+");

				
				System.out.println(" +---------------------------------------+");
				System.out.println(" | *OBS: As doa��es de alimentos, roupas |");
				System.out.println(" | e brinquedos dever�o ser entregues em |");
				System.out.println(" |         nosso ponto de coleta.        |");
				System.out.println(" +---------------------------------------+");
				
				System.out.println("\n ---------> Digite uma Op��o: ");
				
				int opcao1 = menu.nextInt();
				
				switch (opcao1)
				{
					case 1:
					System.out.println(" +---------------------------------------+");
					System.out.println(" |  Todo valor doado ser� convertido em  |");
					System.out.println(" |      alimentos, cobertores, roupas    |");
					System.out.println(" |    medicamentos e itens de higiene    |");
					System.out.println(" +---------------------------------------+");
					
					
					System.out.println("\n------> Qual Valor voc� deseja doar: ");
					
					
					Float valor=menu.nextFloat();
					
					System.out.println(" +---------------------------------------------+");
					System.out.printf (" |     Seu boleto de R$ %.2f  foi gerado!     |\n", valor);
					System.out.println(" | Acesse o link https://ongjavadobem.org/pay  |");
					System.out.println(" +---------------------------------------------+");
					
					break;
				
					case 2:
					System.out.println(" +---------------------------------------+");
					System.out.println(" |  Suas doa��es de alimentos devem ser  |");
					System.out.println(" |  entregues em nosso ponto de coleta,  |");
					System.out.println(" |     Localizado na Rua Java, N� 7 - SP |");
					System.out.println(" |   Hor�rio de Atendimento 08h as 17h.  |");
					System.out.println(" +---------------------------------------+");
					break;
				
					case 3:
						System.out.println(" +-----------------------------------------+");
						System.out.println(" | Suas doa��es de roupas/brinquedos devem |");
						System.out.println(" | ser entregues em nosso ponto de coleta, |");
						System.out.println(" |    Localizado na Rua Java, N� 7 - SP    |");
						System.out.println(" |    Hor�rio de Atendimento 08h as 17h.   |");
						System.out.println(" +-----------------------------------------+");
					break;
					default:
						System.out.println("OP��O INV�LIDA!\n Por favor digite novamente.");
					break;
				}	
				break;
				
			
			case 2:
				System.out.println(" +---------------------------------------+");
				System.out.println(" |        -> Op��o 2 Selecionada <-      |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     -> Ajudar Orfanatos carentes <-    |");
				System.out.println(" +---------------------------------------+\n");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     Como voc� gostaria de ajudar?     |");
				System.out.println(" +---------------------------------------+");
				
				System.out.println(" +---------------------------------------+");
				System.out.println(" |            MENU DE OP��ES             |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |      1- Doa��o em Dinheiro            |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |      2- Doa��o de Alimentos           |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |      3- Doa��o de Roupas/Brinquedos   |");
				System.out.println(" +---------------------------------------+");
				
				System.out.println(" +---------------------------------------+");
				System.out.println(" | *OBS: As doa��es de alimentos, roupas |");
				System.out.println(" | e brinquedos dever�o ser entregues em |");
				System.out.println(" |         nosso ponto de coleta.        |");
				System.out.println(" +---------------------------------------+");

				System.out.println("\n ---------> Digite uma Op��o: ");
				
				int opcao2 = menu.nextInt();
				
				switch (opcao2)
				{
					case 1:
						System.out.println(" +---------------------------------------+");
						System.out.println(" |  Todo valor doado ser� convertido em  |");
						System.out.println(" |      alimentos, cobertores, roupas    |");
						System.out.println(" |    medicamentos e itens de higiene    |");
						System.out.println(" +---------------------------------------+");
						System.out.println("\n------> Qual Valor voc� deseja doar: ");
					 
					Float valor=menu.nextFloat();
					System.out.println(" +---------------------------------------------+");
					System.out.printf (" |     Seu boleto de R$ %.2f  foi gerado!     |\n", valor);
					System.out.println(" | Acesse o link https://ongjavadobem.org/pay  |");
					System.out.println(" +---------------------------------------------+");
					
					break;
				
					case 2:
						System.out.println(" +---------------------------------------+");
						System.out.println(" |  Suas doa��es de alimentos devem ser  |");
						System.out.println(" |  entregues em nosso ponto de coleta,  |");
						System.out.println(" |     Localizado na Rua Java, N� 7 - SP |");
						System.out.println(" |   Hor�rio de Atendimento 08h as 17h.  |");
						System.out.println(" +---------------------------------------+");
					break;
				
					case 3:
						System.out.println(" +-----------------------------------------+");
						System.out.println(" | Suas doa��es de roupas/brinquedos devem |");
						System.out.println(" | ser entregues em nosso ponto de coleta, |");
						System.out.println(" |    Localizado na Rua Java, N� 7 - SP    |");
						System.out.println(" |    Hor�rio de Atendimento 08h as 17h.   |");
						System.out.println(" +-----------------------------------------+");
					break;
					default:
						System.out.println("OP��O INV�LIDA!\n Por favor digite novamente.");
					break;
				}
			break;
			
			case 3: 
				System.out.println(" +---------------------------------------+");
				System.out.println(" |        -> Op��o 3 Selecionada <-      |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     -> Ajudar Asilos carentes <-      |");
				System.out.println(" +---------------------------------------+\n");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |     Como voc� gostaria de ajudar?     |");
				System.out.println(" +---------------------------------------+");
				
				System.out.println(" +---------------------------------------+");
				System.out.println(" |            MENU DE OP��ES             |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |      1- Doa��o em Dinheiro            |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |      2- Doa��o de Alimentos           |");
				System.out.println(" +---------------------------------------+");
				System.out.println(" |      3- Doa��o de Roupas/Brinquedos   |");
				System.out.println(" +---------------------------------------+");
				
				System.out.println(" +---------------------------------------+");
				System.out.println(" | *OBS: As doa��es de alimentos, roupas |");
				System.out.println(" | e brinquedos dever�o ser entregues em |");
				System.out.println(" |         nosso ponto de coleta.        |");
				System.out.println(" +---------------------------------------+");


				System.out.println("\n ---------> Digite uma Op��o: ");
				
				int opcao3 = menu.nextInt();
				
				switch (opcao3)
				{
					case 1:
						System.out.println(" +---------------------------------------+");
						System.out.println(" |  Todo valor doado ser� convertido em  |");
						System.out.println(" |      alimentos, cobertores, roupas    |");
						System.out.println(" |    medicamentos e itens de higiene    |");
						System.out.println(" +---------------------------------------+");
						System.out.println("\n------> Qual Valor voc� deseja doar: ");
						 
					Float valor=menu.nextFloat();
					System.out.println(" +---------------------------------------------+");
					System.out.printf (" |     Seu boleto de R$ %.2f  foi gerado!     |\n", valor);
					System.out.println(" | Acesse o link https://ongjavadobem.org/pay  |");
					System.out.println(" +---------------------------------------------+");
					break;
				
					case 2:
						System.out.println(" +---------------------------------------+");
						System.out.println(" |  Suas doa��es de alimentos devem ser  |");
						System.out.println(" |  entregues em nosso ponto de coleta,  |");
						System.out.println(" |     Localizado na Rua Java - SP       |");
						System.out.println(" |   Hor�rio de Atendimento 08h as 17h.  |");
						System.out.println(" +---------------------------------------+");
					break;
				
					case 3:
						System.out.println(" +-----------------------------------------+");
						System.out.println(" | Suas doa��es de roupas/brinquedos devem |");
						System.out.println(" | ser entregues em nosso ponto de coleta, |");
						System.out.println(" |    Localizado na Rua Java, N� 7 - SP    |");
						System.out.println(" |    Hor�rio de Atendimento 08h as 17h.   |");
						System.out.println(" +-----------------------------------------+");
						
					break;
					default:
						System.out.println("OP��O INV�LIDA!\n Por favor digite novamente.");
					break;
				}
			break;
			default:
				System.out.println("OP��O INV�LIDA!\n Por favor digite novamente.");
			break;
		}
	}



	}


