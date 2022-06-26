public class Dog extends Pet implements Barkable{

    private String breed;


    public Dog(String name, int age, boolean isRescue, String breed) {
        super(name, age, isRescue);
        this.breed = breed;
    }

    public Dog(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void bark() {
        System.out.println("Bork Bork!");
    }
}
