import java.time.LocalDate;
import java.util.Random;

public class Cat extends PatAnimal implements Comparable<Cat>{

    private int caughtMiceCount = (new Random()).nextInt(this.getAge() * this.getAge() + 1);

    public int getCaughtMiceCount() {

        return this.caughtMiceCount;
    }

    public Cat(String name, LocalDate age) {

        super(name, age);
    }

    public String toString() {
        String var10000 = this.getName();
        return "Cat " + var10000 + " caught " + this.getCaughtMiceCount() + " mice";
    }

    public int compareTo(Cat o) {
        return this.caughtMiceCount - o.caughtMiceCount;
    }

 }
