package flightBookings;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class controller {
	@Autowired
	private flightService service;
	
	//@GetMapping("/flight")
	@RequestMapping("/flight")
	public List<flights> Flights() {
		
		return service.allFlights();
		
		
	}
	
/*	@RequestMapping("/flight/{id}")
	public String findFlights1(@PathVariable("id") String id) {
		return id;
		
		//return service.allFlights().get(id).getTime();
		
		
	}
	*/
	
	@RequestMapping("/flight/{time}")
	public List<flights> findFlights(@PathVariable("time") String time) {
		
		return service.findFlightsbyTime(time);
		
		
	}
	
}
