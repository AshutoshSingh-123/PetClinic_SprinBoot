package singh.ashu.PetClinic;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MyController {

    @RequestMapping("/")
    public String hello(){
        return "Helloooooooo";
    }
}
