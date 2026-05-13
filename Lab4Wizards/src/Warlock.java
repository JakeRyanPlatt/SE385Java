public class Warlock extends Mage {
    @Override
    public void catchPhrase() {
        System.out.println("My patron grants me unimaginable power!");
    }

    @Override
    public void attack() {
        System.out.println("The Warlock drains your life force with Eldritch Blast!");
    }
}