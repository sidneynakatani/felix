package lab.controller;

import java.util.HashMap;
import java.util.Map;

import lab.model.VisitorTest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class VisitorTestController {
	
	private Map<Long, String> visitorTestList;
	
	public VisitorTestController(){
		visitorTestList = new HashMap<Long, String>();
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/visitor/{id}", method = RequestMethod.GET)
	public VisitorTest getVisitorTest(@PathVariable("id") long id){
		
		String name = visitorTestList.get(id); 
		
		VisitorTest visitor = new VisitorTest();
		visitor.setId(id);
		visitor.setName(name);
		
		return visitor;
		
	}
	
	@ResponseBody
	@RequestMapping(value = "/visitor", method = RequestMethod.POST)
	public ResponseEntity < String > addVisitorTest(@RequestBody VisitorTest visitor){
		
		if(visitorTestList.size() > 15){
			visitorTestList.clear();
		}		
		
		visitorTestList.put(visitor.getId(), visitor.getName());	
        return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/visitor", method = RequestMethod.PUT)
	public ResponseEntity < String > updateVisitorTest(@RequestBody VisitorTest visitor){
		
		if(visitorTestList.containsKey(visitor.getId())){
			
			visitorTestList.replace(visitor.getId(), visitor.getName());	
	        return ResponseEntity.status(HttpStatus.OK).build();
			
		}
		
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	
	
	@ResponseBody
	@RequestMapping(value = "/visitor", method = RequestMethod.DELETE)
	public ResponseEntity < String > deleteVisitorTest(@RequestBody VisitorTest visitor){
		
		if(visitorTestList.containsKey(visitor.getId())){
			visitorTestList.remove(visitor.getId());	
	        return ResponseEntity.status(HttpStatus.OK).build();
		}
		
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}
