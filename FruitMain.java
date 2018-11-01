public class FruitMain{
	public static void main(String[] args) {
		Pepaya p1 = new Pepaya("Biji Pepaya dari Indramayu itu ada");
		p1.showAsal();
		p1.showBiji();

		Pepaya p2 = new Pepaya("Biji Pepaya dari Cirebon itu ada",9999999);
		p2.showAsal();
		p2.showBiji();
	}
}