package singh.ashu.PetClinic.services.SDJService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import singh.ashu.PetClinic.models.Owner;
import singh.ashu.PetClinic.repository.OwnerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OwnerSDJServiceImplTest {

    @Mock
    OwnerRepository ownerRepository;

    @InjectMocks
    OwnerSDJServiceImpl ownerSDJService;

    @BeforeEach
    void setUp() {
//        ownerSDJService=new OwnerSDJServiceImpl(ownerRepository);
    }

    @Test
    void save() {
        Owner owner=new Owner();
        when(ownerRepository.save(any())).thenReturn(owner);
        Owner o1=ownerSDJService.save(owner);
        assertNotNull(o1);

    }

    @Test
    void findById() {
        Owner retunOwner=Owner.builder().build();
        when(ownerRepository.findById(any())).thenReturn(Optional.ofNullable(retunOwner));
        Owner owner=(Owner) ownerSDJService.findById(1L);
        assertNotNull(owner);
        verify(ownerRepository).findById(any());
    }

    @Test
    void findAll() {
        ArrayList<Owner> list=new ArrayList<>();
        list.add(new Owner());
        list.add(new Owner());
        when(ownerRepository.findAll()).thenReturn(list);
        List<Owner> owners=  ownerSDJService.findAll();
        assertEquals(2,owners.size());
        verify(ownerRepository).findAll();
    }

    @Test
    void delete() {
        Owner owner=new Owner();

        ownerSDJService.delete(owner);
        verify(ownerRepository).delete(any());

    }

    @Test
    void deleteById() {
        Owner owner=new Owner();

        ownerSDJService.deleteById(1L);
        verify(ownerRepository).deleteById(any());
    }
}