public class Coins {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int quarters = number / 25 ;
        int cents = number % 25; 
        System.out.println(" Use " + quarters +  " quarters " + " and " + cents +  " cents ");
    }
}