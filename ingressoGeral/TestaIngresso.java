package ingressoGeral;

public class TestaIngresso {

	public static void main(String[] args) {
		Ingresso ticket = new Ingresso(12, "U2", 300, "Allianz Parque", 22);
		ticket.visualizar();
		
		System.out.println("--------------------------");
		
		Vip v1 = new Vip(12, "U2", 300, "Allianz Parque", 22, "*°*° VIP °*°*", 47511);
		v1.visualizar();
		
		Vip v2 = new Vip(26, "Imagine Dragons", 450, "Allianz Parque", 19, "*°*° VIP °*°*", 4351);
		v2.visualizar();
		
		System.out.println("--------------------------");
		
		MeiaEntrada m1 = new MeiaEntrada(12, "U2", 300, "Allianz Parque", 22, "Idoso");
		m1.visualizar();
		
		MeiaEntrada m2 = new MeiaEntrada(14, "BTS", 360, "Allianz Parque", 20, "Estudante");
		m2.visualizar();
	}

}
