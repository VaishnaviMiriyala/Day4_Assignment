package m4.task2;

public class MainRunner {

	public static void main(String[] args) {
		/*
		Engine hondaEngine = new Engine(1000); // type of A
		Engine tataEngine = new Engine(1200);  // type B
		
	
		// --- default features-----
		//  ---- Base model ---
		Car car1 = new Car(hondaEngine);
		car1.moveCarForward();
		
		// ---- new enhancements in old component ---
		// ---- do some changes in base engine --
		Engine e = car1.getEngine();
		e.setBasepower(e.getBasepower()+1);
		
		car1.moveCarForward();
		
		//--- Switch to new component ---
		// --- change engine ---
		car1.setEngine(tataEngine);
		car1.moveCarForward();*/
		
		MusicSystem m1 =  new MusicSystem(14);
		MusicSystem m2 =  new MusicSystem(10);
		 
		Car car2 = new Car(m1);
		car2.sound();
		
		MusicSystem m = car2.getMusicSystem();
		m.setVolume(m.getVolume()+1);
		
		car2.sound();
		
        car2.setMusicSystem(m2);
        car2.sound();
	}

}
