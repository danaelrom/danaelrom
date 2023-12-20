public class Triangle {
    public static void main(String[] args) {
         int a = Integer.parseInt(args[0]);
         int b = Integer.parseInt(args[1]);
         int c = Integer.parseInt(args[2]);
         boolean IsTriangle = true; 
         if (a + b < c || b + c < a || a + c < b)
         {
            IsTriangle = false ;
         }


        System.out.println(a + " , " + b + " , " + c +" : " + IsTriangle);
    }
}