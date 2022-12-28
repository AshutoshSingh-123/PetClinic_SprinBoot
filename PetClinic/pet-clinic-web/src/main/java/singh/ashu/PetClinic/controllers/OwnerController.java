package singh.ashu.PetClinic.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import singh.ashu.PetClinic.models.Owner;
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

    @GetMapping("/add")
    public String addOwner(Model model){
        model.addAttribute("owner",new Owner());
        return "owner/addOwner";
    }

    @PostMapping("/saveOwner")
    public String save(@ModelAttribute Owner owner){
        ownerSDJService.save(owner);
        return "redirect:/owner";
    }
    @GetMapping("/update/{id}")
    public String addOwner(@PathVariable Long id,Model model){
        model.addAttribute("owner",ownerSDJService.findById(id));
        return "owner/updateOwner";
    }

    @PostMapping("updateOwner/{id}")
    public String save(@PathVariable Long id,@ModelAttribute Owner owner){
        ownerSDJService.save(owner);
        return "redirect:/owner/view/"+id;
    }

    @GetMapping("/view/{id}")
    public String view(@PathVariable Long id, Model model){
        model.addAttribute("owner",ownerSDJService.findById(id));
        return "owner/viewOwner";
    }

    @GetMapping("/find")
    public String find(){
        return "owner/findOwnerForm";
    }

    @PostMapping("/findOwner")
    public String findOwner(@RequestParam("name") String name, Model model){
        model.addAttribute("owners",ownerSDJService.findByLastNameLikeIgnoreCase("%"+name+"%"));
        return "owner/index";

    }
}
