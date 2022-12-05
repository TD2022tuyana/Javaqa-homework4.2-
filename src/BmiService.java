public class BmiService {
    public double calculate(double weight, double height){

        double h = height * height;
        return weight / h;
    }
}

