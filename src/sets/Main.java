package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashSet<Dalmatinec> dogs = new HashSet<>();
        for(int i = 0; i < 40; i++){
            dogs.add(new Dalmatinec("Dog" + i, 130+i));
        }
        Iterator it = dogs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
