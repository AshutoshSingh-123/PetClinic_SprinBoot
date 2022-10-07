package singh.ashu.PetClinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {


    @RequestMapping("/vetlist")
    public String vetList(){
        return "vet/index";
    }
}
