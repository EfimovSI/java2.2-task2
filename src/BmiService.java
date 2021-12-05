public class BmiService {
    public double calculate (double bodyMassKg, double heightMetres) {
        double bmi = bodyMassKg / (heightMetres * heightMetres);

        return bmi;
    }
}
