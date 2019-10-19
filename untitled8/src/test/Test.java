package test;

import animal.Animal;
import animals.Bird;
import animals.Cat;
import animals.ChineseGardenCat;

public class Test {
    public static void main(String[] args) {
        Animal bird = new Bird("咕咕");
        Animal cat = new Cat("咪咪");
        Animal cat2 = new ChineseGardenCat("大橘");
        feed(cat2);
        feed(bird);
        feed(cat);
    }
    private static void feed (Animal animal) {
        animal.eat("零食");
    }
}
