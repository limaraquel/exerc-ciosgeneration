package JavaHeranca;

public class ClasseCavalo {


public class CavaloClass extends ClasseAnimal{

	
	String cor;
	
	
	public CavaloClass (String nome, int idade, String especie,String raca, String cor) {
		super(nome, idade, especie, raca);
		this.cor = cor;
	}
	

	public void print() {
		System.out.print(" CAVALO");
		System.out.print("\n Nome: "+getNome());
		System.out.print("\n Idade: "+getIdade());
		System.out.print("\n Espécie: "+getEspecie());
		System.out.print("\n Raça: "+getRaca());
		System.out.print("\n Cor: "+cor);
	}
	
	public void som() {
		System.out.print("\n O cavalo começou a relinchar!");
		System.out.print("\n IHÁA");
	}
	
	public void correr() {
		System.out.print("\n O cavalo começou a trotar!");
	}

	
	public String getCor() { return cor; }

	public void setCor(String cor) { this.cor = cor;}
	
}
}
