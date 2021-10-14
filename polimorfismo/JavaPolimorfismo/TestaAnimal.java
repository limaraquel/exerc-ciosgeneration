package JavaPolimorfismo;

public class TestaAnimal {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			CachorroClass cachorro = new CachorroClass();
			Cavalo cavalo= new Cavalo();
			Preguica preguica= new Preguica();
			
			int x = (int) (Math.random()*3.0);
			
			System.out.println("\nO som que o animal emite é: ");
			
			switch(x)
			{
			case 0:cachorro.som();
			break;
			case 1:cavalo.som();
			break;
			case 2:preguica.som();
			break;
			default:System.out.println("\nError :(");
			}

		}

	}

