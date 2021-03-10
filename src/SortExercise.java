import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;


public class SortExercise
{

    public static void main(String[] args)
    {
        List<Integer> numbersList = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);

        // Number input
        for(int i = 0; i < 5; ++i)
        {
            System.out.println("Please enter a number: ");
            Integer number = Integer.parseInt(input.nextLine());
            numbersList.add(number);
        }

        System.out.println("Your Number list is: " + numbersList);

        // Sum
        double sum = 0;
        for(int i = 0; i < numbersList.size(); i++)
        {
            sum += numbersList.get(i);
        }
        int sumInt = (int) sum;
        System.out.println("Your sum is: " + sumInt);

        // Product
        double product = 1;
        for(int i = 0; i < numbersList.size(); i++)
        {
            product *= numbersList.get(i);
        }
        int productInt = (int) product;
        System.out.println("Your product is: " + productInt);

        // Smallest
        System.out.println("Smallest is: " + Collections.min(numbersList));
        
        // Largest
        System.out.println("Largest is: " + Collections.max(numbersList));
        
    }

}
