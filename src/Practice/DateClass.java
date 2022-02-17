package Practice;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateClass {

	public static void main(String[] args) {
		
		LocalDateTime date = LocalDateTime.now();
		System.out.println("Before formatting "+date);
		DateTimeFormatter dayeformat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate= date.format(dayeformat);
		System.out.println("After formatting :" +formattedDate);		
	}

}
