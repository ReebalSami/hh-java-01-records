package neuefisched.de;

public class Main {
    public static void main(String[] args) {
        Owner owner1=new Owner("Reebal","Hamburg",25);
        Owner owner2=new Owner("Lüder","Köln",25);
        Species catSpecies = new Species("cat", 100);
        Species dogSpecies = new Species("dog", 300);

        Animal cat1 = new Animal("01-0001", "Bagheera", "Bengal", 2,owner1, catSpecies);
        Animal cat2 = new Animal("01-0002", "Mieze", "British-Short-hair", 2,owner1, catSpecies);
        Animal dog = new Animal("01-0002", "shivie", "german shiver", 7,owner2, dogSpecies);

        System.out.println("cat1 age is: " + cat1.age());
        System.out.println("my cat1 is a: " + cat1);
        System.out.println("dog name is: " + dog.name());
        System.out.println("my dog is a: " + dog);
        System.out.println("cat2 age is: " + cat2.age());
        System.out.println("my cat2 is a: " + cat2);

    }
}