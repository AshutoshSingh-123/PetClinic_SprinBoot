package singh.ashu.PetClinic;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import singh.ashu.PetClinic.models.Owner;
import singh.ashu.PetClinic.services.Map.OwnerMapService;

import java.util.Set;

@Controller
@ResponseBody
public class MyController {

    private OwnerMapService ownerMapService;

    public MyController(OwnerMapService ownerMapService) {
        this.ownerMapService = ownerMapService;
    }





    @RequestMapping("/")
    public Set<Owner> hello(){
        Owner o1=new Owner();
        o1.setFirstName("Ashu");
        o1.setLastName("Singh");
        o1.setId(2);
        ownerMapService.save(o1);
        System.out.println(ownerMapService.findAll());
        return ownerMapService.findAll();
    }
}
