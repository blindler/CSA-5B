public class Tester {

    public static void main (String[] args) {

        String message = "was it a cat I saw";
        System.out.println(message);
        String result = "";
        // reverse it

        for (int i = 0; i < message.length(); i++){
            result = message.substring(i,i+1) + result;

            System.out.println(result);
        }


        System.out.println(result);










//                while ( message.indexOf("x") != -1 )
//                {
//                    int x = message.indexOf("x");
//                    String part1 = message.substring(0,x);
//                    String part2 = message.substring(x+1);
//
//                    message = part1 + part2;
//
//                    System.out.println(message);
//                }



    }

}
