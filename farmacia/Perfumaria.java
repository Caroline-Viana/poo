package farmacia;

public class Perfumaria extends Farmacia{
	private String tipo;

	public Perfumaria(String nome, int unidade, String volume, double valor, String marca, String tipo) {
		super(nome, unidade, volume, valor, marca);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo do produto: " + this.tipo);
	}
}
