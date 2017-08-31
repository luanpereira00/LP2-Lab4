/**
* Classe que define uma pessoa juridica
* @author Luan Pereira
* 
*/
public class PessoaJuridica extends Cliente{
	private String cnpj; //O CNPJ de uma pessoa juridica
	private String nomeFantasia; //O nome fantasia

	/**
	* Construtor parametrizado
	*@param nome O nome do cliente
	*@param endereco O endereco do cliente
	*@param telefone O telefone do cliente
	*@param cnpj O cnpj da pessoa fisica
	*@param nomeFantasia O nome fantasia da empresa
	*/
	public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String nomeFantasia){
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}

	/**
	* @return O cnpj do cliente
	*/
	public String getCnpj(){
		return cnpj;
	}

	/**
	* @param cnpj O cnpj do cliente
	*/
	public void setCpf(String cnpj){
		this.cnpj = cnpj;
	}

	/**
	* @return O nome fantasia do cliente
	*/
	public String getNomeFantasia(){
		return nomeFantasia;
	}

	/**
	* @param nomeFantasia O nome fantasia do cliente
	*/
	public void setNomeFantasia(String nomeFantasia){
		this.nomeFantasia = nomeFantasia;
	}

	/**
	*	Metodo que define a forma de impressao de uma pessoa juridica
	*/
	public void printPessoaJuridica(){
		printCliente();
		System.out.println("CNPJ: " + cnpj);
		System.out.println("Nome Fantasia: " + nomeFantasia);
	}

	/**
	*	Metodo que imprime os dados de uma pessoa juridica
	*/
	public void imprimirDados(){
		printPessoaJuridica();
	}
}
