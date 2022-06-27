package main;

public class Pet {
    private String name;
    private int age;
    private boolean isRescue;

    public Pet() {
    }

    public Pet(int age, boolean isRescue, String name) {
        this.name = name;
        this.age = age;
        this.isRescue = isRescue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isRescue() {
        return isRescue;
    }

    public void setRescue(boolean rescue) {
        isRescue = rescue;
    }
}
