package animals;

import animal.Animal;
import animal.ISwimming;

public class Fish extends Animal implements ISwimming {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void eat(String food) {
        super.eat(food);
    }

    @Override
    public void swim() {
        System.out.println(this.name + "鱼儿正在游泳");
    }
}
