package farmacia;

public class Medicamento extends Farmacia{
	private boolean receita;

	public Medicamento(String nome, int unidade, String volume, double valor, String marca, boolean receita) {
		super(nome, unidade, volume, valor, marca);
		this.receita = receita;
	}

	public boolean isReceita() {
		return receita;
	}

	public void setReceita(boolean receita) {
		this.receita = receita;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Necessidade de receita: " + this.receita);
	}
}
