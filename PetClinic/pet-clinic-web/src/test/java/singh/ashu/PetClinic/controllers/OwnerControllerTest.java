package singh.ashu.PetClinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;
import singh.ashu.PetClinic.models.Owner;
import singh.ashu.PetClinic.services.SDJService.OwnerSDJService;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {

    @Mock
    OwnerSDJService ownerSDJService;
    @InjectMocks
    OwnerController ownerController;
    MockMvc mockMvc;

    List<Owner> owners;

    @BeforeEach
    void setUp() {
        owners=new ArrayList<>();
        owners.add(new Owner());
        owners.add(new Owner());
        mockMvc= MockMvcBuilders.standaloneSetup(ownerController).build();
    }

    @Test
    void owner() throws Exception {

        when(ownerSDJService.findAll()).thenReturn(owners);
        mockMvc.perform(get("/owner"))
                .andExpect(status().isOk())
                .andExpect(view().name("owner/index"))
                .andExpect(model().attribute("owners",hasSize(2)));
    }
}