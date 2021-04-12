package m4.task2;
import java.util.Scanner;
public class MainCarApp {

	
		static Scanner sc = new Scanner(System.in);
		Car carsInfo[] = new Car[1000000];   // Database or ArrayList or Set or Map
		int index = 0; // for car count
		
		public static void main(String[] args) {
			
			MainCarApp obj = new MainCarApp();
			
			while(true)
			{

				System.out.println("1. Add Car");
				System.out.println("2. View Car By Cost");
				System.out.println("3. View Car By Car Power");
				System.out.println("4. View Car By Car MusicSystem");
				System.out.println("5. Exit");
				int option = Integer.parseInt(sc.nextLine());
				
				switch(option)
				{
				case 1: obj.insertCarByUser();
						break;
				case 2: 
					System.out.println("Enter the Cost Limit");
					int costLimit = Integer.parseInt(sc.nextLine());
					obj.viewCarsByCost(costLimit);
					break;
					    
				case 3: 
						System.out.println(" Enter the Power Limit ");
						int powerLimit = Integer.parseInt(sc.nextLine());
						obj.viewCarsByPower(powerLimit);
						break;
				case 4:
					System.out.println(" Enter the Volume Limit ");
					int volumeLimit = Integer.parseInt(sc.nextLine());
					obj.viewCarsByMusicSystem(volumeLimit);
					break;
				case 5:
					System.exit(0);
				}//end of swicth
			}//end while
		}//end main

		public void viewCarsByPower(int powerLimit) {
			
			
			for(int i =0;i<index;i++)
			{
				if(carsInfo[i].getEngine().getBasepower()<=powerLimit)
				{
					displayCarInfo(carsInfo[i]);
				}
			}
			
		}
		public void viewCarsByCost(int costLimit) {
			for(int i = 0;i < index;i++) {
				if(carsInfo[i].getCost() <= costLimit ) {
					displayCarInfo(carsInfo[i]);
				}
			}
		}
		public void viewCarsByMusicSystem(int volumeLimit) {
			for(int i = 0;i < index;i++) {
				if(carsInfo[i].getMusicSystem().getVolume() <= volumeLimit) {
					displayCarInfo(carsInfo[i]);
				}
			}
		}

		public void insertCarByUser()
		{
			System.out.println(" Enter Car Name ");
			String carName = sc.nextLine();
		
			System.out.println(" Enter Car Cost ");
			int cost = Integer.parseInt(sc.nextLine());
			
			System.out.println(" Enter Engine Power ");
			int enginePower = Integer.parseInt(sc.nextLine());
			
			System.out.println("Enter Music Volume");
			int volume = Integer.parseInt(sc.nextLine());
			
			Engine e = new Engine(enginePower);
			MusicSystem m = new MusicSystem(volume);
			
			Car obj = new Car(e,m);
			
			boolean status = addCar(obj);
			System.out.println(status);
			
			obj.setCarName(carName);
			obj.setCost(cost);
			
		}
		
		public boolean addCar(Car car)
		{
			boolean isInserted = true;
			
			carsInfo[index++] = car;   // SQL Insert Query insert into Car values(....);
			return isInserted;
		}
		
		
		public void displayCarInfo(Car car)
		{
			System.out.println(" ----- Car Information ----");
			System.out.println(" Car Name "+car.getCarName());
			System.out.println(" Car Cost "+car.getCost());
			System.out.println(" Car Engine "+car.getEngine().getBasepower());
			System.out.println(" Car MusicSystem "+car.getMusicSystem().getVolume());
			
		}
		
	}//end class
