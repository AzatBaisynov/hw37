package sets;

public class Dalmatinec extends AbstractDog {
    public Dalmatinec(String name, Integer weight) {
        super(name, weight);
    }

    @Override
    public String toString(){
        return "My name is " + super.getName() + "" +
                "\nmy weight is " + super.getWeight();
    }
}
