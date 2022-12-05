public class Main {
    public static void main(String [] args){
        BmiService service = new BmiService();
        double bmi =  service.calculate(54.0, 1.70);
        System.out.printf("BMI = %.2f%n", bmi);

        System.out.println();
        System.out.println(service.calculate(60.0, 1.75));

        System.out.println();
        System.out.println(service.calculate(65.0, 1.78));

        System.out.println();
        System.out.println(service.calculate(70.0, 1.75));

        System.out.println("Недовес : меньше чем 18,5");
        System.out.println("Нормальный вес: между 18,5 и 24,9");
        System.out.println("Избыточный вес: между 25 и 29,9");
        System.out.println("Ожирение: 30 или больше");
    }
}

