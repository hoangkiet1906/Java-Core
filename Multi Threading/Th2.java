
public class Th2 extends Thread{
	Data data;

	public Th2(Data data) {
		super();
		this.data = data;
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			synchronized (data) {
				data.notifyAll();
				try {
					data.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Address : "+data.address[i]);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("t2 stop");
	}
}
