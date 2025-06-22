public class TestBuilder {
    public static void main(String[] args) {
        Computer basicComputer = new Computer.Builder("Intel i3", 8)
                                    .setStorage(256)
                                    .build();

        System.out.println(basicComputer);
    }
}
