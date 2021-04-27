
public class Th1 extends Thread{
	Data data;
	
	public Th1(Data data) {
		super();
		this.data = data;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			synchronized (data) {
				System.out.println("Ten : "+data.name[i]);
				data.notifyAll();
				if(i<4) {
					try {
						data.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		System.out.println("t1 stop");
	}
}
