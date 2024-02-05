package neuefisched.de;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("01-0001", "Bagheera", "Bengal", 2);
        Animal dog = new Animal("01-0002", "shivie", "german shiver", 7);

        System.out.println("cat age is: " + cat.age());
        System.out.println("my cat is a: " + cat);
        System.out.println("dog name is: " + dog.name());
        System.out.println("my dog is a: " + dog);

    }
}