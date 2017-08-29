public class ContaEspecial extends ContaBancaria{
	private double limite;
	
	public ContaEspecial(String cliente, int num_conta, double saldo, double limite){
		super(cliente, num_conta, saldo);
		this.limite = limite;
	}
	
	public double getLimite(){
		return limite;
	}
	
	public void setLimite(double limite){
		this.limite = limite;
	}
	
	public void realizarSaque(double valor){
		if(getSaldo()-valor>=limite){
			setSaldo(getSaldo()-valor);
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente! Operacao falhou...");
		}

	}
	
	public String toString(){
		return "Cliente: " + getCliente() + " | Num_conta: " + getNum_conta() + " \nSaldo: R$ " + getSaldo() + " - Limite: " + getLimite() + "\n"; 
	}
}
