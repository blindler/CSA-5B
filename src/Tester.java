public class Tester {

    public static void main(String[] args) {

        int[] list = {5,6,7,8};

        print(someMethod(list));
        print(list);
        String s = "hey";



    }

    public static int[] someMethod(int[] nums) {

        int[] a = {1,2,3,4};
        nums[0]=50;
        nums = a;
        return a;

    }
    public static void print(int[] a){
        for (int num: a){
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

























