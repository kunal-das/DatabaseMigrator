package multi_threading;

class DemoThread extends Thread
{
	DemoThread(String s) {
		super(s);
		this.start();
	}
	
	@Override
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println(getName());
		}
	}
}

class DemoThreadMain{
	
	public static void main(String[] args){
		DemoThread instance1 = new DemoThread("Thread 1");
		DemoThread instance2 = new DemoThread("Thread 2");
		DemoThread instance3 = new DemoThread("Thread 3");
		for(int i = 0; i < 10; i++){
			System.out.println(Thread.currentThread().getName());
		}
		try{
			instance1.join();
			instance2.join();
			instance3.join();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" has ended");
		
	}
	
}