public class numberformat {
    public static void main(String args[]){
        try {
            // "Hello" is not a number
            int num = Integer.parseInt ("Hello") ;

            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }
}
