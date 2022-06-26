public class Cat extends Pet implements Meowable{

    private String color;

    public Cat(String color) {
        this.color = color;
    }

    public Cat(String name, int age, boolean isRescue, String color) {
        super(name, age, isRescue);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void meow() {
        System.out.println("This is a meow!");
    }
}
