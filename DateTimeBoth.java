import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

//LocalDateTime


public class DateTimeBoth {

	public static void main(String[] args) {
		//Getting GMT with Instant (Also returns date)
		Instant i = Instant.now();
		System.out.println(i);
		
		//Difference is this does not end with Z
		//Z means Instant class
		LocalDateTime t = LocalDateTime.now(ZoneId.of("GMT"));
		System.out.println(t);
	}

}
