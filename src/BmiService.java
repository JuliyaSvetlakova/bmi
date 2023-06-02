public class BmiService {
    public int calculate(int massKilograms,int heightCentimeters) {
        int resultHeight = (heightCentimeters * heightCentimeters);
        int resultMass = (massKilograms * 10000);
        int result = (resultMass /resultHeight);
        return result;
    }
}
