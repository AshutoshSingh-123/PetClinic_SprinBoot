package singh.ashu.PetClinic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import singh.ashu.PetClinic.models.Owner;
import singh.ashu.PetClinic.services.Map.OwnerMapService;

import java.util.Set;

@Controller

public class MyController {


@RequestMapping("/")
    public String index(){
    return "index";
}





}
