package test;

import animal.Animal;
import animals.Duck;
import animals.Fish;

public class Test2 {
    public static void main(String[] args) {
        Animal duck = new Duck("鸭鸭");
//        Animal fish = new Fish("金鱼");
//        Animal bird = new Bird("圆圆");
//        Animal cat = new Cat("咪咪");
        Duck duck1 = (Duck)duck;
        duck1.fly();
        duck1.run();
        duck1.swim();
        Fish fish = new Fish("鱼鱼");
        fish.swim();
    }
}
