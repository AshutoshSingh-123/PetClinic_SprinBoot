package singh.ashu.PetClinic.Controller;


import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("This is my controller");
        return "You are great";
    }
}
