package neuefisched.de;

public record Animal(
        String id,
        String name,
        String breed,
        int age,
        Owner owner,
        Species species
) {

}
