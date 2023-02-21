package farmacia;

public class Farmacia {
	private String remedio;
	private int unidade;
	private String volume;
	private double valor;
	private boolean receita;
	
	public Farmacia(String remedio, int unidade, String volume, double valor, boolean receita) {
		this.remedio = remedio;
		this.unidade = unidade;
		this.volume = volume;
		this.valor = valor;
		this.receita = receita;
	}

	public String getRemedio() {
		return remedio;
	}

	public void setRemedio(String remedio) {
		this.remedio = remedio;
	}

	public int getUnidade() {
		return unidade;
	}

	public void setUnidade(int unidade) {
		this.unidade = unidade;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isReceita() {
		return receita;
	}

	public void setReceita(boolean receita) {
		this.receita = receita;
	}
	
	public void visualizar() {
		
		System.out.println("*************************************************");
		System.out.println("              Informações do Remédio             ");
		System.out.println("*************************************************");
		System.out.println("Nome do Remédio ou substância: " + this.remedio);
		System.out.println("Quantidade em Unidades: " + this.unidade);
		System.out.println("Volume do Remédio: " + this.volume);
		System.out.println("Valor: R$" + this.valor);
		System.out.println("Necessidade de Receita: " + this.receita + "\n\n");
		
	}

}
