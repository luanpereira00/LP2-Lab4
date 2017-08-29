import java.util.Scanner;
public class ContaBancaria{
	protected String cliente;
	protected int num_conta;
	protected double saldo;

	ContaBancaria(String cliente, int num_conta, double saldo){
		this.cliente = cliente;
		this.num_conta = num_conta;
		this.saldo = saldo;
	}

	public String getCliente(){
		return cliente;
	}

	public int getNum_conta(){
		return num_conta;
	}

	public double getSaldo(){
		return saldo;
	}

	public void setSaldo(double saldo){
		this.saldo = saldo;
	}

	public void imprimir(){
		imprimirContaBancaria();
	}

	public void imprimirContaBancaria(){
		System.out.println("Cc: " + getNum_conta() + " | " + 
			"Cliente: " + getCliente() + " | " + "Saldo: " + getSaldo());
	}

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

	public void realizarSaque(double valor){
		if(getSaldo()-valor>=0){
			setSaldo(getSaldo()-valor);
			System.out.println("Saque realizado com sucesso!");
		} else {
			System.out.println("Saldo insuficiente! Operacao falhou...");
		}

	}

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