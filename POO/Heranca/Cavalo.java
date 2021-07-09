package POO;

public class Cavalo extends Animal {
	private String genero;
	private String cor;
	private float peso;
	
	public Cavalo (String nome, String idade, String genero, String cor, float peso)
	{
		super(nome, idade);
		this.genero=genero;
		this.cor=cor;
		this.peso=peso;
	}
	// metodo para os atritutos adicionais

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	// metodo adicional
	public void imprimirInfo()
	{
		System.out.println("Cavalo \nNome:"+getNome()+"\nIdade:"+getIdade()+"\nGenero:"+genero+"\nCor:"+cor+"\nPeso:"+peso);
	}
}
