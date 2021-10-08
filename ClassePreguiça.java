package JavaHeranca;

public class ClassePreguiça {


public class PreguiçaClass extends ClasseAnimal{

	
	int tamanho;
	


	public PreguiçaClass (String nome, int idade, String especie, String raca, int tamanho) {
		super(nome, idade, especie, raca);
		this.tamanho = tamanho;
	}
	
	
	public void print() {
		System.out.print(" BICHO-PREGUIÇA");
		System.out.print("\n Nome: "+getNome());
		System.out.print("\n Idade: "+getIdade());
		System.out.print("\n Espécie: "+getEspecie());
		System.out.print("\n Raça: "+getRaca());
		System.out.print("\n Tamanho: "+tamanho+"cm");
	}
	
	public void som() {
		System.out.print("\n O preguiça começou a fazer um som!");
		System.out.print("\n uuuuahh");
	}
	
	public void subir() {
		System.out.print("\n A preguiça começou a subir na árvore!");
	}

	
	public int getTamanho() { return tamanho; }

	public void setTamanho(int tamanho) { this.tamanho = tamanho;}
	
}
}