public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double meter = 1.87;
        double kilogram = 98;
        int bmi = service.calculate(meter, kilogram);
        System.out.println(bmi);
    }
}