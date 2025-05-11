
interface shape{
    public void draw();
}

class Circle implements shape{

    @Override
    public void draw() {
        System.out.println("this is the draw method in circle class");
    }
}

class Rectangle implements shape{

    @Override
    public void draw() {
        System.out.println("this si the draw method in Rectangle class");
    }
}

class Square implements shape{

    @Override
    public void draw() {
        System.out.println("this is the draw method in Square class");
    }
}
public class hhh {
    public static void main(String[] args) {

    }
}
