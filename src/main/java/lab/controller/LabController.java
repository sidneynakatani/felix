package lab.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LabController {
	
	
    @RequestMapping("/lab")
    public String lab(@RequestParam(required = false) String page) {
    	
    	Map<String, String> pageMap = new HashMap<>();
    	pageMap.put("1", "lab");
    	pageMap.put("2", "lab2");
    	pageMap.put("3", "lab3");
    	
    	String mainPage = "lab3";
    	
    	if(!StringUtils.isEmpty(page)) {
    		if(pageMap.containsKey(page)) {
    			mainPage = pageMap.get(page);
    		} 
    	}
    	
        return mainPage;
    }
    
    @RequestMapping("/restArticle")
    public String restArticle() {
        return "rest";
    }


}
