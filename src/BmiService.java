public class BmiService {
    public double calculate(double massKilograms,double heightMeters) {
        double result = (massKilograms / (heightMeters * heightMeters));
        return result;
    }
}
