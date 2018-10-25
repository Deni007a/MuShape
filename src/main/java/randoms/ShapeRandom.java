package randoms;

import java.util.Random;

public class ShapeRandom implements IShapeRandom {
    /**
     * минимальное количество фигур
     */
    static final int MIN_SHARE_RANDOM = 1;
    /**
     * максимальное количество фигур
     */
    static final int MAX_SHARE_RANDOM  = 10;
    /**
     *  минимальное количество длины стороны
     */
    static  final int MIN_RANDOM_SIDE_LENGTH = 1;
    /**
     * максимальное количество длины стороны
     */
    static  final int MAX_RANDOM_SIDE_LENGTH = 1;

    /**метод  возвращает случайный цвет
     * @see IShapeRandom
     * @return  enum  цвета
     */

    @Override
    public EColor getColorRandom() {
        return  EColor.randomLetter();
    }
    /**
     * метод  возвращает случайную фигуру
     * @see IShapeRandom
     * @return enum  цвета
     */
    @Override
    public EShape getShareRandom() {
        return EShape.randomLetter();
    }
    /**
     *метод  возвращает случайное количество фигур
     * @return  int  фигур
     */
    @Override
    public int getNambertShareRandom() {
        return MIN_SHARE_RANDOM+(int)(Math.random()*MAX_SHARE_RANDOM);
    }

    /**
     * метод  возвращает случайную длинну фигуры
     * @return double  длина стороны фигуры
     */
    @Override
    public double getRandom_Side_length() {
       return MIN_RANDOM_SIDE_LENGTH+(int)(Math.random()*MAX_SHARE_RANDOM);
    }

}
