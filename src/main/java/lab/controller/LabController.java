package lab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class LabController {
	
	
    @RequestMapping("/lab")
    public String lab() {
        return "lab";
    }
    
    @RequestMapping("/restArticle")
    public String restArticle() {
        return "rest";
    }


}
