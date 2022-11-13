package singh.ashu.PetClinic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import singh.ashu.PetClinic.services.Map.OwnerMapService;
import singh.ashu.PetClinic.services.SDJService.OwnerSDJService;


@RequestMapping("/owner")
@Controller
public class OwnerController {

    private final OwnerSDJService ownerSDJService;

    public OwnerController(OwnerMapService ownerMapService, OwnerSDJService ownerSDJService) {
        this.ownerSDJService = ownerSDJService;

    }

    @RequestMapping({"","/list"})
    public String owner(Model model ){

        model.addAttribute("owners",ownerSDJService.findAll());

        return "owner/index";
    }
}
