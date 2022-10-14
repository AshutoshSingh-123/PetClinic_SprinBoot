package singh.ashu.PetClinic.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import singh.ashu.PetClinic.services.Map.OwnerMapService;


@RequestMapping("/owner")
@Controller
public class OwnerController {

    private final OwnerMapService ownerMapService;

    public OwnerController(OwnerMapService ownerMapService) {
        this.ownerMapService = ownerMapService;
    }

    @RequestMapping({"","/list"})
    public String owner(Model model ){

        model.addAttribute("owners",ownerMapService.findAll());

        return "owner/index";
    }
}
