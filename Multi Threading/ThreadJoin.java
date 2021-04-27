package Thread_Join;


public class ThreadJoin extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.getName()+" "+i);
		}
	}
	public static void main(String[] args) {
		ThreadJoin t1 = new ThreadJoin();
		t1.setName("Thread1");
		ThreadJoin t2 = new ThreadJoin();
		t2.setName("Thread2");
		ThreadJoin t3 = new ThreadJoin();
		t3.setName("Thread3");
		t1.start();
		try {
//			t1.join();    //t2,t3 cho t1 chay xog roi moi chay
			t1.join(5000);//t2,t3 cho t1 chay trong 5s truoc roi moi chay
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}
}

