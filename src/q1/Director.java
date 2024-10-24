
package q1;

public class Director extends Supervisor{

    Director(String name, double wages, String division) {
        super(name,wages,division);
    }

    @Override
    public String toString() {
        return "Name : "+ name + "\nWages : "+ wages +"\nDivision: " + division;
    }
}
