public class Gen3 {
    public static void main(String[] args) {
         int a = Integer.parseInt(args[0]);
         int b = Integer.parseInt(args[1]);

         int x1 = ((int)(Math.random() * (b-a) )) +  a ; 
         int x2 = ((int)(Math.random() * (b-a) )) +  a ; 
         int x3 = ((int)(Math.random() * (b-a) )) +  a ; 

         int min = x1;
         if (x2 < min) {
            min = x2;
         }
         if (x3<min) {
            min = x3;
         }


        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        System.out.println(" The minimal generated number was " + min);

    }
}