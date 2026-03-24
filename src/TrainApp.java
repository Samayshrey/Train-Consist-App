import java.util.*;

public class TrainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Order + uniqueness
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Capacity mapping
        HashMap<String, Integer> capacityMap = new HashMap<>();

        // Predefined capacities
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);

        while (true) {

            System.out.println("\n===== Train Consist Management =====");
            System.out.println("1. Add Bogie");
            System.out.println("2. Remove Bogie");
            System.out.println("3. Show Train");
            System.out.println("4. Check Bogie Exists");
            System.out.println("5. Show Capacities");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter bogie name: ");
                    String bogie = sc.nextLine();

                    if (train.add(bogie)) {
                        System.out.println("Bogie added successfully!");
                    } else {
                        System.out.println("Duplicate bogie! Not added.");
                    }
                    break;

                case 2:
                    System.out.print("Enter bogie to remove: ");
                    String remove = sc.nextLine();

                    if (train.remove(remove)) {
                        System.out.println("Bogie removed.");
                    } else {
                        System.out.println("Bogie not found.");
                    }
                    break;

                case 3:
                    System.out.println("Train Consist:");
                    System.out.println(train);
                    break;

                case 4:
                    System.out.print("Enter bogie to check: ");
                    String check = sc.nextLine();

                    if (train.contains(check)) {
                        System.out.println("Bogie exists.");
                    } else {
                        System.out.println("Bogie not found.");
                    }
                    break;

                case 5:
                    System.out.println("Bogie Capacities:");
                    for (String b : train) {
                        if (capacityMap.containsKey(b)) {
                            System.out.println(b + " -> " + capacityMap.get(b));
                        } else {
                            System.out.println(b + " -> Capacity not defined");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}