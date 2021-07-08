package POO;

public class TesteAviao {

	public static void main(String[] args) {
		Aviao aviao1= new Aviao ("Azul", "grande","internacional", 240);
		//aviao1.getInformacoesDoAviao();
		System.out.println(aviao1.getInformacoesDoAviao());
		
		Aviao aviao2= new Aviao ("TAM", "media","nacional", 100);
		System.out.println(aviao2.getInformacoesDoAviao());
	}

}
