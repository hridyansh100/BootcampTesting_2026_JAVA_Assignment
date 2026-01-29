public class Float {

    public static void main(String[] args) {
        
        float discount = 15.75f;  // Note the 'f' at the end
        float price = 120.50f;
        float finalPrice = price - discount;

        System.out.println("Original Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);
    }
}