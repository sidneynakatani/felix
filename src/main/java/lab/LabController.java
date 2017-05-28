package lab;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Controller
public class LabController {
	
	
    @RequestMapping("/lab")
    public String lab() {
    	System.out.println("passei");
        return "lab";
    }


}
