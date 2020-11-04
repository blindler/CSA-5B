public class Tester {

    public static void main (String[] args){


                String s1 = new String("hat");
                String s2 = new String("hat");
                String s3 = s2;
                boolean b1 = (s1 == s2);
                boolean b2 = (s2 == s3);
                boolean b3 = s1.equals(s2);
                boolean b4 = "hat".equals(s1);
                System.out.println(b1+" "+b2+" "+b3+" "+b4);




    }


}
