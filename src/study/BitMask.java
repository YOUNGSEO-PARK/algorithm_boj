package study;

import java.io.IOException;

public class BitMask {
    public static void main(String[] args) throws IOException {
        System.out.println("[getBit]");
        // 1 0 0 1  ->  1
        System.out.println(getBit(9, 3));
        // 0 1 0 1  ->  0
        System.out.println(getBit(5, 3));

        System.out.println("[setBit]");
        // 0 1 0 1  ->  1 1 0 1
        System.out.println(setBit(5, 3));

        System.out.println("[clearBit]");
        // 1 0 0 1  ->  0 0 0 1
        System.out.println(clearBit(9, 3));

        System.out.println("[clearLeftBits]");
        // 1 0 1 0 1 0 0 1  ->  0 0 0 0 0 0 0 1
        System.out.println(clearLeftBits(169, 3));

        System.out.println("[clearRightBits]");
        // 1 0 1 0 1 0 0 1  ->  1 0 1 0 0 0 0 0
        System.out.println(clearRightBits(169, 3));

        System.out.println("[updateBit]");
        // 1 0 1 0 1 0 0 1  ->  1 0 1 0 0 0 0 1
        System.out.println(updateBit(169, 3, false));
    }

    public static boolean getBit(int num, int i) {
        // 1 이면 true, 0 이면 false
        return (num & (1 << i)) != 0;
    }

    public static int setBit(int num, int i) {
        return num | (1 << i);
    }

    public static int clearBit(int num, int i) {
        return num & ~(1 << i);
    }

    public static int clearLeftBits(int num, int i) {
        // NOT 연산을 하게 되면 해당 인덱스를 포함한 왼쪽의 비트들이 모두 1이 되므로 x
        // shift 후에 1을 빼주는 연산으로 해당 자리수 이하의(오른쪽) 비트만 모두 1로 바꾼다.
        return num & ((1 << i) - 1);
    }

    public static int clearRightBits(int num, int i) {
        // -1은 모든 비트가 1
        // 인덱스를 포함하는 오른쪽 비트들을 0으로 바꾸기 위해서 i + 1 만큼 LeftShift
        return num & -1 << (i + 1);
    }

    public static int updateBit(int num, int i, boolean val) {
        return (num & ~(1 << i)) | ((val ? 1 : 0) << i);
    }
}