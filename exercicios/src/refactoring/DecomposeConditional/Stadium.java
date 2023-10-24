package refactoring.DecomposeConditional;

import java.util.Date;

public class Stadium {
	
	public double summerRate;
	public double winterRate;
	public double winterServiceCharge;
	
	public double getTicketPrice(Date date) {
		double charge;
		
		if(date.before(WINTER_START) || date.after(WINTER_END)) {
			
		}
	}
}
