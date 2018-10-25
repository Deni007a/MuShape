package shape_factory;

import randoms.*;
import shape.*;

/**
 * создание фигур implements  ICreator
 * @see shape_factory.ICreator
 */
public  class Creator implements ICreator {
    /**
     * рандомизатор
     * @see ShapeRandom
     */
    private static final IShapeRandom shapeRandom = new ShapeRandom();

    /**
     *  создаем фигуры
     */
    @Override
    public  Shape createCircle() {
        return new Circle(shapeRandom.getColorRandom().toString(), shapeRandom.getRandom_Side_length());
    }

    @Override
    public Shape createRectangle() {
        return new Rectangle(shapeRandom.getColorRandom().toString(),
                shapeRandom.getRandom_Side_length(),
                shapeRandom.getRandom_Side_length());
    }

    @Override
    public Shape createTrapezium() {
        return new Trapezium(shapeRandom.getColorRandom().toString(),
                shapeRandom.getRandom_Side_length(),
                shapeRandom.getRandom_Side_length(),
                shapeRandom.getRandom_Side_length());
    }

    @Override
    public Shape createTriangle() {
        return new Triangle(shapeRandom.getColorRandom().toString(),
                shapeRandom.getRandom_Side_length(),
                shapeRandom.getRandom_Side_length());
    }
}
