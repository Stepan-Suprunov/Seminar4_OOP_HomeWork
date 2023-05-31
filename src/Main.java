//  Домашнее задание к семинару №4 Объектно-ориентированное программирование Супрунов Степан

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Box<Apple> apples = new Box<>();
        Box<Orange> oranges = new Box<>();
        Box<Apple> newApples = new Box<>();

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Apple apple7 = new Apple();
        Apple apple8 = new Apple();
        Apple apple9 = new Apple();
        Apple apple0 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();
        Orange orange5 = new Orange();
        Orange orange6 = new Orange();
        Orange orange7 = new Orange();
        Orange orange8 = new Orange();
        Orange orange9 = new Orange();
        Orange orange0 = new Orange();

        apples.addFruit(apple1);
        apples.addFruit(apple2);
        apples.addFruit(apple3);
        apples.addFruit(apple4);
        apples.addFruit(apple5);
        apples.addFruit(apple6);
        apples.addFruit(apple7);
        apples.addFruit(apple8);
        apples.addFruit(apple9);
        apples.addFruit(apple0);

        oranges.addFruit(orange1);
        oranges.addFruit(orange2);
        oranges.addFruit(orange3);
        oranges.addFruit(orange4);
        oranges.addFruit(orange5);
        oranges.addFruit(orange6);
        oranges.addFruit(orange7);
        oranges.addFruit(orange8);
        oranges.addFruit(orange9);
        oranges.addFruit(orange0);

        System.out.println(apples.getWeight());
        System.out.println(oranges.getWeight());

        System.out.println(apples.compare(oranges));

        apples.move(newApples);
        System.out.println(newApples.getWeight());
    }
}

abstract class Fruit {

    private final float weight;

    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }
}

class Apple extends Fruit {

    public Apple() {
        super(1.0f);
    }
}

class Orange extends Fruit {

    public Orange() {
        super(1.5f);
    }
}

class Box<T extends Fruit> {

    protected ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void setFruits(ArrayList<T> fruits) {
        this.fruits = fruits;
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        return (fruits.get(0)).getWeight() * fruits.size();
    }

    public boolean compare(Box box) {
        if (this.getWeight() == box.getWeight())
            return true;
        else {
            return false;
        }
    }

    public void move(Box<T> box) {
        box.setFruits(this.fruits);
        this.fruits = null;
    }
}