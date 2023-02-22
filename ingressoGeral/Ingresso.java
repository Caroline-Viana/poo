package ingressoGeral;

public class Ingresso {
	
	private int data;
	private String nomeDoEvento;
	private double valorDoIngresso;
	private String local;
	private int horario;
	
	public Ingresso(int data, String nomeDoEvento, double valorDoIngresso, String local, int horario) {
		this.data = data;
		this.nomeDoEvento = nomeDoEvento;
		this.valorDoIngresso = valorDoIngresso;
		this.local = local;
		this.horario = horario;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public String getNomeDoEvento() {
		return nomeDoEvento;
	}

	public void setNomeDoEvento(String nomeDoEvento) {
		this.nomeDoEvento = nomeDoEvento;
	}

	public double getValorDoIngresso() {
		return valorDoIngresso;
	}

	public void setValorDoIngresso(double valorDoIngresso) {
		this.valorDoIngresso = valorDoIngresso;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public int getHorario() {
		return horario;
	}

	public void setHorario(int horario) {
		this.horario = horario;
	}
	
	public void visualizar() {
		
		System.out.println("**************************");
		System.out.println("         Ingresso         ");
		System.out.println("**************************");
		System.out.println("Dia: " + this.data);
		System.out.println("Nome do Evento: " + this.nomeDoEvento);
		System.out.println("Valor do Ingresso: R$" + this.valorDoIngresso);
		System.out.println("Local: " + this.local);
		System.out.println("Horário: " + this.horario + "h");
	}

}
