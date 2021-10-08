package JavaHeranca;

public class ClasseCachorro {


public class CachorroClass extends ClasseAnimal{
	
	
	private String porte;
	
	public CachorroClass (String nome, int idade, String especie,String raca, String porte) {
		super(nome, idade, especie, raca);
		this.porte = porte;
	}
	
	
	public void print() {
		System.out.print(" CACHORRO");
		System.out.print("\n Nome: "+getNome());
		System.out.print("\n Idade: "+getIdade());
		System.out.print("\n Esp�cie: "+getEspecie());
		System.out.print("\n Ra�a: "+getRaca());
		System.out.print("\n Porte: "+porte);
	}
	
	public void som() {
		System.out.print("\n O cachorro come�ou a latir!");
		System.out.print("\n au au au ");
	}
	
	public void correr() {
		System.out.print("\n O cachorro come�ou a correr!");
	}

	// Get e Set
	public String getPorte() {return porte; }

	public void setPorte(String porte) { this.porte = porte;}
	
}
}
