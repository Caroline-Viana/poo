package cinema;

public class TestaIngresso {

	public static void main(String[] args) {
		Ingresso ticket = new Ingresso(06, "It: A Coisa", 12.50, "F11", "Meia entrada");
		ticket.visualizar();
		Ingresso ticket2 = new Ingresso(03, "Rei Leão", 32.53, "C08", "Entrada inteira");
		ticket2.visualizar();
	}

}
