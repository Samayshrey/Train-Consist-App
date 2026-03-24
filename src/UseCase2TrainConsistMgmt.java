import java.util.ArrayList;
import java.util.List;

public class UseCase2TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("=====================================\n");

        // Create ArrayList
        List<String> passengerBogies = new ArrayList<>();

        // Add bogiesgit add .
        //git commit -m "Added UC2 - ArrayList operations"
        //git push
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after adding
        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // Remove one bogie
        passengerBogies.remove("AC Chair");

        // Display after removing
        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies);

        // Check existence
        System.out.println("\nChecking if 'Sleeper' exists:");
        System.out.println("Contains Sleeper? : " + passengerBogies.contains("Sleeper"));

        // Final list
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        // Completion message
        System.out.println("\nUC2 operations completed successfully...");
    }
}