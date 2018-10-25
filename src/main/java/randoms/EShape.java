package randoms;

import java.util.*;

/**
 *в enum  даны типы фигур
 *  так же   метод  randomLetter()  возвращает случайный цвет
 */

public enum EShape {

    CIRCLE,
    RECTANGLE,
    TRAPEZIUM,
    TRIANGLE;


    private static final List<EShape> eShapes =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = eShapes.size();
    private static final Random RANDOM = new Random();

    /**
     *  метод  возвращает случайную фигуру
     * @return EShape
     */
    public static EShape randomLetter()  {
        return eShapes.get(RANDOM.nextInt(SIZE));
    }

}
