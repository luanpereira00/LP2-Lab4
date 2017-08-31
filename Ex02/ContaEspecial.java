/**
* Classe que define os metodos e atributos de uma conta especial
* @author Luan Pereira
* 
*/
public class ContaEspecial extends ContaBancaria{
	private double limite;
	
	/**
	* Construtor parametrizado
	* @param cliente O cliente
	* @param num_conta O numero da conta que esta sendo criada
	* @param saldo O saldo da conta
	* @param limite O limite da conta
	*/
	public ContaEspecial(String cliente, int num_conta, double saldo, double limite){
		super(cliente, num_conta, saldo);
		this.limite = limite;
	}
	
	/**
	* @return Retorna o limite da conta 
	*/
	public double getLimite(){
		return limite;
	}
	
	/**
	* Atualiza o limite da conta
	*/
	public void setLimite(double limite){
		this.limite = limite;
	}
	
	/**
	* Realiza um saque na conta
	*/
	public void realizarSaque(double valor){
		if(getSaldo()-valor>=limite){
			setSaldo(getSaldo()-valor);
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente! Operacao falhou...");
		}

	}
	
	/**
	*@return Retorna o objeto no formato de String
	*/
	public String toString(){
		return "Cliente: " + getCliente() + " | Num_conta: " + getNum_conta() + " \nSaldo: R$ " + getSaldo() + " - Limite: " + getLimite() + "\n"; 
	}
}
