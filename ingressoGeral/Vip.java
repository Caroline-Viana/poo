package ingressoGeral;

public class Vip extends Ingresso{
	private String logo;
	private int numeracao;
	
	public Vip(int data, String nomeDoEvento, double valorDoIngresso, String local, int horario, String logo,
			int numeracao) {
		super(data, nomeDoEvento, valorDoIngresso, local, horario);
		this.logo = logo;
		this.numeracao = numeracao;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public int getNumeracao() {
		return numeracao;
	}

	public void setNumeracao(int numeracao) {
		this.numeracao = numeracao;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println(this.logo);
		System.out.println("Numeração: " + this.numeracao);
	}
}
