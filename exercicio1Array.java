package exercicios0610;

public class exercicio1Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			 
		        int[] array = {1, 0, 5, -2, -5, 7};
		        int soma = array[0] + array[1] + array[5];
		        array[4] = 100;
		        for (int i = 0;i < array.length;i++){
		            if (i == 5) {
		                System.out.print(array[i] + ".");
		            } else {
		                System.out.print(array[i] + ", ");
		            }
		        }
		    
	

	}

}
