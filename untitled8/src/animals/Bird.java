package animals;

import animal.Animal;
import animal.IFlying;
import animal.IRunning;

public class Bird extends Animal implements IRunning, IFlying {
    public Bird(String name) {
        super(name);
    }
    public void fly() {
        System.out.println(this.name + "小鸟用翅膀正在飞");
    }

    @Override
    public void run() {
        System.out.println(this.name + "小鸟用两条腿正在跑");
    }

    @Override
    public void eat(String food) {
        System.out.println("Bird");
        System.out.println(this.name + "正在吃" + food);
    }
}
