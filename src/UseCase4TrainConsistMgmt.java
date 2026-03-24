import java.util.LinkedList;
import java.util.List;

public class UseCase4TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC4 - Maintain Ordered Bogie Consist");
        System.out.println("=====================================\n");

        // Create LinkedList
        List<String> trainConsist = new LinkedList<>();

        // Add bogies
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Initial display
        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // Insert at position
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist);

        // Remove first and last
        trainConsist.remove(0);
        trainConsist.remove(trainConsist.size() - 1);

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        // Completion
        System.out.println("\nUC4 ordered consist operations completed...");
    }
}