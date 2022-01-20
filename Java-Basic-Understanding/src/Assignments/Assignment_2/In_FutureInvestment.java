package Assignments.Assignment_2;
//Future Investment Value
// FV = PV  * (1 + I / 100)t
public class In_FutureInvestment {
    public static void main(String[] args) {
        float PV = 10000F;
        float IR = 1F;
        float T = 10f;
        double FV = (float) (PV * (Math.pow((1 + IR/100), T)));
        System.out.println("Future Value is: "+FV);

    }
}
