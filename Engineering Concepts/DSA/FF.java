public class FF {


    public static double forecast(double cV, double[] gR, int k) {
        if (k == 0) {
            return cV;
        }
        double pV = forecast(cV, gR, k - 1);
        return pV * (1 + gR[k - 1]);
    }


    public static double forecastTail(double cV, double[] gR, int index) {
        if (index == gR.length) {
            return cV;
        }
        return forecastTail(cV * (1 + gR[index]), gR, index + 1);
    }

    public static double forecastIterative(double cV, double[] gR) {
        for (double rate : gR) {
            cV *= (1 + rate);
        }
        return cV;
    }

    public static void main(String[] args) {
        double[] gR = {0.08, 0.06, 0.07};
        double cV = 1_000_000;

        
        double futureValue = forecast(cV, gR, gR.length);
        System.out.println("Future value (recursive): " + futureValue);

        
        double futureValueTail = forecastTail(cV, gR, 0);
        System.out.println("Future value (tail-recursive): " + futureValueTail);

        double futureValueIter = forecastIterative(cV, gR);
        System.out.println("Future value (iterative): " + futureValueIter);
    }
}
