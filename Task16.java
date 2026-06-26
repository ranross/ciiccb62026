
interface Animal {
    boolean feed(boolean timeToEat);
    void groom();
    void pet();
}

class Gorilla implements Animal {

    @Override
    public boolean feed(boolean timeToEat) {
        // put gorilla food into cage
        if (timeToEat) {
            System.out.println("The gorilla has been fed.");
            return true;
        } else {
            System.out.println("It is not feeding time.");
            return false;
        }
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("The gorilla is being groomed.");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("You carefully try to pet the gorilla.");
    }
}

// Main class
public class Task16 {
    public static void main(String[] args) {

        Gorilla gorilla = new Gorilla();

        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();
    }
}