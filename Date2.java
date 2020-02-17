package file;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Date2 
{
public static void main(String[] args) {
	LocalDate date= LocalDate.now();
	//default format
	System.out.println("Default format of the date="+date);
	//specific format
	System.out.println("pattern"+date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
	LocalTime it=LocalTime.now();
	System.out.println("Time"+it);
	LocalDateTime dateTime=LocalDateTime.now();
	//default format
	System.out.println("default format of LocalDateTime="+ dateTime);
	
}
}
