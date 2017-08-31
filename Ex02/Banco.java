/**
* Classe que define os metodo do main do sistema e testa algumas contas criadas
* @author Luan Pereira
* 
*/
public class Banco{
	/**
	* Metodo main
	*/
	public static void main(String[] args){
		ContaPoupanca c1 = new ContaPoupanca("Eu", 123, 0, 10);
		System.out.println(c1.toString());
	}
}
