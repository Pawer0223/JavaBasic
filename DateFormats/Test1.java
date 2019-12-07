package DateFormats;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test1 {

	public static void main(String[] args) {

		int totalTicket= 2000;

		String[] logs = {
				"woni request 09:12:29",
				"brown request 09:23:11",
				"brown request 09:23:44",
				"jason request 09:33:51",
				"jun request 09:33:56",
				"cu request 09:34:02",
		};

		String answer = solution(totalTicket, logs);

		System.out.println(answer);

	}//main

	private static String solution(int totalTicket, String[] logs ) {
		String answer = "";
		
		String time = logs[1].split(" ")[2] ;
		String time2 = logs[2].split(" ")[2] ;
		
		SimpleDateFormat fm = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);	
		
		try {
		Date begin = fm.parse(time);
		Date end = fm.parse(time2);
		System.out.println( (begin.getTime() - end.getTime())/1000 );
		}catch(Exception e ) {
			e.printStackTrace();
		}
		
		return answer;
	}
}//class
