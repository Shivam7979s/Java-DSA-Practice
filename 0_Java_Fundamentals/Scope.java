public class Scope {
    public static void main(String[] args) {
        int a=22;
       

        {
            // int a=22; this will give errors
            a=44; //you can change the value in scope
            int c=55;//you can not use this outside the scope 
            System.out.println(c);
        }
        System.out.println(a);
        // System.out.println(c); this give error
    }
}        