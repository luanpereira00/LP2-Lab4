public class ContaPoupanca extends ContaBancaria{
	private int Dia_de_rendimento;
	
	public ContaPoupanca(String cliente, int num_conta, double saldo, int dia){
		super(cliente, num_conta, saldo);
		Dia_de_rendimento = dia;
	}
	
	public int getDiaDeRendimento(){
		return Dia_de_rendimento;
	}
	
	public void calcularNovoSaldo(double taxaDaPoupanca){
		if(taxaDaPoupanca>=0){
			setSaldo(getSaldo()+getSaldo()*taxaDaPoupanca);
		}
		else {
			System.out.println("Valor de taxa invalido! Nenhum alteracao foi realizada!");
		}
	}
	
	public String toString(){
		return "Cliente: " + getCliente() + " | Num_conta: " + getNum_conta() + " \nSaldo: R$ " + getSaldo() + " - Dia de rendimento: " + getDiaDeRendimento() + "\n"; 
	}
}
