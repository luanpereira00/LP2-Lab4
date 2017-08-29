public class Empresa{
	public static void main(String[] args){
		Cliente c1 = new Cliente("Xirlinha", "Parnamoscou", "4002-8922");
		c1.imprimirDados();
		System.out.println();
		
		Cliente c2 = new PessoaFisica("Xisliane", "MaqueibowCity", "7070-7070", "666.666.666-80");
		c2.imprimirDados();
		System.out.println();
		
		Cliente c3 = new PessoaJuridica("Aloha", "Havai", "1234-9876", "111-222-333-444-55", "Havai co.");
		c3.imprimirDados();
		System.out.println();
	}

}
