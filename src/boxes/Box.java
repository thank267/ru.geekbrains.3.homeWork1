package boxes;

import fruits.Fruit;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Box<T extends Fruit> {

    private List<T> fruits = new ArrayList<>();

    private float weigth;

    /**
     * Getter для fruits
     *
     * @return List<T>
     */
    public List<T> getFruits() {
        return fruits;
    }

    /**
     * Getter для weigth
     *
     * @return float
     */
    public float getWeight() {
        return weigth;
    }


    /**
     * Метод очищает коробку с фрутками
     */
    public void clear() {
        fruits.clear();
        weigth=0;
    }

    /**
     * Метод персыпает фрукты из коробки box в текущую коробку
     *
     * @param box
     */
    public void moveFruit(Box<T> box) {
        if (box == this) {
            System.out.println("Пересыпаем коробку саму в себя");
        } else {
            box.getFruits().forEach(fruit -> addFruit(fruit));
            box.clear();
        }
    }

    /**
     *
     * Метод добавляет фрукт в коробку и пересчитывет ее вес
     *
     * @param fruit
     */
    public void addFruit(T fruit) {
        fruits.add(fruit);
        weigth = getFruits().size()*fruit.getWeight();
    }


    /**
     *
     * Метод сравнивает две кообки по весу
     *
     * @param o
     * @return boolean
     */
    public boolean compare(Object o) {
        return equals(o);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Float.compare(box.weigth, weigth) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weigth);
    }


}
