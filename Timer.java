
public class Timer {
	
	 long startTime;
	 long endTime;
	 
		public Timer() 
		{
			
		}

	public void start() {
		this.startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		this.endTime = System.currentTimeMillis();
	}
	
	public  long getTime() {
		return (this.endTime - this.startTime);
		}
	



}
