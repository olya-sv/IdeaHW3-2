public class BmiService {
    double weigth = 98;
    double height = 1.87;

    public double calculate(double result) {
        double index = weigth / (height * height);
        return index;
    }
}
