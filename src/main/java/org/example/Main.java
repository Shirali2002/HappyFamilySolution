package org.example;

import org.example.entity.Human;
import org.example.entity.Pet;
import org.example.enums.Species;

public class Main {
    public static void main(String[] args) {
        // family 1
        Human father1 = new Human("Samir", "Aliyev", 1970);
        father1.setIq(78);

        Human mother1 = new Human("Samire", "Aliyeva", 1972);
        mother1.setIq(82);

        Human child1 = new Human("Semra", "Aliyev", 2000, mother1, father1);

//        System.out.println(child1.toString());


        // family 2
        String[] habits = new String[2];
        habits[0] = "walking";
        habits[1] = "eating";

        Pet pet2 = new Pet(Species.CAT, "mestan", 2, 48, habits);

        Human father2 = new Human("Samir", "Aliyev", 1970);
        father2.setIq(78);

        Human mother2 = new Human("Samire", "Aliyeva", 1972);
        mother2.setIq(82);

        Human child21 = new Human("Kerim", "Aliyev", 2000, 56, pet2, mother2, father2, null);

        String[][] child22Schedule = new String[7][2];
        child22Schedule[0][0] = "monday";
        child22Schedule[0][1] = "walking";

        child22Schedule[1][0] = "tuesday";
        child22Schedule[1][1] = "eating";

        child22Schedule[2][0] = "wednesday";
        child22Schedule[2][1] = "teaching";

        child22Schedule[3][0] = "thursday";
        child22Schedule[3][1] = "learning";

        child22Schedule[4][0] = "friday";
        child22Schedule[4][1] = "coding";

        child22Schedule[5][0] = "saturday";
        child22Schedule[5][1] = "resting";

        child22Schedule[6][0] = "sunday";
        child22Schedule[6][1] = "traveling";

        Human child22 = new Human("Elmir", "Aliyev", 2002, 65, pet2, mother2, father2, child22Schedule);

        System.out.println(child21);
        System.out.println(child22);

        System.out.println(child22.describePet());
        System.out.println(child22.greetPet());

        System.out.println(pet2.eat());
        System.out.println(pet2.foul());
        System.out.println(pet2.respond());
    }
}