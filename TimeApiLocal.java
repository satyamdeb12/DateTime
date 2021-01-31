//LocalTime

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;

public class TimeApiLocal {

	public static void main(String[] args) {
		LocalTime t = LocalTime.now();
		System.out.println("Current time= "+t);
		
		LocalTime tt = LocalTime.of(10, 35, 10, 800);
		System.out.println("User Defined time = "+tt);
		
		//System.out.println(ZoneId.getAvailableZoneIds());
		//This will show all available timezones
		
		LocalTime ttt = LocalTime.now(ZoneId.of("Africa/Cairo"));
		System.out.println("Time of Africa/Cairo = "+ttt);
		
		LocalTime tttt = LocalTime.now(ZoneId.of("GMT"));
		System.out.println("GMT = "+tttt);
		
		
		//Getting GMT with Instant (Also returns date)
		Instant i = Instant.now();
		System.out.println("Instant GMT= "+i);
	}

}
