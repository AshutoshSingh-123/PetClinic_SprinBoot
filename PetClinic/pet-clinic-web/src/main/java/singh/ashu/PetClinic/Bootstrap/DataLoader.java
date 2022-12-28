package singh.ashu.PetClinic.Bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import singh.ashu.PetClinic.models.*;
import singh.ashu.PetClinic.repository.OwnerRepository;
import singh.ashu.PetClinic.services.Map.*;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerRepository ownerRepository;
    private final OwnerMapService ownerMapServiceServiceService;
    private final VetMapService vetMapServiceServiceService;

    private final PetTypeMapService petTypeMapService;

    private final SpecilityMapService specilityMapService;

    private final VisitMapService visitMapService;
    public DataLoader(OwnerRepository ownerRepository, OwnerMapService ownerMapServiceServiceService, VetMapService vetMapServiceServiceService, PetTypeMapService petTypeMapService, SpecilityMapService specilityMapService, VetMapService vetMapService, VisitMapService visitMapService) {
        this.ownerRepository = ownerRepository;
        this.ownerMapServiceServiceService = ownerMapServiceServiceService;
        this.vetMapServiceServiceService = vetMapServiceServiceService;
        this.petTypeMapService = petTypeMapService;
        this.specilityMapService = specilityMapService;

        this.visitMapService = visitMapService;
    }


    @Override
    public void run(String... args) throws Exception {

        PetType pt1=new PetType();
        pt1.setName("Dog");

        PetType PT1=petTypeMapService.save(pt1);

        PetType pt2=new PetType();
        pt1.setName("Cat");

        PetType PT2=petTypeMapService.save(pt2);

        System.out.println("PetType loaded:"+petTypeMapService.findAll());

        Visit visit1=new Visit();
        visit1.setDate(LocalDate.now());
        visit1.setDesc("This is first");
        visitMapService.save(visit1);

        System.out.println("this is visit:"+ visitMapService.findAll());


        Specility s1=new Specility();
        s1.setDesc("Dentist");
        Specility S1= specilityMapService.save(s1);

        Specility s2=new Specility();
        s1.setDesc("Surgen");
        Specility S2= specilityMapService.save(s2);


        Owner o1=new Owner();
//        o1.setId(ownerMapServiceServiceService.getNextId());
        o1.setFirstName("Ashu");
        o1.setLastName("Singh");
        o1.setCity("Varansi");
        o1.setAddress("F2 B2 Mithila");
        o1.setTelephone("999999999");
        ownerRepository.save(o1);

        Pet p1=new Pet();
        p1.setBirthDate(LocalDate.now());
        p1.setOwner(o1);
        p1.setPetType(PT1);
        p1.setName("MyPet1");

        o1.getPets().add(p1);

        ownerMapServiceServiceService.save(o1);

        Owner o2=new Owner();
//        o2.setId(ownerMapServiceServiceService.getNextId());
        o2.setFirstName("Ashu");
        o2.setLastName("Singh");
        o2.setCity("Patna");
        o2.setAddress("F2 B2 Mithila");
        o2.setTelephone("999999999");
        ownerRepository.save(o2);

        Pet p2=new Pet();
        p2.setBirthDate(LocalDate.now());
        p2.setOwner(o2);
        p2.setPetType(PT2);
        p2.setName("MyPet2");

        o2.getPets().add(p2);
        ownerMapServiceServiceService.save(o2);

        System.out.println("Owner Loaded:"+ownerMapServiceServiceService.findAll());

        Vet v1=new Vet();
//        v1.setId(vetMapServiceServiceService.getNextId());
        v1.setFirstName("V1");
        v1.setLastName("v1");
        v1.getSpecilities().add(S1);

        vetMapServiceServiceService.save(v1);

        Vet v2=new Vet();
//        v2.setId(vetMapServiceServiceService.getNextId());
        v2.setFirstName("V2");
        v2.setLastName("v2");
        v2.getSpecilities().add(S2);
        vetMapServiceServiceService.save(v2);

        System.out.println("Vet loaded:"+vetMapServiceServiceService.findAll());


    }
}
