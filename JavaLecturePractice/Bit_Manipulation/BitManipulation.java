
public class BitManipulation {
    public static void main(String args[]) {

        // Binary AND ( & ) Sb shi toh shi toh 1, agr ek bhi galat toh sb galat
        System.out.println(5 & 1);

        // BINARY OR ( | ) Agr Sab galat h to hi galat hoga, agr ek bhi shi hai toh 1
        System.out.println(5 | 3);

        // BINARY XOR ( ^ ) Agar dono bits alag hai toh 1; agr dono same hai toh 0.
        System.out.println(5 ^ 5); // ------>
        System.out.println(15 ^ 10);

        // Binary 1's Complement ka matlab kisi bhi binary number ki har bit ko palat
        // dena, 0 ko 1 aur 1 ko 0.
        // Ese Bitwise Not (~) operator bhi kehte hein.
        System.out.println(~5);

        // Binary left Shift Operator ( 5 << 1) eska matlab hai 5 ki binary form ko 1,
        // baar shift karna hai [0000 0101] ko [0000 1010] krdega.
        System.out.println(5 << 1);


        //Binary Right Shift operator moves the bits of a number to the right by a specified number of positions.
        System.out.println(20 >> 2); //2 ka matlab hai 2 positions shift hoga, 20 ke binary me 

    }
}
