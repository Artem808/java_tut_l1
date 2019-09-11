public class task_2 {
    public static void main(String[] args){
        int myInt = 0;
        double myDouble = myInt;
        myInt = (int) myDouble;
        System.out.println(myDouble);

         double myDouble_1 = 3.0;
         int myInt_1 = (int) myDouble;
         myDouble_1 = myInt_1;
         System.out.println(myInt_1);

        int i = 35;
        String str = Integer.toString(i);
        System.out.println(str);

        String stringNumber = String.valueOf(i);
        System.out.println(stringNumber);

        int x = 280;
        byte b = (byte) x;
        System.out.println(b);

        int w = 3;
        int z = 2;
        int sum = w/z;
        System.out.println(sum);

        double o = 3.0;
        double u = 5.0;
        double num = o / u;
        System.out.println(num);

        System.out.println("2 << 4 = " + (2<<4));
        System.out.println("16 >> 4 = " + (16>>4));

    }
}
