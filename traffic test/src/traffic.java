import java.util.Scanner;
public class traffic extends List//extends or implements node and/or list clases
{//queue interface means implement queue
	static int josh=0;
	static int newA = 0;
	static int verticalSteps=0, verticalSteps2nd=-1, verticalSteps3rd= verticalSteps-2, verticalSteps4th=verticalSteps-3
			, verticalSteps5th=-4, assign, jakeSteps, otherSteps, thirdSteps, fourthSteps, fifthSteps;
	static int distance=0, temp=1;
	static int i = 0,z=0;
	static int Carl=0, vplace, horizontalSteps, a2,jinplace, john1, Jake1;
	static String s;
	static int syncCount;
	//static String[] arrayList= new String[syncCount];
	static int theStoppingNumber = 0;
	static int carNumber = 1, counter=0, counterJohn = 6;
	static String name = "Car", userResponse; 
	public static Car car, car2, car3, car4, car5, car6,car7,car8,car9,car10, defaultCar;
	static List<Car> list;
	static ListSecond<Car> list2nd;
	public static void horizontalLane(Car carr, int SyncCount, List<Car> list2) throws InterruptedException, EmptyListException
	{//dequeue after car is done being used
		list=list2;
		syncCount=SyncCount;
		if(carr.carnum==1)
		{
			car=carr;
			System.out.println("car "+car.carnum);
			return;
		}
		if (carr.carnum==2)
		{
			car2=carr;
			System.out.println("car "+car2.carnum);
			return;
		}
		if (carr.carnum==3)
		{
			car3=carr;
			System.out.println("car "+car3.carnum);
			return;
		}
		if (carr.carnum==4)
		{
			car4=carr;
			System.out.println("car "+car4.carnum);
			return;
		}
		if (carr.carnum==5)
		{
			car5=carr;
			System.out.println("car "+car5.carnum);
			//return;
		}
		if (carr.carnum==6)
		{
			car6=carr;
			System.out.println("car "+car6.carnum);
		}
		System.out.println();
		/*do 
		{   	
			john1 = 1;//(int) ((Math.random() * 2) + 1);
			verticalSteps = verticalSteps + john1;
			System.out.println("verticalSteps="+verticalSteps);
			Jake1 = 1;//(int) ((Math.random() * 2) + 1);
			distance = distance + Jake1;
			System.out.println("distance="+distance);
			space();
			johnActualStop();
		}
		while (verticalSteps<100 || distance<100);// && Carl<=86);*/

	}
	public static void verticalLane(Car carr, int SyncCount, ListSecond<Car> list2) throws InterruptedException, EmptyListException
	{//dequeue after car is done being used

		list2nd=list2;
		if(carr.carnum==1)
		{
			car6=carr;
			car6.carnum=6;
			System.out.println("car "+car6.carnum);
			return;
		}
		if (carr.carnum==2)
		{
			car7=carr;
			car7.carnum=7;
			System.out.println("car "+car7.carnum);
			return;
		}
		if (carr.carnum==3)
		{
			car8=carr;
			car8.carnum=8;
			System.out.println("car "+car8.carnum);
			return;
		}
		if (carr.carnum==4)
		{
			car9=carr;
			car9.carnum=9;
			System.out.println("car "+car9.carnum);
			return;
		}
		if (carr.carnum==5)
		{
			car10=carr;
			car10.carnum=10;
			System.out.println("car "+car10.carnum);
		}
		System.out.println();

		do 
		{   	
			john1 = (int) ((Math.random() * 2) + 1);
			verticalSteps = verticalSteps + john1;
			System.out.println("verticalSteps="+verticalSteps);
			Jake1 = (int) ((Math.random() * 2) + 1);
			distance = distance + Jake1;
			System.out.println("distance="+distance);
			space();
			johnActualStop();
			temp++;
		}
		while (verticalSteps<100 || distance<100);// && Carl<=86);*/
	}
	public static void space() throws InterruptedException
	{
		//this makes the racers look like they are moving. z=0 z<distance-name z++ and if name<50 space else print|
		Thread.sleep(1000);
		for (int d = 0; d < 30; d++) //this loop prevents names from printing in the wrong places
			//by printing out 30 spaces in between each printed image
		{
			System.out.println();
		};
	}

