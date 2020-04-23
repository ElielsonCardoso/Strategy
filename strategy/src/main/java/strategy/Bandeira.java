package strategy;

public enum Bandeira implements Juros{
	A{
		public double calculaJuros(double valor) {
			return valor*0.01;
		}
	},
	B{
		public double calculaJuros(double valor) {
			return valor*0.015;
		}
	},
	C{
		public double calculaJuros(double valor) {
			return valor*0.02;
		}
	};
}
