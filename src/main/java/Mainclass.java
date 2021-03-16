import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double muxMod = 0;
        double minMod = 0;
        List<Vector> list = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            double z = scanner.nextDouble();
            Vector newVector = new Vector(x, y, z);
            list.add(newVector);
            if (list.size() == 1) {
                minMod = list.get(0).getMod();
            } else {
                if (minMod >= newVector.getMod()) {
                    minMod = newVector.getMod();
                }
                if (muxMod <= newVector.getMod()) {
                    muxMod = newVector.getMod();
                }
            }
        }
        int q = scanner.nextInt();
        for (int j = 0; j < q; j++) {
            int op = scanner.nextInt();
            if (op == 1) {
                int index1 = scanner.nextInt();
                int index2 = scanner.nextInt();
                Vector v1 = list.get(index1 - 1);
                Vector v2 = list.get(index2 - 1);
                Vector v3 = v1.addVector(v1, v2);
                list.add(v3);
                if (minMod >= v3.getMod()) {
                    minMod = v3.getMod();
                }
                if (muxMod <= v3.getMod()) {
                    muxMod = v3.getMod();
                }
                v3.printVector();
            } else if (op == 2) {
                int index1 = scanner.nextInt();
                int index2 = scanner.nextInt();
                Vector v1 = list.get(index1 - 1);
                Vector v2 = list.get(index2 - 1);
                Vector v3 = v1.subVector(v1, v2);
                list.add(v3);
                if (minMod >= v3.getMod()) {
                    minMod = v3.getMod();
                }
                if (muxMod <= v3.getMod()) {
                    muxMod = v3.getMod();
                }
                v3.printVector();
            } else if (op == 3) {
                int index1 = scanner.nextInt();
                int index2 = scanner.nextInt();
                Vector v1 = list.get(index1 - 1);
                Vector v2 = list.get(index2 - 1);
                System.out.println(v1.dotMult(v1, v2));
            } else if (op == 4) {
                int index1 = scanner.nextInt();
                int index2 = scanner.nextInt();
                Vector v1 = list.get(index1 - 1);
                Vector v2 = list.get(index2 - 1);
                Vector v3 = v1.crossMult(v1, v2);
                list.add(v3);
                if (minMod >= v3.getMod()) {
                    minMod = v3.getMod();
                }
                if (muxMod <= v3.getMod()) {
                    muxMod = v3.getMod();
                }
                v3.printVector();
            } else if (op == 5) {
                System.out.println(muxMod);
            } else if (op == 6) {
                System.out.println(minMod);
            }
        }

    }
}
