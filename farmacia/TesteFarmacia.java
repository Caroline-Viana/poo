package farmacia;

public class TesteFarmacia {

	public static void main(String[] args) {
		Medicamento m1 = new Medicamento("Dramin", 1, "25mg", 8.99, "DraminB6", false);
		m1.visualizar();
		
		Medicamento m2 = new Medicamento("Paracetamol", 1, "500mg", 14.99, "Tylenol", false);
		m2.visualizar();
		
		Perfumaria p1 = new Perfumaria("Soft Matte", 1, "29ml", 13.90, "Ruby Rose", "Base Líquida");
		p1.visualizar();
		
		Perfumaria p2 = new Perfumaria("Moisturising", 1, "52ml", 62.90, "CeraVe", "Loção Hidratante Facial");
		p2.visualizar();
	}

}
