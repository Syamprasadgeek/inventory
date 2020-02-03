package flightBookings;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Service;

@Service
public class flightService {
	
	List<flights> flight = Arrays.asList(new flights("Air Canada 8099", "7:30 AM"),
			new flights("United Airline 6115", "10:30 AM"),
			new flights("WestJet 6456", "12:30 PM"),
			new flights("Delta 3833", "3:00 PM")
			
			);
	public List<flights> allFlights(){
		return flight;
		
	}
	public List<flights> findFlightsbyTime(String time) {
		int i = 0;
		List<flights> flightTime = new ArrayList<flights>();
		flightTime.addAll(flight);
		/*DateTimeFormatter Format = DateTimeFormatter.ofPattern("hh:mm a", Locale.ENGLISH); 
		LocalTime time1 = LocalTime.parse(time, Format);
		for(i=0;i<flight.size();i++) {
			LocalTime time2 = LocalTime.parse(flight.get(i).getTime(), Format);
			if(time2.until(time1, ChronoUnit.HOURS)>5)
			{
				flightTime.remove(flight.get(i));
			}
			
		}*/
		return flightTime;
	}
}
