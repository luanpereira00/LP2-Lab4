/**
* Classe que define um cliente
* @author Luan Pereira
* 
*/
public class Cliente{
	protected String nome; //O nome do cliente
	protected String endereco; //O endereco do cliente
	protected String telefone; // O telefone do cliente

	/**
	* Construtor parametrizado
	*@param nome O nome do cliente
	*@param endereco O endereco do cliente
	*@param telefone O telefone do cliente
	*/
	public Cliente(String nome, String endereco, String telefone){
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	/**
	* @return O nome do cliente
	*/
	public String getNome(){
		return nome;
	}

	/**
	* @return O endereco do cliente
	*/
	public String getEndereco(){
		return endereco;
	}

	/**
	* @return O telefone do cliente
	*/
	public String getTelefone(){
		return telefone;
	}

	/**
	* @param nome O nome do cliente
	*/
	public void setNome(String nome){
		this.nome = nome;
	}

	/**
	* @param endereco O endereco do cliente
	*/
	public void setEndereco(String endereco){
		this.endereco = endereco;
	}

	/**
	* @param telefone O telefone do cliente
	*/
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}

	/**
	*	Metodo que define a forma de impressao de um Cliente
	*/
	protected void printCliente(){
		System.out.println("Nome: " + getNome());
		System.out.println("Telefone: " + getTelefone());
		System.out.println("Endereco: " + getEndereco());
	}

	/**
	*	Metodo que imprime os dados de um cliente
	*/
	public void imprimirDados(){
		printCliente();
	}
}