package singh.ashu.PetClinic.multi;

public class Display {

    public   void wish(String name){
        System.out.println("Before........");
        synchronized (Display.class){
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello:"+name);
            }
        }
    }
}
