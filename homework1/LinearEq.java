public class LinearEq {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double x = ( c - b ) / a ;

        System.out.println(a + " * " + " x " + " + " + b + " = " + c);
        System.out.println(" x " + " = " + x);
    }
}