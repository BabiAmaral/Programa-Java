package POO;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro("Bob","3anos","Labrador","Marrom");
		Cachorro cachorro2 = new Cachorro("Marley","10anos","Golden","Preto");
		
		cachorro1.imprimirInfo();
		System.out.println("************************************");
		cachorro2.imprimirInfo();
		
		System.out.println("\n\n");
		Cavalo cavalo1 = new Cavalo("Pé de pano","16anos","Macho","Preto",420);
	    Cavalo cavalo2 = new Cavalo("Spirit", "20anos", "Macho","Marrom",360);
	    
	    cavalo1.imprimirInfo();
	    System.out.println("************************************");
	    cavalo2.imprimirInfo();
	    //especie, regiao e numero dedo, preguiça-comum (Bradypus variegatus), preguiça-de-coleira 
	    Preguica preguica1= new Preguica("4anos", "preguiça-comum","América Central",3);
	    Preguica preguica2= new Preguica("10anos","preguiça-de-coleira", "America do Sul", 2);
	    	
	    System.out.println("\n\n");
	    preguica1.imprimirInfo();
	    System.out.println("************************************");
	    preguica2.imprimirInfo();
	    
	    
	}

}
