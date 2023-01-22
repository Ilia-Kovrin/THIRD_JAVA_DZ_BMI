public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double mass = 55;          // в килограммах
        double height = 1.65;     // в метрах
        double BMI = service.calculate(mass, height);
        System.out.println("ИМТ = " + BMI + " кг/м^2");
    }
}