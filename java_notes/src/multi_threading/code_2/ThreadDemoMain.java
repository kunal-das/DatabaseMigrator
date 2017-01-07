package multi_threading.code_2;
class ThreadDemo extends Thread{
	
	public ThreadDemo(String s) {
		super(s);
		this.start();
	}
	
	@Override
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println(getName());
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class ThreadDemoMain{
	public static void main(String...args){
		ThreadDemo instance1 = new ThreadDemo("Thread1");
		ThreadDemo instance2 = new ThreadDemo("Thread2");
		ThreadDemo instance3 = new ThreadDemo("Thread3");
		
		for(int i = 0; i < 10; i++){
			System.out.println(Thread.currentThread().getName());
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		try{
			instance1.join();
			instance2.join();
			instance3.join();
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
			}
}