import org.example.entity.Pet;
import org.example.enums.Species;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PetTest {

    @Test
    public void petToString_Test(){
        String[] habits = new String[2];
        habits[0] = "walking";
        habits[1] = "eating";

        Pet pet = new Pet(Species.CAT, "mestan", 2, 48, habits);

        Assertions.assertEquals("cat{nickname='mestan', age=2, trickLevel=48, habits=[walking, eating]}", pet.toString());
    }

    @Test
    public void petRespond_Test(){
        String[] habits = new String[2];
        habits[0] = "walking";
        habits[1] = "eating";

        Pet pet = new Pet(Species.CAT, "mestan", 2, 48, habits);

        Assertions.assertEquals("Hello, owner. I am - mestan. I miss you!", pet.respond());
    }

    @Test
    public void petEatAndFoul_Test(){
        String[] habits = new String[2];
        habits[0] = "walking";
        habits[1] = "eating";

        Pet pet = new Pet(Species.CAT, "mestan", 2, 48, habits);

        Assertions.assertEquals("I am eating", pet.eat());
        Assertions.assertEquals("I need to cover up", pet.foul());
    }

    @Test
    public void petTrickLevel_WhenLessThan1_ThenSetNegativeOne(){
        String[] habits = new String[2];
        habits[0] = "walking";
        habits[1] = "eating";

        Pet pet = new Pet(Species.CAT, "mestan", 2, -34, habits);

        Assertions.assertEquals(-1, pet.getTrickLevel());
    }

    @Test
    public void petEquals_Test(){
        Pet pet1 = new Pet(Species.CAT, "mestan", 2, 12, null);
        Pet pet2 = new Pet(Species.CAT, "mestan", 2, 12, null);

//        Assertions.assertEquals(true, pet1.equals(pet2));
        Assertions.assertTrue(pet1.equals(pet2));
    }
}
