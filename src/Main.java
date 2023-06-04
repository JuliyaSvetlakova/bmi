
    public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeters = 1.58f;
        double massKilograms = 59.0f;
        int bmi = (int) service.calculate (massKilograms, heightMeters);

        System.out.println( "Индекс массы тела:" + bmi);
    }
}
