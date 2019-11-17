package src.model;

public class Main {
    public static void main(String[] args) {
        Tiger tiger = new Tiger(2, 500);
        System.out.println("Age of tiger is " + tiger.getAge());
        System.out.println("Age of tiger is " + tiger.getWeight());
        tiger.eating();
        tiger.running();
        tiger.meow();
    }
}
