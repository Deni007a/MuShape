package shape_factory;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;
import randoms.*;
import shape.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ShapeFactoryTest {


    private static final IShapeRandom shapeRandom = new ShapeRandom();
    private  static final ICreator creator = new Creator();


    @Test
    void createShape() {
        Shape shape = null;
        List<Shape> shapes = new ArrayList<>();
        assertNotNull(shapeRandom);
        assertNotNull(creator);
        assertNull(shape);
        assertEquals(0, shapes.size());
    }



}