package exercicios0610;

import java.util.Scanner;

public class exercício2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
	}
	 Scanner scan = new Scanner(System.in);
     int[][] matriz = new int[3][3];
     int total = 0;

     for (int i = 0; i < matriz.length; i++) {
         for (int j = 0; j < matriz[i].length; j++) {
             System.out.println("\nEntre com um número inteiro: ");
             matriz[i][j] = scan.nextInt();
             if (matriz[i][j] > 10){
                 total++;
             }
         }
     }
     System.out.printf("\n Existem %d números maiores que 10.",total);
 }
}

