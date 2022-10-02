package singh.ashu.PetClinic.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import singh.ashu.PetClinic.services.MyServices;

@Controller
public class MyController {

    private final MyServices myServices;


    public MyController(@Qualifier("isService") MyServices myServices) {
        this.myServices = myServices;
    }


    public String saiHello(){
        return myServices.sayHello();
    }
}
