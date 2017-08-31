import java.util.Scanner;

/**
* Classe que define os metodos e atributos de uma conta bancaria
* @author Luan Pereira
* 
*/
public class ContaBancaria{
	protected String cliente;
	protected int num_conta;
	protected double saldo;

	/**
	* Construtor parametrizado
	* @param cliente O cliente
	* @param num_conta O numero da conta que esta sendo criada
	* @param saldo O saldo da conta
	*/
	ContaBancaria(String cliente, int num_conta, double saldo){
		this.cliente = cliente;
		this.num_conta = num_conta;
		this.saldo = saldo;
	}

	/**
	* @return Retorna o nome do cliente
	*/
	public String getCliente(){
		return cliente;
	}

	/**
	* @return Retorna o numero da conta bancaria
	*/
	public int getNum_conta(){
		return num_conta;
	}

	/**
	* @return Retorna o saldo da conta
	*/
	public double getSaldo(){
		return saldo;
	}

	/**
	* Atualiza o valor do saldo
	* @param saldo O novo valor do saldo
	*/
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}

	/**
	* Imprime o objeto na saida padrao
	*/
	public void imprimir(){
		imprimirContaBancaria();
	}

	/**
	* Define como deve ser imprimido o objeto
	*/
	public void imprimirContaBancaria(){
		System.out.println("Cc: " + getNum_conta() + " | " + 
			"Cliente: " + getCliente() + " | " + "Saldo: " + getSaldo());
	}

	/**
	* Metodo para saque na conta
	*/
	public void sacar(){
		imprimir();
		System.out.println("Digite o valor do saque: ");
		Scanner sc = new Scanner(System.in);
		double valor = sc.nextDouble();
		if(valor>0){
			realizarSaque(valor);
		} else {
			System.out.println("Valor de saque invalido! Saindo da operacao...");
		}
	}

	/**
	* Metodo que retira o valor da conta
	*/
	public void realizarSaque(double valor){
		if(getSaldo()-valor>=0){
			setSaldo(getSaldo()-valor);
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente! Operacao falhou...");
		}

	}

	/**
	* Metodo que deposita na conta
	*/
	public void depositar(){
		imprimir();
		System.out.println("Digite o valor do deposito: ");
		Scanner sc = new Scanner(System.in);
		double valor = sc.nextDouble();
		if(valor>0){
			setSaldo(getSaldo()+valor);
		} else {
			System.out.println("Valor de deposito invalido! Saindo da operacao...");
		}
	}



}