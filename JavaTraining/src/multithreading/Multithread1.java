package multithreading;

public class Multithread1 extends Thread{	
		public void run() {
			for(int i=0;i<=5;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
				try {
					sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		public static void main(String[] args) {
			Multithread1 t=new Multithread1();
			Multithread1 t1=new Multithread1();
			t.start();
			t1.start();
		}
	}