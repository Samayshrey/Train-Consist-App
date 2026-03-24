import java.util.HashSet;
import java.util.Set;

public class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("UC3 - Track Unique Bogie IDs");
        System.out.println("=====================================\n");

        // Create HashSet
        Set<String> bogies = new HashSet<>();

        // Add bogie IDs (including duplicates)
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries
        bogies.add("BG101");
        bogies.add("BG102");

        // Display result
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        // Note
        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        // Completion message
        System.out.println("\nUC3 uniqueness validation completed...");
    }
}