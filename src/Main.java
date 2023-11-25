import java.io.PrintStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public Main (){

    }
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>(List.of(new Cat("Myrsik", LocalDate.of(2004, 10, 24)), new Cat("Tima", LocalDate.of(2010, 12, 1))));
        Collections.sort(cats, new AnimalByAgeComparator(Order.ASCENDING));
        Iterator arr1 = cats.iterator();

        while(arr1.hasNext()) {
            Cat cat = (Cat)arr1.next();
            System.out.println(cat);
        }
        List<Dog> dogs = new ArrayList(List.of(new Dog("Muhtar", LocalDate.of(2020, 10, 24)), new Dog("Tuchka", LocalDate.of(2012, 10, 11))));
        Collections.sort(dogs, new AnimalByAgeComparator(Order.DESCENDING));
        Iterator arr2 = dogs.iterator();

        while(arr2.hasNext()) {
            Dog dog = (Dog)arr2.next();
            System.out.println(dog);
        }

        List<PatAnimal> rancho = new ArrayList();
        rancho.addAll(cats);
        rancho.addAll(dogs);
        rancho.sort(new AnimalByAgeComparator(Order.DESCENDING));
        Iterator ranch = rancho.iterator();

        while(ranch.hasNext()) {
            PatAnimal animal = (PatAnimal)ranch.next();
            PrintStream print= System.out;
            String var10001 = animal.getName();
            print.println(var10001 + " " + animal.getAge() + " years");
        }

    }




}

