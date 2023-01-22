public class BmiService {
    public int calculate(double mass, double height) {
        double BMI = mass / (height * height);
        return (int) BMI;
    }
}


