public class Pet {
    private String name = "";
    private int age = 0;

    public Pet(String n){ // constructor
        name = n;
        System.out.println("hey " + name);
    }

    public Pet(String n, int a){
        this(n);
        age = a;
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
