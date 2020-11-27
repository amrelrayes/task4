
public class TestTV {

	public static void main (String[]args){
		
		TV homeTV= new TV();
		
		homeTV.turnOn();
		homeTV.setChannel(10);
		homeTV.setChannel(130);
		homeTV.setVolume(8);
		homeTV.volumeUp();
		
		System.out.println("Home TV is "+ homeTV.isTvOn());
		System.out.println("Home TV Channel is  "+ homeTV.getTvChannel());
		System.out.println("Home TV Channel is  "+ homeTV.getTvVolume());
	
	}
}
