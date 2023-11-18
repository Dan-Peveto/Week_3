// Daniel Peveto
public class Fitbyte {
    // field
    private int age;
    private double restingHeartRate;

    // method
    // return Target Heart Rate
    public double TargetHeartRate(int percentageOfMaximum) {
        // convert int percentageof max from int to decimal
        double target = percentageOfMaximum * .01;
        // return formula
        return (MaxHeartRate(age) - restingHeartRate) * (target) + restingHeartRate;
    }
    // calculate max heart rate
    public double MaxHeartRate(int age) {
        double max = 206.3 - (0.711 * age);
        return max; 
    }
    // setters
    // set (update) age
    public void setAge(int age){
        this.age = age;
    }
    // set (update) restingHeartRate;
    public void setHeartRate(int restingHeartRate) {
        this.restingHeartRate =restingHeartRate;
    }
    // get heart rate
    public double getHeartRate() {
        return restingHeartRate;
    } 
    // get age
    public int getAge() {
        return age;
    }
    // constructor
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate; 
    }
}
