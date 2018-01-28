package cn.itcast.heima2;

public class TraditionalThread {

	public static void main(String[] args) {
		
		new Thread(){
			@Override
			public void run() {
				while(true){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.err.println(Thread.currentThread().getName());
				}
			}
		}.start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.err.println(Thread.currentThread().getName());
			}
		}).start();
	}
}
