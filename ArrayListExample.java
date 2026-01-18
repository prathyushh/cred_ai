import java.util.*;
public class ArrayListExample {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Audi");

        cars.set(3,"Tesla");
        cars.remove(1);
        Collections.sort(cars);
        for(int i =0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }
        cars.clear();
    }
}
