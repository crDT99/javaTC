import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            String[] strNums = br.readLine().split(" ");
            int initCharge = Integer.parseInt(strNums[0]);
            int finalcharge = Integer.parseInt(strNums[1]);
            int out_ = chargingSmartPhone(initCharge, finalcharge);
            System.out.println(out_);
            wr.close();
            br.close();
        }
    }
    static int chargingSmartPhone(int initCharge, int finalCharge) {
        long[] Li = {0, 11, 231, 560, 1010, 5001, 10001};
        long[] Ls = {10, 230, 559, 1009, 5000, 10000, 1000000000};
        int[] R = {10, 5, 8, 2, 7, 8, 3};
        int S = 0;
        int T = 0;
        for (int i = 6; i >= 0; i--) {
            if (initCharge <= Ls[i]) {
                S = i;
            }
            if (finalCharge <= Ls[i]) {
                T = i;
            }
        }
        out.println(S+"a"+T);

        int Q = 0;
        int C = initCharge;
        for (int i = S; i <= T; i++) {
            int ciclos;
            if (i == T) {
                out.println("s");
                ciclos = (int) Math.ceil((float)(finalCharge - C) / R[i]);
                out.println("asdassadasd "+ finalCharge);
                out.println("ciclo "+ciclos);
            } else {
                ciclos = (int) Math.ceil((float)(Ls[i] + 1 - C) / R[i]);
            }
            out.println("Carga actual "+ C);

            Q += ciclos;
            C += R[i] * ciclos;

        }
        return Q;
    }
}