public class Tester {

    public static void main (String[] args) {

                String message = "Ix lovex youxxx";
                System.out.println(message);


                while ( message.indexOf("x") != -1 )
                {
                    int x = message.indexOf("x");
                    String part1 = message.substring(0,x);
                    String part2 = message.substring(x+1);

                    message = part1 + part2;

                    System.out.println(message);
                }



    }

}
