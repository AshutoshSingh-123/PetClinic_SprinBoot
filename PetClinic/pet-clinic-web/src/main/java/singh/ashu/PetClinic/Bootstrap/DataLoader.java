package singh.ashu.PetClinic.Bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import singh.ashu.PetClinic.models.Owner;
import singh.ashu.PetClinic.models.Vet;
import singh.ashu.PetClinic.services.Map.OwnerMapService;
import singh.ashu.PetClinic.services.Map.VetMapService;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerMapService ownerMapServiceServiceService;
    private final VetMapService vetMapServiceServiceService;

    public DataLoader(OwnerMapService ownerMapServiceServiceService, VetMapService vetMapServiceServiceService) {
        this.ownerMapServiceServiceService = ownerMapServiceServiceService;
        this.vetMapServiceServiceService = vetMapServiceServiceService;
    }


    @Override
    public void run(String... args) throws Exception {
        Owner o1=new Owner();
//        o1.setId(ownerMapServiceServiceService.getNextId());
        o1.setFirstName("Ashu");
        o1.setLastName("Singh");
        ownerMapServiceServiceService.save(o1);

        Owner o2=new Owner();
//        o2.setId(ownerMapServiceServiceService.getNextId());
        o2.setFirstName("Ashu");
        o2.setLastName("Singh");
        ownerMapServiceServiceService.save(o2);

        System.out.println("Owner Loaded:"+ownerMapServiceServiceService.findAll());

        Vet v1=new Vet();
//        v1.setId(vetMapServiceServiceService.getNextId());
        v1.setFirstName("V1");
        v1.setLastName("v1");

        vetMapServiceServiceService.save(v1);

        Vet v2=new Vet();
//        v2.setId(vetMapServiceServiceService.getNextId());
        v2.setFirstName("V2");
        v2.setLastName("v2");

        vetMapServiceServiceService.save(v2);

        System.out.println("Vet loaded:"+vetMapServiceServiceService.findAll());
    }
}