	public static void jake() throws EmptyListException
	{
		System.out.println("\n-----------------------------------      --------------------------------------------------");
		for (fifthSteps = 0; fifthSteps < distance; fifthSteps++)
		{
			//Create the Stop here---------------------------car5
			//if (jakeSteps>=7 && jakeSteps <= 9 && otherSteps>= 6 && otherSteps<=7) //second name stops moving at certain steps 
			//when the first name stops at its certain steps
			/*if(verticalSteps<=15 && fifthSteps==9)
			{
				//Create the Stop here---------------------------car1
				//jakeActualStop(fifthSteps);
				/*for(int v=2;v<otherSteps-4;v++)
						{
							System.out.print("    ");
						}*/
			/*if (otherSteps==6)
							System.out.print("");

						if (otherSteps==7)
							System.out.print("");
			}*/

			if(fifthSteps>4)
			{
				System.out.print("    ");
			}
		}
		//}
		if (fifthSteps<5)// || fifthSteps==8)// && fourthSteps<=8 || car==null && fourthSteps<=8 && fifthSteps<=8|| car==null && fifthSteps<=30)
		{
			System.out.print("");
		}

		else if (fifthSteps>=5 && fifthSteps<30 && fifthSteps!=10)
		{
			System.out.print("#"+car.carnum +" "+ fifthSteps);
		}
		else if (fifthSteps>30)// || car==null && fifthSteps>30)
		{
			System.out.print("");
			list.deqeue();
			list.deqeue();
			list.deqeue();
			list.deqeue();
			list.deqeue();
			list2nd.deqeue();
			list2nd.deqeue();
			list2nd.deqeue();
			list2nd.deqeue();
			list2nd.deqeue();
			try {
				distance=0;
				verticalSteps=0;
				Main m= new Main();//goes back to main and continues getting new values
				m.main(null);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for ( fourthSteps = 0; fourthSteps < distance; fourthSteps++){
			//Create the Stop here---------------------------car4
			/*if(verticalSteps<=15 && fourthSteps==9) //second name stops moving at certain steps 
				//when the first name stops at its certain steps
			{
				jakeActualStop(fourthSteps);
				/*for(int v=2;v<otherSteps-4;v++)
						{
							System.out.print("    ");
						}*/
			/*if (otherSteps==6)
							System.out.print("");

						if (otherSteps==7)
							System.out.print("");*/
			//}
			/*if (otherSteps == 10){
						System.out.println("");
					}
					else
					{}*/
			//System.out.print("    ");

		}
		if (fourthSteps<4)// || car4==null && fourthSteps<=6)
		{
			System.out.print("");
		}
		else if (fourthSteps>=4 && fourthSteps<28)
		{
			System.out.print("#"+car4.carnum +" "+ fourthSteps);
		}
		else if (fourthSteps>=28)// || car4==null && fourthSteps>=28 || car4==null && fourthSteps<28)
		{
			System.out.print("");
		}
		//System.out.println();
		for ( thirdSteps = 0; thirdSteps < distance; thirdSteps++)
		{
			//Create the Stop here---------------------------car3
			/*if(verticalSteps<=15 && thirdSteps==9) //second name stops moving at certain steps 
				//when the first name stops at its certain steps
			{
				jakeActualStop(thirdSteps);
				/*for(int v=2;v<otherSteps-4;v++)
						{
							System.out.print("    ");
						}*/
			/*if (otherSteps==6)
							System.out.print("");

						if (otherSteps==7)
							System.out.print("");
			}*/
			/*if (otherSteps == 10){
						System.out.println("");
					}
					else
					{*/
			//System.out.print("    ");
		}
		//}
		if(thirdSteps>=26)//|| car3==null && thirdSteps>=26 || car3==null && thirdSteps<26)
		{
			System.out.print("");
		}
		else if (thirdSteps>=3)
		{
			System.out.print("#"+car3.carnum +" "+ thirdSteps);
		}
		//System.out.println();
		for ( otherSteps = 0; otherSteps < distance; otherSteps++){
			//Create the Stop here--------------------------- car2
			/*if(verticalSteps<=15 && otherSteps==9) //second name stops moving at certain steps 
			//when the first name stops at its certain steps
			{
				jakeActualStop(otherSteps);

				/*for(int v=2;v<otherSteps-4;v++)
				{
					System.out.print("    ");
				}
				if (otherSteps==6)
					System.out.print("");

				if (otherSteps==7)
					System.out.print("");//
			}*/
			/*if (otherSteps == 10){
				System.out.println("");
			}
			else
			{*/
			//System.out.print("|    |");
		}
		//}
		if (otherSteps<2)
		{
			System.out.print("");
		}
		else if (otherSteps>=2 && otherSteps<24)
		{
			System.out.print("#"+car2.carnum +" "+ otherSteps);
		}
		else if (otherSteps>=24)// || car2==null&& otherSteps<24||car2==null && otherSteps>=24)
		{
			System.out.println("");
		}
		//----------------------------------------------------------------------car5	
		for (horizontalSteps= 0; horizontalSteps < distance; horizontalSteps++)
		{
			/*if(verticalSteps<=15 && fifthSteps==9)
					{
						//Create the Stop here---------------------------car1
						jakeActualStop(horizontalSteps);
					}	*/		
		};
		if(distance<22)
		{

			System.out.print("#"+car5.carnum +" "+ distance);
		}
		else if(distance>=22)// || car5==null && distance<22 || car5==null && distance>=22)
		{
			System.out.print("");

		}
		System.out.println("\n-----------------------------------      --------------------------------------------------");
	}
	public static void johnActualStop() throws EmptyListException
	{
		if (horizontalSteps == 3 && verticalSteps ==9  )
		{//and if the cars arrive at these steps the stopping number is set to ten
			theStoppingNumber = 10;
		}
		for (vplace = 0; vplace < 35; vplace++)
		{
			if (verticalSteps>=29 && verticalSteps==vplace)
			{
				System.out.print("");
			}
			if (vplace==16)
			{
			// the name prints or else it prints the road
				if(verticalSteps==vplace)
				{
					System.out.print("\n                                  |#"+car10.carnum+"  "+ (verticalSteps)+"|");
					jake();
				}
				else 
				{
					System.out.print("\n                                  |      |");
					jake();
				}
			}	
			 if (verticalSteps-5 == vplace-5)
			{
				System.out.print("\n                                  |#"+car6.carnum+"  "+ (verticalSteps-5)+"|");
			}					
			 if((verticalSteps-4)==(vplace-4))
			{
				System.out.print("\n                                  |#"+car7.carnum+"  "+ (verticalSteps-4)+"|");	
			}			
			 if((verticalSteps-3)==(vplace-3))
			{
				System.out.print("\n                                  |#"+car8.carnum+"  "+ (verticalSteps-3)+"|");
			}
			
			 if((verticalSteps-2)==(vplace-2))
			{
				System.out.print("\n                                  |#"+car9.carnum+"  "+ (verticalSteps-2)+"|");
			}
			 if((verticalSteps)==(vplace))
			{
				System.out.print("\n                                  |#"+car10.carnum+"  "+ (verticalSteps)+"|");
			}
			if(vplace>=1 && vplace<=6 && (vplace!=16 || (vplace-1)!=16))
			{//this line moves the names during vplace=1-6
				if (verticalSteps != vplace)
				{
					System.out.print("\n                                  |      |");
				}
			}
			else//This is where the actual Stop of the cars is done...!! they stop when they are
				//right before the 16th row before the second method is called and the horixontal road passes through it.
				if(vplace >= theStoppingNumber  &&  vplace <= theStoppingNumber + 5){
					System.out.print("");
				}
				else if (vplace!=16)
				{
					System.out.print("\n                                  |      |");
				}
				else if (vplace-4==16 && verticalSteps-4==vplace-4)
				{
					System.out.print("j last");
					jake();
				}
		}
	}
	public static void jakeActualStop(int Steps)
	{	
		if (Steps == 9 || Steps == 10 || Steps == 11 )
		{
			if (Steps == 9) 
			{
				System.out.print("");
			}
			if (Steps == 10)
			{
				System.out.print("");
			}
			if (Steps == 11)
			{
				System.out.print("    ");
			}
		}
	}
}