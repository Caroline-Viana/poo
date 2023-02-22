package farmacia;

public class Farmacia {
	private String nome;
	private int unidade;
	private String volume;
	private double valor;
	private String marca;
	
	public Farmacia(String nome, int unidade, String volume, double valor, String marca) {
		this.nome = nome;
		this.unidade = unidade;
		this.volume = volume;
		this.valor = valor;
		this.marca = marca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void visualizar() {
		
		System.out.println("*************************************************");
		System.out.println("                    Informações                  ");
		System.out.println("*************************************************");
		System.out.println("Nome do Produto: " + this.nome);
		System.out.println("Quantidade em Unidades: " + this.unidade);
		System.out.println("Volume do Produto: " + this.volume);
		System.out.println("Valor: R$" + this.valor);
		System.out.println("Marca do Produto: " + this.marca);
	}

}
