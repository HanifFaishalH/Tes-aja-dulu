public class DataFundamentaldanPrimitive {
    public static void main(String[] args){

        // tipe data di java:
        // integer, byte, short, long, double, float, char, boolean

        // integer (satuan)

        int a = 1;
        
        System.out.println("====INTEGER======");
        System.out.println("nilai integer a =" + a);
        System.out.println("nilai integer a = " + (a + 1));
        System.out.println("nilai max = " + Integer.MAX_VALUE); 
        System.out.println("nilai min = " + Integer.MIN_VALUE);
        System.out.println("Ukuran = " + Integer.BYTES); 
        System.out.println("Ukuran Integer = " + Integer.SIZE);

        // byte (satuan)
        byte b = 5;
        System.out.println("====Byte====");
        System.out.println("nilai byte b = " + b);
        System.out.println("nilai byte b = " + (b + 1));
        System.out.println("nilai max = " + Byte.MAX_VALUE + " Bytes"); 
        System.out.println("nilai min = " + Byte.MIN_VALUE + " Bytes");
        System.out.println("nilai max = " + Byte.BYTES); 
        System.out.println("nilai min = " + Byte.SIZE);

        // short
        short c = 15;
        System.out.println("====Short====");
        System.out.println("nilai short c = " + c);
        System.out.println("nilai short c = " + (c + 1));
        System.out.println("nilai max = " + Short.MAX_VALUE + " Bytes"); 
        System.out.println("nilai min = " + Short.MIN_VALUE + " Bytes");
        System.out.println("nilai min = " + Short.BYTES);
        System.out.println("nilai min = " + Short.SIZE);

        // long
        long d = 23;
        System.out.println("====Long====");
        System.out.println("nilai long c = " + d);
        System.out.println("nilai long c = " + (d + 1));
        System.out.println("nilai max = " + Long.MAX_VALUE + " Bytes"); 
        System.out.println("nilai min = " + Long.MIN_VALUE + " Bytes");
        System.out.println("nilai min = " + Long.BYTES);
        System.out.println("nilai min = " + Long.SIZE);
    }
}