public class BmiService {
    public int calculate(double meter, double kilogram) {
        int bmi;
        bmi = (int) (kilogram / (meter * meter));
        return bmi;
    }
}
