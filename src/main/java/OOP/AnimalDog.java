package OOP;

public class AnimalDog implements Dog, Eda {

    @Override
    public void gav(int timeGav) {

        for (int i = 0; i <timeGav ; i++) {

            System.out.println("Gav");

        }

    }

    @Override
    public void cook() {
        System.out.println("Ya shaurma!");
    }
}
