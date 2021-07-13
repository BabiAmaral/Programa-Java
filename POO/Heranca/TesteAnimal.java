package POO.Heranca;

public class TesteAnimal {

	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro("Bob","3anos","Labrador","Marrom");
		Cachorro cachorro2 = new Cachorro("Marley","10anos","Golden","Preto");
		
		cachorro1.imprimirInfo();
		cachorro1.som();
		cachorro1.capacidade();
		System.out.println("************************************");
		cachorro2.imprimirInfo();
		cachorro2.som();
		cachorro2.capacidade();
		
		System.out.println("\n\n");
		Cavalo cavalo1 = new Cavalo("Pé de pano","16anos","Macho","Preto",420);
	    Cavalo cavalo2 = new Cavalo("Spirit", "20anos", "Macho","Marrom",360);
	    
	    cavalo1.imprimirInfo();
	    cavalo1.som();
	    cavalo1.capacidade();
	    System.out.println("************************************");
	    cavalo2.imprimirInfo();
	    cavalo1.som();
	    cavalo1.capacidade();
	    
	    //especie, regiao e numero dedo, preguiça-comum (Bradypus variegatus), preguiça-de-coleira 
	    Preguica preguica1= new Preguica("4anos", "preguiça-comum","América Central",3);
	    Preguica preguica2= new Preguica("10anos","preguiça-de-coleira", "America do Sul", 2);
	    	
	    System.out.println("\n\n");
	    preguica1.imprimirInfo();
	    preguica1.som();
	    preguica1.capacidade();
	    System.out.println("************************************");
	    preguica2.imprimirInfo();
	    preguica2.som();
	    preguica2.capacidade();
	    
	    
	}

}
