package POO;

public class Aviao {
/*
 * Crie uma classe avi�o e apresente os atributos e m�todos referentes esta 
 * classe, em seguida crie um objeto avi�o, defina as instancias deste objeto 
 * e apresente as informa��es deste objeto no console.
 */
    //demonstra��o dos atributos(caracter�sticas do avi�o)
	private String companhiaAerea;
	private String tamanho;
	private String restricaoDeAcesso;
	int numLugares;
	//m�todo construtor
	public Aviao(String companhiaAerea, String tamanho, String restricaoDeAcesso, int numLugares)
	{
		this.companhiaAerea= companhiaAerea;
		this.tamanho= tamanho;
		this.restricaoDeAcesso= restricaoDeAcesso;
		this.numLugares= numLugares;
	}
	public String getInformacoesDoAviao()
	{
		String InformacoesDoAviao= "Companhia Aerea:"+ companhiaAerea+ " Tamanho:"+ tamanho+" Restri��o de acesso dos voos:"+ restricaoDeAcesso+" Numero de lugares:"+numLugares;
		return InformacoesDoAviao;
	}
	
}
