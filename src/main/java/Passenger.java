public class Passenger extends Person {

    private int num_bags;

    public Passenger(String name, int num_bags) {
        super(name);
        this.num_bags = num_bags;
    }

    public int getNum_bags() {
        return num_bags;
    }
}





