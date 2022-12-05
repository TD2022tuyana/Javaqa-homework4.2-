public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService ();
        int weight = 54;
        double height = 170;
        double bmi = service.calculate(weight / (height * height));
        System.out.println(bmi);

        System.out.println("Недовес : меньше чем 18,5");
        System.out.println("Нормальный вес: между 18,5 и 24,9");
        System.out.println("Избыточный вес: между 25 и 29,9");
        System.out.println("Ожирение: 30 или больше");
    }
}
