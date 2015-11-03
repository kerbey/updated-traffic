import java.util.Scanner;
public class Car //extends SyncCount
{
	
	int carnum, waitingTime;
	public Car(int carnum, int waitingTime)
	{
		this.carnum=carnum;
		this.waitingTime=waitingTime;
		StoppingTime();
	}
	public void StoppingTime()
	{
		waitingTime=2;
	}
	
}