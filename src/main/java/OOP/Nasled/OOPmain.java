package OOP.Nasled;

import OOP.AnimalDog;
import OOP.Dog;
import OOP.HomeCat;
import OOP.RoboDog;

import java.util.ArrayList;
import java.util.List;

public class OOPmain {

    public static void main(String[] args) {

        Cat cat1 = new Cat();


        //        Cat cat2 = new Cat(10);
        Cat.mur();

        HomeCat homeCat = new HomeCat("Kot");

        homeCat.sleep();
        System.out.println(homeCat.hashCode());

//        Dog dog1 = new AnimalDog();
//        Dog dog2 = new RoboDog();
//        dog1.gav(10);
//        dog2.gav(2);
//
//        List<String> some = new ArrayList<>();


    }

}
