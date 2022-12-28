package singh.ashu.PetClinic.services.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import singh.ashu.PetClinic.models.Owner;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerMapServiceTest {

    String lst="Singh";
    OwnerMapService ownerMapService;

    @BeforeEach
    void setUp() {
        ownerMapService=new OwnerMapService();
        Owner owner=new Owner();
        owner.setLastName(lst);
        ownerMapService.save(owner);
    }

    @Test
    void findAll() {
        Set<Owner> l=ownerMapService.findAll();
        assertEquals(1,l.size());
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(1L);
    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(2L));
    }

    @Test
    void save() {
        Owner owner=new Owner();
        owner.setLastName(lst);
        ownerMapService.save(owner);
    }

    @Test
    void findById() {
        Owner owner=ownerMapService.findById(1L);
        assertEquals(1L,owner.getId());
    }

    @Test
    void findByLastName() {
        Owner owner=ownerMapService.findByLastName(lst);
        assertNotNull(owner);
    }
}