package singh.ashu.PetClinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import singh.ashu.PetClinic.models.Pet;
import singh.ashu.PetClinic.models.Visit;
import singh.ashu.PetClinic.services.SDJService.PetSDJService;
import singh.ashu.PetClinic.services.SDJService.VisitSDJService;

@Controller
public class VisitController {
    VisitSDJService visitSDJService;
    PetSDJService petSDJService;

    public VisitController(VisitSDJService visitSDJService, PetSDJService petSDJService) {
        this.visitSDJService = visitSDJService;
        this.petSDJService = petSDJService;
    }

    @GetMapping("/addVisit/{id}")
    public String add(@PathVariable Long id, Model model){
        Pet pet=petSDJService.findById(id);
        Visit visit=new Visit();



        pet.getVisits().add(visit);
        model.addAttribute("visit",visit);
        model.addAttribute("pet",pet);
        return "visit/addVisit";
    }
    @GetMapping("/allVisit/{id}")
    public String viewall(@PathVariable Long id, Model model){
        Pet pet=petSDJService.findById(id);





        model.addAttribute("pet",pet);
        return "visit/allVisit";
    }

    @PostMapping("/saveVisit")
    public  String save(@RequestParam("pid") Long id, @ModelAttribute Visit visit){

        visit.setPet(petSDJService.findById(id));
        visitSDJService.save(visit);
        return "redirect:/owner/view/"+id;
    }
}
