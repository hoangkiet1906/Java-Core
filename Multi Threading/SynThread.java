package Thread_Synchronization;

public class SynThread implements Runnable{
	private int tien;
	public SynThread() {
		this.tien = 7999;
	}
	public synchronized void rutTien(int tienRut) {
		if (tienRut<tien) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			tien-=tienRut;
			System.out.println("Rut "+tienRut+" thanh cong!");
			System.out.println("Con lai : "+tien);
			System.out.println("Cho ty");
		} else
			System.out.println("Het tien roi ");
	}
	
	@Override
	public void run() {
		rutTien(2000);
	}
	public static void main(String[] args) {
		SynThread t = new SynThread();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
