package POO;
//Herança
public class Animal {
	//declaracao dos atributos
	private String nome;
	private String idade;
	
	//método construtor
	public Animal(String nome, String idade)
	{
		super();
		this.nome= nome;
		this.idade=idade;
	}
	public Animal(String idade)
	{
		super();
		this.idade=idade;
	}
	//metodos 

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}
	
}
