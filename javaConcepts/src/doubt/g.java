package doubt;

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
class g{
    public static void main(String[] args) {
         shape cirlce=()->System.out.println("this is the draw method in circle class");
         shape rectangle=()->System.out.println("this si the draw method in Rectangle class");
         shape square=()->System.out.println("this is the draw method in Square class");
         cirlce.draw();
         rectangle.draw();
         square.draw();

         print(square);
         //or
        print(()->System.out.println("this is the draw method in circle class"));
    }

    private static void print(shape s){
        s.draw();
    }
}
