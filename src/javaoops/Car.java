package javaoops;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Car {
    public String brand;
    public void get(){
        System.out.println("this is car class");
    }
}
class Features extends Car {
    public String colour;

    public static void main(String[] args) throws Exception {
        Features ftt = new Features();
        ftt.brand = "Audi";
        ftt.get();
        ftt.colour = "black";
        System.out.println(ftt.colour);
        System.out.println(ftt.brand);

        ArrayList<String> cars = new ArrayList<String>();
        HashMap<String, Integer> pA = new HashMap<String, Integer>();
        pA.put("Vasu", 24);
        pA.put("friend", 23);
        pA.put("friend", 25);
        System.out.println(pA.get("friend"));
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Iterator<String> it = cars.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        try {
            int arr[] = {1, 2};
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[6]);
        } catch (Exception r) {
            System.out.println("Ayiyooo pocha");
        } finally {
            System.out.println("sare le po po");
        }

        if(cars.get(0)=="Volvo"){
            throw new Exception("yedhava enti ra idhi");
        }
    }


}
