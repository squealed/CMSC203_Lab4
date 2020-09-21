/** 
*The purpose of this class is to model a television
*Neil Walter 9/20/20
*/

public class Television {
	String manufacturer = " ";
	int screenSize = 0;
	int powerOn = 0;
	int channel = 2;
	int volume = 20;
	public Television(String a, int b) {
		manufacturer = a;
		screenSize = b;
	}
	
	public void setChannel(int channel1) {
		channel = channel1;
	}
	public void power() {
		powerOn = 1;
	}
	public void increaseVolume() {
		volume+=1;
	}
	public void decreaseVolume() {
		volume-=1;
	}
	public int getVolume() {
		return volume;
	}
	public int getChannel() {
		return channel;
	}
	public int getScreenSize() {
		return screenSize;
	}
	public String getManufacturer() {
		return manufacturer;
	}

}

