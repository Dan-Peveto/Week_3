enum Excercise {RUN, SWIM, BIKE}

public class Cardio {
    // data fields
        // private field one
    private Excercise excercise;
        // private field two
    private double distance;

    // methods
        
    public Excercise getExcercise() {// method getter
        return excercise; // return excercise
    }
    public double getDistance() {// method getter
        return distance; // return distance
    }
        // method setter
    public void setExcercise(Excercise excercise) {
        this.excercise = excercise; // set excercise value
    }
    public void setDistance(double distance) {
        this.distance = distance; // set distance value
    }
    // print workout method
    public void printWorkout() {
        String typeExcercise; // type excercise value
        String typeDistance; // type excercise value
        // if statement to set type excercise and type distance
        if(excercise == Excercise.RUN) { 
            typeExcercise = "ran";
            typeDistance = "km";
        } else if(excercise == Excercise.BIKE) {
            typeExcercise = "biked";
            typeDistance = "km";
        } else {
            typeExcercise = "swam";
            typeDistance = "meters";
        }
        // print statement
        System.out.println("You " + typeExcercise + "a total of " + distance + " " + typeDistance);
    }

    // constructors // nondefault constructor
        // default constructor
        public Cardio(Excercise excercise) {
            distance = 0.00; // default constructor
            this.excercise = excercise; //non-default constructor
        }
}
