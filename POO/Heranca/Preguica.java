package POO;

public class Preguica extends Animal {
	private String especie;
	private String regiao;
	private int numDedos;
	
	public Preguica(String idade, String especie, String regiao, int numDedos)
	{
		super(idade);
		this.especie=especie;
		this.regiao=regiao;	
		this.numDedos=numDedos;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public int getNumDedos() {
		return numDedos;
	}

	public void setNumDedos(int numDedos) {
		this.numDedos = numDedos;
	}
	
	public void imprimirInfo()
	{
		System.out.println("Pregui�a \nIdade:"+getIdade()+"\nRegi�o:"+regiao+"\nEspecie:"+especie+"\nN�mero de Dedos:"+numDedos);
		
	}
	

}
