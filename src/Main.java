
public class Main {

	public static void main(String[] args) {
		
		Cliente nicolas = new Cliente();
		
		nicolas.setNome("Nicolas");
		
		Conta cc = new ContaCorrente(nicolas);
		cc.depositar(300);
		Conta poupanca = new ContaPoupanca(nicolas);
		
		cc.transferir(100, poupanca);
		
		Cliente jose = new Cliente();
		
		jose.setNome("Jose");
		Conta cc2 = new ContaCorrente(jose);
		cc2.depositar(500);
		Conta poupanca2 = new ContaPoupanca(jose);
		poupanca2.depositar(300);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		cc2.imprimirExtrato();
		poupanca2.imprimirExtrato();

		
	}

}
