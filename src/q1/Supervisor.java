package q1;

public class Supervisor extends Worker{
    public String division;

    Supervisor(String name, double wages, String division) {
        super(name,wages);
        this.division = division;
    }

    @Override
    public String toString() {
        return "Name : "+ name + "\nWages : "+ wages + "\nDivision: " + division;
    }
}