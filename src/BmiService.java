public class BmiService {
    public double calculate(double bmi) {
        if (bmi < 0) {
            bmi = 0;
        }
        return bmi;
    }
}

