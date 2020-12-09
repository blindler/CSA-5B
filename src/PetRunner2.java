public class PetRunner2 {

    public static void main(String[] args){

       Pet2 pet1 = new Pet2("fluffy");
       Pet2 pet2 = new Pet2("useless");
       Pet2 pet3 = new Pet2("Ms Puddin", 6);

        System.out.println(pet1.getName());
        System.out.println(pet2.getName());

        System.out.println(pet2.getName() + ", age: " + pet2.getAge());
        System.out.println(pet2.getPetCount());

    }
}
class Pet2 {
    private String name = "";
    private int age = 0;
    private static int petCount;

    public Pet2(String n){ // constructor
        name = n;
        petCount++;
        System.out.println("hey " + name);
    }


    public Pet2(String n, int a){
        this(n);
        age = a;
    }

    public int getPetCount(){
        return petCount;
    }
    public void setAge( int a){
        age = a;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
}

