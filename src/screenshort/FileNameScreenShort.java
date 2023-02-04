package screenshort;

import java.time.LocalDateTime;

public class FileNameScreenShort {
public static void main(String[]arg) {
	 LocalDateTime dateAndTime = LocalDateTime.now();
	 System.out.println(dateAndTime);
	 String updateLocalDateTimeFormat = dateAndTime.toString().replace(':', '-');
	 System.out.println(updateLocalDateTimeFormat);
	 System.out.println(LocalDateTime.now().toString().replace(':', '-'));
}
}
