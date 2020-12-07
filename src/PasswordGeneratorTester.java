public class PasswordGeneratorTester {

    public static void main(String[] args){
        PasswordGenerator pw1 = new PasswordGenerator(4, "dfhs");
        PasswordGenerator pw2 = new PasswordGenerator(6);
        System.out.println( pw1.pwCount());
        System.out.println( pw1.pwGen() );
        System.out.println( pw1.pwGen() );
        System.out.println( pw2.pwCount());

    }
}

class PasswordGenerator{

    private int pwLength;
    private String prefix;

    private static int pwCount = 0;

    public PasswordGenerator(int len, String pre){
        pwLength = len;
        prefix = pre;
    }

    public PasswordGenerator(int len){
        this(len, "A");

    }

    public String pwGen(){
        String temp = prefix + ".";

        for ( int i = 0; i < pwLength; i++){
            temp += (int)( Math.random() *10 );
        }
        pwCount++;
        return temp;
    }
    public int pwCount(){
        return pwCount;
    }



}
