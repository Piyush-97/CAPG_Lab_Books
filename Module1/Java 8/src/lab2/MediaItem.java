package lab2;

public abstract class MediaItem extends Item {
	private int runTime;
	
	public MediaItem() {
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
	
}
