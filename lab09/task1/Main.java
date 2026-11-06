public class Main {
    public static void main(String[] args) {
        Box b = new Box();
        System.out.println("Width: " + b.width);
    }
}

class Box {
    int width;

    Box() {
        width = 10;
    }
}
