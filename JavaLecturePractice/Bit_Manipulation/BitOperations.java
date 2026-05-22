
public class BitOperations {

    public static int getIthBit(int n, int i) {
        // Pta lga rhe hai ki nth position pr 1 hai ya 0
        // Here we check the (nth)position of Binary form of any value, for that we need
        // & bitwise AND operator,
        // & ko comparison ko compare krne ke liye 2 value ki binary form chaiye
        // 1 ki binary form lenge or usme left shift use krnge us position tak, jis
        // position ki value hame pta karni hai (nth) number
        // ki binary form me

        // Let 10 ki binary form ki 3 value pta karni hai toh 1 ki binary form ki << 3
        // time krenge
        // Then & compare krega ki 10 ki binary form me 1 aaya hai ya 0, OR 1 ki binary
        // form me toh 1 3rd position par shift ho gya hai
        // shuru se lekr 3 position pr jayga check krega same value hai toh 1 return
        // hoga nhi toh 0, esse pta lag jayga 0 hai ya 1, 10 ki
        // (nth) position par
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;

        } else {
            return 1;
        }

    }

    // SETTING ith BIT Below

    // 16392 8196 4096 2048 1024 512 25 128 64 32 16 8 4 2 1
    // 10 0 0 0 0 1 0 1 0
    // <<1

    public static int setIthBit(int n, int i) { // 10 ki binary form me 2nd index pr 1 set krne ke liye

        int bitMask = 1 << i;
        return n | bitMask;
    }

    // Clearing ith Value
    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i); // Using Binary 1's Complement( 0 ko 1 and 1 ko 0 kar deta hai )
        return n & bitMask; // & will compare binary form of n & bitmask
    }

    // Updating the ith Value

    public static int updateIthBit(int n /* jis number pr operation h */, int i /* jis position pr hoga */,
            int x /* vha kya new aana hai */) {
        if (x == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }

    }

    public static int clearLastIthBit(int n, int i) {
        int bitMask = (-1 << i); // -1 ka matlab hai 1111111111111111111111111111111111111111111111111111 32 baar
                                 // esme << krke 0 lga lete hai
        return n & bitMask;

    }

    public static boolean isPowerOfTwo(int n) {
        // let number is 8(1000) and (n(8) -1 = 7) so 7 ki binary form(0111) applying
        // Bitwise(&) for 8 and 7 binary form, if result == 0, then n is the power of 2.
        return (n & (n - 1)) == 0;
    }

    public static void main(String args[]) {

        System.out.println(getIthBit(10, 2)); // Pta kar rhe hai ki 0 hai ya 1 binary form ki given position par
        System.out.println(setIthBit(10, 2)); // given position par 1 set krna hai
        System.out.println(clearIthBit(15, 2)); // Given position par 0 karna hai
        System.out.println(updateIthBit(10, 2, 0));
        System.out.println(clearLastIthBit(15, 2));
        System.out.println(isPowerOfTwo(14));

    }
}
