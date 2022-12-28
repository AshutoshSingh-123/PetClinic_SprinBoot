package singh.ashu.PetClinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import singh.ashu.PetClinic.services.Map.VetMapService;

@Controller
public class VetController {

     private final VetMapService vetMapService;

    public VetController(VetMapService vetMapService) {
        this.vetMapService = vetMapService;
    }

    @RequestMapping("/vetlist")
    public String vetList(Model model){
        model.addAttribute("vets",vetMapService.findAll());
        return "vet/index";
    }
}
