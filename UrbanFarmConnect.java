package mytiny;
//NAME: Khavya P
//Enrollment no:EBEON0823817093
//Batch Code:10226
//Tiny Project Topic:URBAN FARM CONNECT

//Description : I have developed a Java program titled "Urban FarmConnect" is a text-based interactive platform 
//              that simulates connecting urban farmers and tracking the crops they cultivate within a city. 

//Keywords Used : import,class,public,private,System.out,System.in,void,new,static,if,else,while
//                try,catch,switch,case,break,return,this,super.

import java.util.*;

//Concept 1: Importing classes
//Concept 2: Using Java Collections (List, HashMap)
//Concept 3: Object-Oriented Programming (Classes , Objects)
//Concept 4: User Input (Scanner)
//Concept 5: Conditional Statements (if-else)
//Concept 6: Loops (while)
//Concept 7: Exception Handling (try-catch)

class Crop {
 String name;
 double price;

 public Crop(String name, double price) {
     this.name = name;
     this.price = price;
 }
}

class Farmer {
 String name;
 List<Crop> crops;

 public Farmer(String name) {
     this.name = name;
     this.crops = new ArrayList<>();
 }

 public void addCrop(String name, double price) {
     crops.add(new Crop(name, price));
 }
}

public class UrbanFarmConnect {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Map<String, Farmer> farmers = new HashMap<>();

     // Concept 8: Using Methods (main method)
     // Concept 9: Variables and Data Types
     // Concept 10: Input/Output (System.in, System.out)

     while (true) {
         System.out.println("Urban FarmConnect Platform");
         System.out.println("1. Register Farmer");
         System.out.println("2. Add Crop to Farmer");
         System.out.println("3. List Farmers and Crops");
         System.out.println("4. Exit");
         System.out.print("Select an option: ");

         int choice = scanner.nextInt();
         scanner.nextLine(); // Consume newline

         // Concept 11: Control Structures (Switch)
         switch (choice) {
             case 1:
                 System.out.print("Enter Farmer Name: ");
                 String farmerName = scanner.nextLine();
                 farmers.put(farmerName, new Farmer(farmerName));
                 System.out.println("Farmer registered successfully.");
                 break;

             case 2:
                 System.out.print("Enter Farmer Name: ");
                 String farmerToAddCrop = scanner.nextLine();
                 if (farmers.containsKey(farmerToAddCrop)) {
                     System.out.print("Enter Crop Name: ");
                     String cropName = scanner.nextLine();
                     System.out.print("Enter Crop Price: ");
                     double cropPrice = scanner.nextDouble();
                     farmers.get(farmerToAddCrop).addCrop(cropName, cropPrice);
                     System.out.println("Crop added successfully.");
                 } else {
                     System.out.println("Farmer not found.");
                 }
                 break;

             case 3:
                 System.out.println("List of Registered Farmers:");
                 for (String farmer : farmers.keySet()) {
                     System.out.println("Farmer Name: " + farmer);
                     System.out.println("Crops:");
                     for (Crop crop : farmers.get(farmer).crops) {
                         System.out.println("- " + crop.name + " (Price: $" + crop.price + ")");
                     }
                 }
                 break;

             case 4:
                 System.out.println("Exiting Urban FarmConnect Platform.");
                 scanner.close();
                 System.exit(0);

             default:
                 System.out.println("Invalid option.");
         }
     }
 }
}
