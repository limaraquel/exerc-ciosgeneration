package JavaHeranca;

public class ClasseAnimal {


		private String nome;
		private int idade;
		private String especie;
		private String raca;
		
		
		public ClasseAnimal(String nome2, int idade2, String especie2, String raca2) {
			// TODO Auto-generated constructor stub
		}
		public void AnimalClass (String nome, int idade, String especie, String raca) {
			
			this.nome = nome;
			this.idade = idade;
			this.especie = especie;
			this.raca = raca;
		}
		public void AnimalClass (String nome, int idade, String especie) {
			
			this.nome = nome;
			this.idade = idade;
			this.especie = especie;
		}

		public String getNome() {return nome; }

		public void setNome(String nome) {this.nome = nome;}

		public int getIdade() { return idade; }

		public void setIdade(int idade) { this.idade = idade; }

		public String getEspecie() { return especie; }

		public void setEspecie(String especie) { this.especie = especie; }

		public String getRaca() { return raca; }

		public void setRaca(String raça) { this.raca = raça; }
		
	}
