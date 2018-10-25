package shape_factory;


import randoms.*;
import shape.*;

import java.util.*;

/**
 *   создем список фигур
 * @see shape_factory.ICreateFactoryShape
 * @see shape_factory.IShow_All
 */

public class ShapeFactory implements ICreateFactoryShape, IShow_All {


    private static final IShapeRandom shapeRandom = new ShapeRandom();
    private  static final ICreator creator = new Creator();


    public List<Shape> createShape() {
        Shape shape = null;
        List<Shape> shapes = new ArrayList<>();
        for (int i = 0; i < shapeRandom.getNambertShareRandom(); i++) {
            String shape_string = shapeRandom.getShareRandom().toString();

            switch (shape_string) {
                case "CIRCLE":
                    shapes.add( creator.createCircle() );
                    break;
                case "RECTANGLE":
                    shapes.add( creator.createRectangle() );
                    break;
                case "TRAPEZIUM":
                    shapes.add( creator.createTrapezium() );
                    break;
                case "TRIANGLE":
                    shapes.add( creator.createTriangle() );
                    break;
                default:
                    System.out.println("There is no such type of figure!!");
            }
        }
       return Collections.unmodifiableList(shapes);

    }

    @Override
    public void show_all() {
        new ShapeFactory().createShape().forEach(x->x.drav());
    }
}
