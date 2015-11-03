public class SyncCount
{
	List<Car> list= new List<Car>();
	//Car car= new Car();//
	traffic t= new traffic();
	private int carnum, waitingTime=0;
	public SyncCount()
	{
		carnum=0;
	}
	@SuppressWarnings("static-access")
	public synchronized void increment() throws InterruptedException, EmptyListException
	{//enqueue car object with waiting time, car name involved
		// and after that move it to traffic class to print out
		carnum++;
		Car car= new Car(carnum, waitingTime);//not needed
		list.enqeue(car);
		t.horizontalLane(car, carnum, list);
	}
	public String toString()
	{
		//System.out.println(list.getString());
		return "(synccount)Count is:\t" + carnum;
	}
	public void moveToCarObject(int size) throws InterruptedException
	{
		//Car car= new Car(list.getString());//not needed
	}
}