package strategy;

public class CartaoDeCredito {
	private String nome;
	private String numero;
	private String codigoDeSeguranca;
	private String dataDeVencimento;
	private Bandeira bandeira;
	
	public Bandeira GetBandeira() {
		return this.bandeira;
	}
	
	public CartaoDeCredito(String nome, String numero, String codigoDeSeguranca, String dataDeVencimento, Bandeira bandeira) {
		this.nome = nome;
		this.numero = numero;
		this.codigoDeSeguranca = codigoDeSeguranca;
		this.dataDeVencimento = dataDeVencimento;
		this.bandeira = bandeira;
	}
}
