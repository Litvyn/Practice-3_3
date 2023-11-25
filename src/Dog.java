import java.time.LocalDate;
import java.util.Random;
    public class Dog extends PatAnimal implements Comparable<Dog> {
        private int scaredOfThievesCount = (new Random()).nextInt(this.getAge() * this.getAge() + 1);

        public int getScaredOfThievesCount() {

            return this.scaredOfThievesCount;
        }

        public Dog(String name, LocalDate age) {
            super(name, age);
            this.scaredOfThievesCount = (new Random()).nextInt(this.getAge() * this.getAge() + 1);
        }

        public String toString() {
            String names = this.getName();
            return "Dog " + names + " scared of " + this.getScaredOfThievesCount() + " thieves";
        }

        public int compareTo(Dog o)
        {
            return this.scaredOfThievesCount - o.scaredOfThievesCount;
        }
    }

