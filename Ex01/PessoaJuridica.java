public class PessoaJuridica extends Cliente{
	private String cnpj; //O CNPJ de uma pessoa juridica
	private String nomeFantasia;

	/**
	* Construtor parametrizado
	*/
	public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, String nomeFantasia){
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
	}

	/**
	* Metodos getters e setters
	*/
	public String getCnpj(){
		return cnpj;
	}

	public void setCpf(String cnpj){
		this.cnpj = cnpj;
	}

	public String getNomeFantasia(){
		return nomeFantasia;
	}

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