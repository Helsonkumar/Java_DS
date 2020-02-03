import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {

	public static void main(String args[]) {

		String date = "06-25-2019";

		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		LocalDate ldate = LocalDate.parse(date, format);
		System.out.println(ldate.format(DateTimeFormatter.ofPattern("dd-MM-yy")));

		LocalDate curr = LocalDate.now();
		System.out.println(curr);
		System.out.println(ldate);
		System.out.println(ldate.isEqual(curr.plusDays(1)) || ldate.isEqual(curr) || ldate.isEqual(curr.minusDays(1)));
		// System.out.println(ldate.isBefore(ldate.now()));

	}

}