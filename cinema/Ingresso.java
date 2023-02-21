package cinema;

public class Ingresso {
	
	private int numeroDaSala;
	private String nomeDoFilme;
	private double valorDoIngresso;
	private String lugar;
	private String tipo;
	
	public Ingresso(int numeroDaSala, String nomeDoFilme, double valorDoIngresso, String lugar, String tipo) {
		this.numeroDaSala = numeroDaSala;
		this.nomeDoFilme = nomeDoFilme;
		this.valorDoIngresso = valorDoIngresso;
		this.lugar = lugar;
		this.tipo = tipo;
	}

	public int getNumeroDaSala() {
		return numeroDaSala;
	}

	public void setNumeroDaSala(int numeroDaSala) {
		this.numeroDaSala = numeroDaSala;
	}

	public String getNomeDoFilme() {
		return nomeDoFilme;
	}

	public void setNomeDoFilme(String nomeDoFilme) {
		this.nomeDoFilme = nomeDoFilme;
	}

	public double getValorDoIngresso() {
		return valorDoIngresso;
	}

	public void setValorDoIngresso(double valorDoIngresso) {
		this.valorDoIngresso = valorDoIngresso;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void visualizar() {
		
		System.out.println("**************************");
		System.out.println("    Ingresso do Cinema    ");
		System.out.println("**************************");
		System.out.println("Número da Sala: " + this.numeroDaSala);
		System.out.println("Nome do Filme: " + this.nomeDoFilme);
		System.out.println("Valor do Ingresso: R$" + this.valorDoIngresso);
		System.out.println("Lugar: " + this.lugar);
		System.out.println("Tipo do Ingresso: " + this.tipo + "\n\n");
		
	}

}
