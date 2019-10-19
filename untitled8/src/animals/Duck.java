package animals;

import animal.Animal;
import animal.IFlying;
import animal.IRunning;
import animal.ISwimming;

public class Duck extends Animal implements IRunning, IFlying, ISwimming {
    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(this.name + "鸭子用翅膀正在飞");
    }

    @Override
    public void run() {
        System.out.println(this.name + "正在用两条腿跑");
    }

    @Override
    public void swim() {
        System.out.println(this.name + "水上漂");
    }
}
