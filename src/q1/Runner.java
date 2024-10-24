package q1;

public class Runner {
    public static void main(String[] args) {
        Worker w = new Worker("Saima",25000);
        System.out.println(w);

        Supervisor s = new Supervisor("Sima",50000,"Chairman");
        System.out.println(s);

        Director d = new Director("Salma",75000,"CEO");
        System.out.println(d);




    }
}
