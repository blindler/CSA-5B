public class Tester {

    public static void main(String[] args) {

    int i = 0;
        for ( i = 0; i < 10; i++){}

        String s = "hey";

       String ss = s.substring(s.length());
        System.out.println(ss);



        // stars(3);
    }

    public static void stars(int num) {

        if (num == 1) {
            return;
        }
        stars(num - 1);

        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println();

    }
}





















//        String message = "was it a cat I saw";
//        System.out.println(message);
//        String result = "";
//        // reverse it
//
//        for (int i = 0; i < message.length(); i++){
//            result = message.substring(i,i+1) + result;
//
//            System.out.println(result);
//        }
//
//
//        System.out.println(result);










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






