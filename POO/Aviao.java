package POO;

public class Aviao {
/*
 * Crie uma classe avião e apresente os atributos e métodos referentes esta 
 * classe, em seguida crie um objeto avião, defina as instancias deste objeto 
 * e apresente as informações deste objeto no console.
 */
    //demonstração dos atributos(características do avião)
	private String companhiaAerea;
	private String tamanho;
	private String restricaoDeAcesso;
	int numLugares;
	//método construtor
	public Aviao(String companhiaAerea, String tamanho, String restricaoDeAcesso, int numLugares)
	{
		this.companhiaAerea= companhiaAerea;
		this.tamanho= tamanho;
		this.restricaoDeAcesso= restricaoDeAcesso;
		this.numLugares= numLugares;
	}
	public String getInformacoesDoAviao()
	{
		String InformacoesDoAviao= "Companhia Aerea:"+ companhiaAerea+ " Tamanho:"+ tamanho+" Restrição de acesso dos voos:"+ restricaoDeAcesso+" Numero de lugares:"+numLugares;
		return InformacoesDoAviao;
	}
	
}
