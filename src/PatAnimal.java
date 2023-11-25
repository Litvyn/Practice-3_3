
import java.time.LocalDate;
public class PatAnimal {
    private String name ;
    private LocalDate yearOfBirth;

    public  PatAnimal(String name , LocalDate year){
        this.name=name;
        this.yearOfBirth= year;
    }
    public int getAge()
    {
        return LocalDate.now().getYear() - this.yearOfBirth.getYear();
    }
    public String getName(){
        return this.name;
    }
    public void sleep(){

    }
    public void makeSound(){

    }
}
