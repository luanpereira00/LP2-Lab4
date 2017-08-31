/**
* Classe que define uma pessoa fisica
* @author Luan Pereira
* 
*/
public class PessoaFisica extends Cliente{
	private String cpf; //O CPF de uma pessoa fisica

	/**
	* Construtor parametrizado
	*@param nome O nome do cliente
	*@param endereco O endereco do cliente
	*@param telefone O telefone do cliente
	*@param cpf O cpf da pessoa fisica
	*/
	public PessoaFisica(String nome, String endereco, String telefone, String cpf){
		super(nome, endereco, telefone);
		this.cpf = cpf;
	}

	/**
	* @return O cpf do cliente
	*/
	public String getCpf(){
		return cpf;
	}

	/**
	* @param cpf O cpf do cliente
	*/
	public void setCpf(String cpf){
		this.cpf = cpf;
	}

	/**
	*	Metodo que define a forma de impressao de uma pessoa fisica
	*/
	public void printPessoaFisica(){
		printCliente();
		System.out.println("CPF: " + cpf);
	}

	/**
	*	Metodo que imprime os dados de uma pessoa fisica
	*/
	public void imprimirDados(){
		printPessoaFisica();
	}
}