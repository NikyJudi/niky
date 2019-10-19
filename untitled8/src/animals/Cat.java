package animals;

import animal.Animal;
import animal.IRunning;

public class Cat extends Animal implements IRunning {
    @Override
    public void run() {
        System.out.println(this.name + "正在四条腿跑");
    }

    public Cat(String name) {
        super(name);
    }
}
