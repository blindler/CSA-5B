public class Unit03FRQProgressCheck {


    public static void main (String[] args) {
        boolean rsvp = false;
        int selection = 0; //1 represents "beef", 2 represents "chicken", 3 represents "pasta", others "fish"
        String option1;
        String option2 = "";

        String a = "2";
        String b = new String("2");

        System.out.println(a == b);
        System.out.println(a.equals(b));

        //(a) Write a code segment that prints "attending" if rsvp is true and prints "not attending" otherwise.

        if (rsvp == true)
            System.out.println("attending");

        else
            System.out.println("not attending");


        //(b) Write a code segment that prints the food item associated with selection.
        // For example, if selection is 3, the code segment should print "pasta".
        if (selection == 1) System.out.println("beef");
        else if (selection == 2) System.out.println("chicken");
        else if (selection == 3) System.out.println("pasta");
        else System.out.println("fish");


        //Write a code segment that will store a dinner selection in option1 based on the values of rsvp
        //and selection. The intended behavior of the code segment is described below.
        //If rsvp is true, the code segment should store in option1 a string indicating the person’s
        //attendance and food choice. For example, if rsvp is true and selection is 1, the following string
        //should be stored in option1.
        //"Thanks for attending. You will be served beef."
        //If rsvp is false, the following string should be stored in option1, regardless of the value of selection.
        //"Sorry you can't make it."

        if (rsvp) {
            option1 = "Thanks for attending. You will be served ";
            if (selection == 1) option1 += "beef";
            else if (selection == 2) option1 += "chicken";
            else if (selection == 3) option1 += "pasta";
            else option1 += "fish";
        } else
            option1 = "sorry";


        //Write a code segment that will print true if the strings option1 and option2 contain the
        //same values and will print false otherwise.

        if (option1.equals(option2)) System.out.println("true");
        else System.out.println("false");


        System.out.println(option1.equals(option2));

    }

}
