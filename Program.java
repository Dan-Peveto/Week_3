public class Program {
    public static void main(String[] args) {
        // Create instance of FitByte
        Fitbyte myFitbyte = new Fitbyte(55, 65);
        System.out.println("Your target heart rate is: " + myFitbyte.TargetHeartRate(75));
            // call method one 
            // call method two
        // Create instance of Cardio
        Cardio afternoonRun = new Cardio(Excercise.RUN);
            // call method one
            afternoonRun.setDistance(100);
            // call method two
            afternoonRun.printWorkout();
    }
}