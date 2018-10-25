package randoms;

/**
 *интрефес  для гененирующих случайных значений
 */

 public interface IShapeRandom {

     /**
      * метод  возвращает случайный цвет
      * @return значени enum  цвета
      */
     EColor  getColorRandom();
     /**
      * метод  возвращает случайную фигуру
      * @return значени enum  фигуры
      */
     EShape getShareRandom();
     /**
      * метод  возвращает случайное количество фигур
      * @return  int   фигур
      */
     int getNambertShareRandom();
     /**
      * метод  возвращает случайную длинну фигуры
      * @return double  длина стороны
      */
     double getRandom_Side_length();
}
