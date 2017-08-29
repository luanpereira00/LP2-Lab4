public class PessoaFisica extends Cliente{
	private String cpf; //O CPF de uma pessoa fisica

	/**
	* Construtor parametrizado
	*/
	public PessoaFisica(String nome, String endereco, String telefone, String cpf){
		super(nome, endereco, telefone);
		this.cpf = cpf;
	}

	/**
	* Metodos getters e setters
	*/
	public String getCpf(){
		return cpf;
	}

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