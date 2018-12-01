import static java.lang.Math.abs;

public class FDemo {
    private static final String colors[] = { "White", "Blue", "Red", "Green", "Black" };
    public static void main(String[] args) {

        for(int i=0; i < 5; ++i) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(abs(circle.getX()-circle.getY()));
            circle.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}