package POO;

public class Cliente {
  /*
   *Crie uma classe cliente e apresente os atributos e m�todos referentes esta classe, em seguida crie
   * um objeto cliente, defina as instancias deste objeto e apresente as informa��es deste objeto no 
   * console.
   */
	//cliente da minha loja de roupas
	//declara��o dos atributos 
	private String nome;
	private String telefone;
	private String idade;
	private String tamanhoRoupa;
	
	//metodos no contrutor
	public Cliente(String nome, String telefone, String idade, String tamanhoRoupa)
	{
		this.nome= nome;
		this.telefone=telefone;
		this.idade=idade;
		this.tamanhoRoupa= tamanhoRoupa;
	}
	//declara��o dos demais m�todos da classe
	
		public void imprimirInfo()
		{
			System.out.println("Nome:"+ nome+" Telefone:"+telefone+" Idade:"
					+ " Tamanho de roupa:" + tamanhoRoupa);
		}
		
		//Get= pegar //Set=inserir
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getIdade() {
			return idade;
		}
		public void setIdade(String idade) {
			this.idade = idade;
		}
		public String getTamanhoRoupa() {
			return tamanhoRoupa;
		}
		public void setTamanhoRoupa(String tamanhoRoupa) {
			this.tamanhoRoupa = tamanhoRoupa;
		}
		
		
	
}
