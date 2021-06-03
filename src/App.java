import boxes.Box;
import fruits.Apple;
import fruits.Orange;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        // Задание 1
        Object[] tmpArray = changeElements();

        // Задание 2
        List<Object> tmpList = getListFromArray(tmpArray);

        //Задание 3
        //Создаем коробку с апельсинами и складываем апельсины
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());

        //Создаем коробку с яблоками и складываем яблоки
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());

        //вес яблок 5, вес апельсин 6, коробки не равны
        System.out.println("вес яблок 5, вес апельсин 6, коробки не равны задание 3");
        System.out.println(appleBox.compare(orangeBox));

        appleBox.addFruit(new Apple());
        //вес яблок 6, вес апельсин 6,  коробки равны
        System.out.println("вес яблок 6, вес апельсин 6, коробки равны задание 3");
        System.out.println(appleBox.compare(orangeBox));

        appleBox.addFruit(new Apple());
        //вес яблок 7, вес апельсин 6, коробки не равны
        System.out.println("вес яблок 7, вес апельсин 6, коробки не равны задание 3");
        System.out.println(appleBox.compare(orangeBox));

        // Создаем вторую коробку с апельсинами и складываем в нее апельсины
        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());

        // Пробуем пересывать коробку саму в себя
        System.out.println("Пробуем пересывать коробку саму в себя");
        System.out.println("Вес коробки до пересыпания");
        System.out.println(orangeBox.getWeight());
        orangeBox.moveFruit(orangeBox);
        System.out.println("Вес коробки после пересыпания");
        System.out.println(orangeBox.getWeight());

        // Пересыпаем апельсины из коробки orangeBox2 в коробку orangeBox
        System.out.println("Пересыпаем апельсины из коробки orangeBox2 в коробку orangeBox");
        System.out.println("Вес коробки orangeBox до пересыпания");
        System.out.println(orangeBox.getWeight());
        System.out.println("Вес коробки orangeBox2 до пересыпания");
        System.out.println(orangeBox2.getWeight());
        orangeBox.moveFruit(orangeBox2);
        System.out.println("Вес коробки orangeBox после пересыпания");
        System.out.println(orangeBox.getWeight());
        System.out.println("Вес коробки orangeBox2 после пересыпания");
        System.out.println(orangeBox2.getWeight());



    }

    /**
     * Задание 2<br>
     * Метод конвертирует массив объектов в List объектов
     *
     * @param array
     * @return List<Object>
     */
    private static List<Object> getListFromArray(Object[] array) {

        List<Object> tmpList = Arrays.asList(array);
        System.out.println("Конвертированный лист из массива задание 2");
        System.out.println(tmpList);
        return tmpList;

    }

    /**
     * Задание 1<br>
     * Метод создает массив объектов и меняет второй и третий элемент местами
     *
     * @return Object[]
     */
    public static Object[] changeElements() {

        Object[] tmpArray = new Object[] {10, "Str", 1L, 1.1};
        System.out.println("Начальный массив задание 1");
        System.out.println(Arrays.toString(tmpArray));

        // меняем второй и третий элемент
        Object tmp = tmpArray[1];
        tmpArray[1] = tmpArray[2];
        tmpArray[2] = tmp;

        System.out.println("Массив после перестановки задание 1");
        System.out.println(Arrays.toString(tmpArray));

        return tmpArray;



    }

}
