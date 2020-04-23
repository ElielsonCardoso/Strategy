package strategy;

public class App {

	public static void main(String[] args) {		
		Bandeira A = Bandeira.A;
		Bandeira B = Bandeira.B; 
		
		CartaoDeCredito cartao01 = new CartaoDeCredito("Elielson C Silva", "165123156451321", "123", "01/12/2020", A);
		CartaoDeCredito cartao02 = new CartaoDeCredito("João A I Bispo", "191513215487879", "167", "01/10/2020", B);
		
		VendaOnline venda01 = new VendaOnline(cartao01, 100.00);
		VendaOnline venda02 = new VendaOnline(cartao02, 100.00);
		
		double juros = 0.00;
		
		juros = venda01.calculaJurosDaVendaOnline();			
		System.out.println("Juros da venda 01: R$"+juros);
		
		juros = venda02.calculaJurosDaVendaOnline();			
		System.out.println("Juros da venda 02: R$"+juros);		
	}

}
