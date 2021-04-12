package m4.task2;

public class MusicSystem {
    private int volume;
	public MusicSystem() {
		
	}

	public MusicSystem(int volume) {
		super();
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int volumeAdd() {
		  volume += 1;
		return volume;
	}
	public int volumeSub() {
		volume -= 2;
		return volume;
	}
	    

}
