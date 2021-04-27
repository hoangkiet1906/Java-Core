
public class main {

	public static void main(String[] args) {
		Data data = new Data();
		Th1 t1 = new Th1(data);
		Th2 t2 = new Th2(data);
		t2.start();
		t1.start();
	}

}
