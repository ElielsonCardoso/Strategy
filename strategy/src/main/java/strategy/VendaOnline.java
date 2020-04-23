package strategy;

public class VendaOnline {
	private final CartaoDeCredito cartaoDeCredito;
	private final double valor;

	public VendaOnline(CartaoDeCredito cartaoDeCredito, double valor) {
		this.cartaoDeCredito = cartaoDeCredito; 
		this.valor = valor; 
	}
	
	public double calculaJurosDaVendaOnline() {
		double valorJuros = 0.0;

		Bandeira bandeira = this.cartaoDeCredito.GetBandeira(); 
		valorJuros = bandeira.calculaJuros(this.valor);
		
		return valorJuros;
	}	
}
