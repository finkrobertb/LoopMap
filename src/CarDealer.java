import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarDealer
{

    public static void main(String[] args)
    {
        Map<String, String> carInventory = new HashMap<>();

        // Model = key, Brand = value       
        carInventory.put("Civic", "Honda");
        carInventory.put("Wrangler", "Jeep");
        carInventory.put("A7", "Audi");
        carInventory.put("Challenger", "Dodge");
        carInventory.put("Escalade", "Cadillac");
        carInventory.put("Camaro", "Chevrolet");
        carInventory.put("Jetta", "Volkswagon");
        carInventory.put("Escape", "Ford");
        carInventory.put("Tuscon", "Hyundai");
        carInventory.put("Sorento", "Kia");
        carInventory.put("LX", "Lexus");
        carInventory.put("Frontier", "Nissan");
        carInventory.put("Forester", "Subaru");
        carInventory.put("Model S", "Telsa");
        carInventory.put("Prius", "Toyota");

        Scanner input = new Scanner(System.in);
        System.out.println("What model vehicle are you looking for?");
        String customerChoice = input.next();

        if (carInventory.containsKey(customerChoice) == true) {
            
            System.out.println("Oh, you're looking for a " + customerChoice + "?  Our " + carInventory.get(customerChoice) + " selection is right over here...");
        
        } else {
            
            System.out.println("Sorry, we're out of those.  Check back next month.");
            
        }
        
    }

}
