public class DataTypes {

    public static void main (String[] args){
        System.out.print("test");

        // short -32768 32768(16 bit)
        short a = 2;
        short b = 3;
        short c = (short) (a + b);

        // int 32 bit

        // long 64 bit

        // float 32 bit
        float s = 0.2F;
        float f = 0.3F;
        float z = s * f;

        // double для более точных вычислений
        double s1 = 0.2F;
        double f1 = 0.3F;
        double z1 = s1 * f1;

        // char 0   65536 unicode

        char char1 = 74;
        char char2 = 'a';
        char char3 = 118;
        char char4 = 97;
        System.out.println("Char: " + char1 + char2 + char3 + char4);

        int o = 5; // number
        Integer a6 = 120; // link on object

        // byte x = Byte.parseByte("100");
        int x1 = Integer.parseInt("100");
        short x2 = Short.parseShort("100");
        long x3 = Long.parseLong("100");
        double x4 = Double.parseDouble("100.9");
        float x5 = Float.parseFloat("100.9");

        // String
        String str = "STRING";
        String str2 = "STRING";

        String str3 = new String ("STRING");
        String str4 = new String ("STRING");

        System.out.println(str == str2); //true
        System.out.println(str3 == str4); //false
        System.out.println(str3.equals(str4)); // true, сравнение строчек
    }
}
