package UTIL;

import javax.swing.JOptionPane;

public class Verification {

    public boolean VerificateMetric(String Input) {
        double Metric;
        try {
            Metric = Double.parseDouble(Input);
            return true;
        } catch (Exception exception) {
            return false;

        }
    }

    public double VerficateMinimumSupport(String Input) {
        while (true) {
            if (VerificateMetric(Input)) {
                if (Double.parseDouble(Input) > 0 && Double.parseDouble(Input) < 101) {
                    return Double.parseDouble(Input);
                } else {
                    return -1;
                }
            } else {
                return -1;
            }
        }
    }

}
