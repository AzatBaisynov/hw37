package list;

public class Cat {
    private int catsNumber;

    public Cat(int catsNumber) {
        this.catsNumber = catsNumber;
    }

    public int getCatsNumber() {
        return catsNumber;
    }

    public void setCatsNumber(int catsNumber) {
        this.catsNumber = catsNumber;
    }

    @Override
    public String toString(){
        return "Cat " + catsNumber;
    }
}
