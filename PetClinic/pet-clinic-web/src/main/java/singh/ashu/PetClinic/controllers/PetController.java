package singh.ashu.PetClinic.controllers;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import singh.ashu.PetClinic.models.Owner;
import singh.ashu.PetClinic.models.Pet;
import singh.ashu.PetClinic.models.PetType;
import singh.ashu.PetClinic.services.SDJService.OwnerSDJService;
import singh.ashu.PetClinic.services.SDJService.PetSDJService;
import singh.ashu.PetClinic.services.SDJService.PetTypeSDJService;

import java.util.List;

@Controller
public class PetController {
    OwnerSDJService ownerSDJService;
    PetSDJService petSDJService;

   PetTypeSDJService petTypeSDJService;
    public PetController(OwnerSDJService ownerSDJService, PetSDJService petSDJService,PetTypeSDJService petTypeSDJService) {
        this.ownerSDJService = ownerSDJService;
        this.petSDJService = petSDJService;
        this.petTypeSDJService=petTypeSDJService;
    }

//    @ModelAttribute("types")
//    public List<PetType> type(){
//
//    }


    @GetMapping("/addPet/{id}")
    public String add(@PathVariable Long id, Model model){
        Pet pet=new Pet();
        model.addAttribute("owner",ownerSDJService.findById(id));
        ownerSDJService.findById(id).getPets().add(pet);
        pet.setOwner(ownerSDJService.findById(id));
        model.addAttribute("pet",pet);
        return "pet/addPet";
    }

    @PostMapping("/savePet")
    public String save(@RequestParam("oid") Long id, @ModelAttribute Pet pet){


        System.out.println(id);
        pet.setOwner(ownerSDJService.findById(id));

        petSDJService.save(pet);
        return "redirect:/owner/view/"+id;
    }
}
