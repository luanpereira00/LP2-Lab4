/**
* Classe que define os metodos e atributos de uma conta poupanca
* @author Luan Pereira
* 
*/
public class ContaPoupanca extends ContaBancaria{
	private int Dia_de_rendimento;
	
	/**
	* Construtor parametrizado
	* @param cliente O cliente
	* @param num_conta O numero da conta que esta sendo criada
	* @param saldo O saldo da conta
	* @param dia O dia de rendimento da poupanca
	*/
	public ContaPoupanca(String cliente, int num_conta, double saldo, int dia){
		super(cliente, num_conta, saldo);
		Dia_de_rendimento = dia;
	}
	
	/**
	* @return Retorna o dia de rendimento da poupanca
	*/
	public int getDiaDeRendimento(){
		return Dia_de_rendimento;
	}
	
	/**
	* Calcula um novo saldo de acordo com uma taxa aplicada sobre o saldo atual
	*@param taxaDaPoupanca A taxa que servira para atualizar o saldo
	*/
	public void calcularNovoSaldo(double taxaDaPoupanca){
		if(taxaDaPoupanca>=0){
			setSaldo(getSaldo()+getSaldo()*taxaDaPoupanca);
		}
		else {
			System.out.println("Valor de taxa invalido! Nenhum alteracao foi realizada!");
		}
	}
	
	/**
	*@return Retorna o objeto no formato de String
	*/
	public String toString(){
		return "Cliente: " + getCliente() + " | Num_conta: " + getNum_conta() + " \nSaldo: R$ " + getSaldo() + " - Dia de rendimento: " + getDiaDeRendimento() + "\n"; 
	}
}
