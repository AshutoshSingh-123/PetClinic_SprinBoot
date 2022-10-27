package singh.ashu.PetClinic.multi;

public class Main {

    public static void main(String[] args) {
        Display d=new Display();
        MyThread t1=new MyThread(d,"Dhoni");
        MyThread t2=new MyThread(d,"Yuraj");
        t1.start();
        t2.start();
    }
}
