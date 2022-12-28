package singh.ashu.PetClinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootApplication


public class PetClinicApplication {

    public static void main(String[] args) {



        ApplicationContext ctx= SpringApplication.run(PetClinicApplication.class, args);




    }




}

