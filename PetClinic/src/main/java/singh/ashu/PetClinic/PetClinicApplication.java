package singh.ashu.PetClinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import singh.ashu.PetClinic.Controller.MyController;

@SpringBootApplication
public class PetClinicApplication {

	public static void main(String[] args) {



		ApplicationContext ctx= SpringApplication.run(PetClinicApplication.class, args);

		MyController ctrl=(MyController) ctx.getBean("myController");

		System.out.println(ctrl.saiHello());


	}


}
