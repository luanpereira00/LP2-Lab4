public class Cliente{
	protected String nome; //O nome do cliente
	protected String endereco; //O endereco do cliente
	protected String telefone; // O telefone do cliente

	/**
	* Construtor parametrizado
	*/

	public Cliente(String nome, String endereco, String telefone){
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	/**
	* Metodos getters e setters
	*/

	public String getNome(){
		return nome;
	}

	public String getEndereco(){
		return endereco;
	}

	public String getTelefone(){
		return telefone;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public void setEndereco(String endereco){
		this.endereco = endereco;
	}

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