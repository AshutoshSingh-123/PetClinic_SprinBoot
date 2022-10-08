# PetClinic_SprinBoot
Using Spring Boot

1.ApplicationContext and Dependencies Injection

      ---> Depending class obtain dependent class through DI.
      ---> ApplicationContext is responsible for handling all code around our 
           application.

      ApplicationContext ctx= SpringApplication.run(PetClinicApplication.class, args);

      MyController ctrl=(MyController) ctx.getBean("myController");
      System.out.println(ctrl.sayHello());
      
      --->DI of interfaces is preffered over Concrete classes.

      --->fina; ,private and initialized through contructor
      ---> Way of DI:
             * Property based
             * Setter Based
             * Contructer Based

2.Inversion of Control(IoC)

      ---> It allows dependencies to be injected at runtime

3.Qualifier

      --->If multiple SeviceImpl and one Service

      private final Service service;
      public MyController(@Qualifier("serviceImpl" Service service)
            {
              this.service=service;
            }

4.Primary Bean

        --->If multiple SeviceImpl and one Service
            
            @Primary
            class SeviceImpl implements Sevice
                {
                }

5.Profile

        @Profile("EN")
        @Service("isService")
        public class MyServicesImpl implements MyServices {
        @Override
        public String sayHello() {
        return "This is EN";
        }
        }

        private final MyServices myServices;

        -----------------------------------Controller------------------------
        public MyController(@Qualifier("isService") MyServices myServices) {
            this.myServices = myServices;
        }
    
    
        public String saiHello(){
            return myServices.sayHello();
        }

        ---------------------------------properties---------------------------

                    spring.profiles.active=EN
 
        Default:

                @Profile({"EN","default"})

6.Maven Release Plugin

        <build>
            <plugins>
                <plugin>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-maven-plugin</artifactId>
    
                </plugin>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-release-plugin</artifactId>
                    <configuration>
                        <goals>install</goals>
                    </configuration>
                </plugin>
            </plugins>
    
        </build>
        <scm>
            <developerConnection>scm:git:https://github.com/AshutoshSingh-123/PetClinic_SprinBoot.git</developerConnection>
          <tag>HEAD</tag>
        </scm>

        Commands:
                mvn release:prepare
                mvn release:perform


7.Stereotype

        --->Set of annotation Used for defining beans of particular type
            .@Repository
            .@Controller
            .@RestController
            .@Component
            .@Service

8. Configuration instead of using Strereotypes

        --->create package config.
        @Configuration
       public class GreetingServiceConfig {

          @Profile({"ES", "default"})
          @Bean("i18nService")
          I18NSpanishService i18NSpanishService(){
             return new I18NSpanishService();
         }

         @Profile("EN")
         @Bean
         I18nEnglishGreetingService i18nService(){
             return new I18nEnglishGreetingService();
        }

       @Primary
       @Bean
       PrimaryGreetingService primaryGreetingService(){
             return new PrimaryGreetingService();
       }

        @Bean
        ConstructorGreetingService constructorGreetingService(){
             return new ConstructorGreetingService();
        }
       
       }

9. If files are not in same package as java Apllication.

         --->@ComponentScan({"com.A","com.B"})