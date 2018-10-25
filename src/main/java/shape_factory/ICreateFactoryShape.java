package shape_factory;

import shape.Shape;

import java.util.List;

/**
 * return  List созданных фигур
 */

public interface ICreateFactoryShape {
    List<Shape> createShape();
}
