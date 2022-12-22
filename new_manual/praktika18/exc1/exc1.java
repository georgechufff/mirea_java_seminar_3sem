public class exc1 {
    public void exceptionDemo() {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }

    public static void main(String [] args){
        exc1 a = new exc1();
        a.exceptionDemo();
    }
}