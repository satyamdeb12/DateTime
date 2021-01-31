//LocalDate

import java.time.LocalDate;
import java.time.Month;

public class Sample {

	public static void main(String[] args) {
		/**
		 * Issues with the old Date Time APIs
		 * 1. Same Date class is in two packages therefore "Date d = new Date();" gives error
		 * 2. To format the date we need to import java.text.*;
		 * 3. All the Date classes are not thread-safe i.e. if multiple threads are using 
		 * 		the Date object then one thread will use and others will suffer
		 * 4. Printing the date prints the date and time
		 * 
		 * Advantages of new DateTime API
		 * 1. Immutable- 
		 * 2. More simple to use
		 * 3. Only prints date (LocalDate)
		 */
		
		//now() will fetch the current date
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		//of lets us set date according to our need
		LocalDate dd = LocalDate.of(1997, 12, 12);
		//The month 12(middle one) creates confusion as we dont know if it starts from 0 or 1
		System.out.println(dd);
		LocalDate ddd = LocalDate.of(1997, Month.DECEMBER, 12);
		//This removes the confusion
		//Month is an enum
		System.out.println(ddd);

	}

}
