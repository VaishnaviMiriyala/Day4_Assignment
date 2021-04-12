package m4.task2;



////Entity  ( this class becomes table in database)
/// Java bean class 
///  POJO (Plain old java object)
public class Car {
//  2000 property
private int cost;
private String carName;
private Engine engine;
private int carPower;
private int carSound;
//----
private MusicSystem ms;
//------

public Car() {
	super();
	// TODO Auto-generated constructor stub
}

public Car(Engine engine) {
	this.engine = engine;
}

public Car(Engine engine, MusicSystem ms) {
	super();
	this.engine = engine;
	this.ms = ms;
}

public Car(MusicSystem ms) {

	this.ms = ms;
}

public int getCost() {
	return cost;
}

public void setCost(int cost) {
	this.cost = cost;
}

public String getCarName() {
	return carName;
}

public void setCarName(String carName) {
	this.carName = carName;
}

public Engine getEngine() {
	return engine;
}

public void setEngine(Engine engine) {
	this.engine = engine;
}

public int getCarPower() {
	return carPower;
}


public void setCarPower(int carPower) {
	this.carPower = carPower;
}


public MusicSystem getMusicSystem() {
	return ms;
}

public void setMusicSystem(MusicSystem ms) {
	this.ms = ms;
}

public void doStartCar()
{
	 // ------
	carPower = engine.doStartEngine("petrol") + 100;
	
}

public void moveCarForward()
{
	doStartCar();
	if(carPower>1000) System.out.println(" Car speed is High ");
	if(carPower<1000) System.out.println(" Car speed is low ");
	if(carPower<5000) System.out.println(" This must be a truck ");
	
	
}

public void volume()
{
	carSound = ms.volumeAdd();
	carSound = ms.volumeSub();
}

public void sound() {
	volume();
	if(carSound > 15) {
		
		System.out.println("Car is having high Sound");
	}
	else if(carSound > 10 && carSound <= 15) {
		
		System.out.println("Car is having medium Sound");
	}else {
		System.out.println("Car is having slow Sound");
	}
}
}