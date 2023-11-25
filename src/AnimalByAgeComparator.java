
import java.util.Comparator;

public class AnimalByAgeComparator implements Comparator<PatAnimal> {
    private Order order;

    public AnimalByAgeComparator(Order order) {

        this.order = order;
    }

    public int compare(PatAnimal patAnimal1, PatAnimal patAnimal2) {
        if (this.order == Order.ASCENDING) {
            return Integer.compare(patAnimal1.getAge(), patAnimal2.getAge());
        } else {
            return this.order == Order.DESCENDING ? Integer.compare(patAnimal2.getAge(), patAnimal1.getAge()) : 0;
        }
    }
    //повернути зворотний компоратор -зворотній порядок сортування ..
    public Comparator<PatAnimal> reversed() {
        return Comparator.super.reversed();
    }
}

