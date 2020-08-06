package ph.mobile.training.extra;

public class Casting {

    public static void main (String[] args){
        // item 1
        byte b;
        int i = 355;
        double d = 423.150;
        //cast to byte
        byte c = (byte) i;
        byte e = (byte) d;
        System.out.println("int to byte: "+ c);
        System.out.println("double to byte: "+ e);
        // item 2
        //cast to long
        int l = 100;
        long l1 = l;
        System.out.println("int to long:"+ l1);
        // cast to float
        float l2 = l;
        System.out.println("int to float:"+ l2);
        // item 3
        String a = "true";
        Boolean a1 = Boolean.parseBoolean(a);
        System.out.println("String to boolean:"+ a1);
        //item 4
        double dd = 123;
        String dd1 = String.valueOf(dd);
        System.out.println("Double to String:"+ dd1);
    }

}
