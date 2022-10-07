package singh.ashu.PetClinic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("/owner")
@Controller
public class OwnerController {


    @RequestMapping({"","/list"})
    public String owner(){
        return "owner/index";
    }
}
