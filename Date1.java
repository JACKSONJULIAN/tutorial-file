package file;
import java.text.*;
import java.util.Date;
public class Date1 
{
public static void main(String[] args) throws ParseException
{
	Date now=new Date();
	System.out.println(now);
	SimpleDateFormat ft=
	new SimpleDateFormat("dd mmm yyyy 'at' hh:mm:ss a 222");
	System.out.println(ft.format(now));
	ft=new SimpleDateFormat("dd.mm.yyyy");
	Date d=new Date();
}

}