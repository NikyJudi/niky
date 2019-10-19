package animals;

import animal.IRunning;

public final class ChineseGardenCat extends Cat implements IRunning {
    public ChineseGardenCat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(this.name + "ChineseGardenCat正在跑");
    }

    @Override
    public void eat(String food) {
        System.out.println("ChineseGardenCat");
        System.out.println(this.name + "正在吃" + food);
    }
}
