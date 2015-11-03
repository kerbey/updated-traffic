public class SyncCount2 {

	ListSecond<Car> list2= new ListSecond<Car>();
	private int carnum, waitingTime=0;
	traffic t= new traffic();
	public SyncCount2()
	{
		carnum=0;
	}
	@SuppressWarnings("static-access")
	public synchronized void increment() throws InterruptedException, EmptyListException
	{//enqueue car object with waiting time, car name involved
		// and after that move it to traffic class to print out
		carnum++;
		Car car= new Car(carnum, waitingTime);//not needed
		list2.enqeue(car);
		t.verticalLane(car, carnum,list2);
	}
	public String toString()
	{
		//System.out.println(list.getString());
		return "(synccount2)Count is:\t" + carnum;
	}
	public void moveToCarObject(int size) throws InterruptedException
	{
		//Car car= new Car(list.getString());//not needed

	}
}
