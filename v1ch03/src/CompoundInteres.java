/**
 * @author tonychen
 * @date 2023/4/15 17:59
 */
public class CompoundInteres {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        // set interest rates to 10 ... 15%
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++) {
            interestRate[j] = (STARTRATE + j) / 100.0;
        }

        double[][] balances = new double[NYEARS][NRATES];

        // set initial balances to 10000
        for (int j = 0; j < balances[0].length; j++) {
            balances[0][j] = 10000;
        }

        // compute interest in future years
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                // get last year's balances for previous row
                double oldBalance = balances[i - 1][j];

                // compute interest
                double interest = oldBalance * interestRate[j];

                // compute this year's balances
                balances[i][j] = oldBalance + interest;
            }
        }
    }
}
