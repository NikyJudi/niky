package shapePackage;

abstract class Shape {
    void func(){
        System.out.println("abstract");
    }
    String name = "";
    abstract public void draw ();
}
