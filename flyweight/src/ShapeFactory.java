import java.util.HashMap;
import java.util.Map;

public final class ShapeFactory {

    private final Map<String, Circle> circleMap;

    public ShapeFactory() {
        circleMap = new HashMap<>();
    }

    public Shape getCircle(String color) {
        Circle circle = circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }

        return circle;
    }

}
