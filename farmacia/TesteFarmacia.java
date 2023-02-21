package farmacia;

public class TesteFarmacia {

	public static void main(String[] args) {
		Farmacia r1 = new Farmacia("Dramin", 2, "25mg", 7.99, false);
		r1.visualizar();
		Farmacia r2 = new Farmacia("Paracetamol", 1, "750mg", 5.08, false);
		r2.visualizar();

	}

}
