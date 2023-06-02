
    public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int heightCentimeters = 158;
        int massKilograms = 58;
        int bmi = service.calculate(massKilograms, heightCentimeters);

        System.out.println( "Индекс массы тела:" + bmi);
    }
}
