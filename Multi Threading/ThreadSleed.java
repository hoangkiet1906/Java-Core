package sleep;

public class ThreadSleed extends Thread{
	private String name;
	
	public ThreadSleed(String name) {
		super();
		this.name = name;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.name+" "+i);
		}
	}
	public static void main(String[] args) {
		ThreadSleed t1 = new ThreadSleed("luong1");
		ThreadSleed t2 = new ThreadSleed("luong2");
		t1.start();
		t2.start();
	}
}
