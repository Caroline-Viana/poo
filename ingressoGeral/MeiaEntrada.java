package ingressoGeral;

public class MeiaEntrada extends Ingresso{
	private String tipo;

	public MeiaEntrada(int data, String nomeDoEvento, double valorDoIngresso, String local, int horario, String tipo) {
		super(data, nomeDoEvento, valorDoIngresso, local, horario);
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
		System.out.println("Tipo da Entrada: " + this.tipo);
	}
}
