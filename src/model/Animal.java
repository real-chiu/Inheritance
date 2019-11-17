package src.model;

public class Animal {
    public int age;
    public int weight;

    public Animal (int age, int weight) {
        this.age = age;
        this.weight = weight;
    }
    public void running () {
        System.out.println("Running");
    }

    public void eating () {
        System.out.println("Eating");
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void setWeight (int weight) {
        this.weight = weight;
    }

    public int getAge () {
        return age;
    }

    public int getWeight () {
        return weight;
    }
}
