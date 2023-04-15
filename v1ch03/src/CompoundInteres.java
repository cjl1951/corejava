/**
 * @author tonychen
 * @date 2023/4/15 17:59
 */
public class CompoundInteres {
    public static void main(String[] args) {
        final double STARTRATE = 0;
        final int NRATES = 10;
        final int NYEARS = 30;

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

        // print one row of interest rates
        for (int j = 0; j < interestRate.length; j++) {
            System.out.printf("%9.0f%%", 100 * interestRate[j]);
        }
        System.out.println();
        // print balance table
        for (double[] row : balances) {
            // print table row
            for (double balance : row) {
                System.out.printf("%10.2f", balance);
            }
            System.out.println();
        }
    }
}
