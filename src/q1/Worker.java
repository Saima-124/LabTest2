package q1;

public class Worker {
    String name;
    double wages;

    public Worker(String name, double wages) {
        this.name = name;
        this.wages = wages;
    }
    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "Name : "+ name + "\nWages : "+ wages;
    }
}