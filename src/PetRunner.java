public class PetRunner {

    public static void main(String[] args){

       Pet pet1 = new Pet("fluffy");
       Pet pet2 = new Pet("useless");
       Pet pet3 = new Pet("Ms Puddin", 6);


        System.out.println(pet1.getName());
        System.out.println(Pet.getCount());

        System.out.println(pet2.getName() + ", age: " + pet2.getAge());

    }
}
