
public class ShoppingCart_4_3 {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        
        // Get the index of the space character (" ") in custName.
        int spaceldx = custName.indexOf(" ");


        // Use the substring method parse out the first name and print it.
        firstName = custName.substring(0, spaceldx);
        System.out.println(firstName);
    }

    
}
