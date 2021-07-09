package POO;

public class Cachorro extends Animal {
	
	//declaração de atributos adicionais
	private String raca;
	private String cor;
	//construtor
	public Cachorro(String nome, String idade, String raca, String cor)
	{
		super(nome, idade);
		this.raca=raca;
		this.cor=cor;		
	}
	//metodo dos meus atributos adicionais
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	//metodo adicional
	public void imprimirInfo()
	{
		System.out.println("Cachorro \nNome:"+getNome()+"\nIdade:"+getIdade()+"\nRaça:"+raca+"\nCor:"+cor);
	}
	
}
