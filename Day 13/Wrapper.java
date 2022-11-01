import javax.management.ValueExp;

class Wrapper {
    public static void main(String[] args) {

        // primitive
        int a = 5;
        double b = 45.5;
        System.out.println("Primitive a : " + a);
        System.out.println("Primitive b : " + b);

        // as this way of using wrapper classes has been deprecated
        // it will shows some warning

        Integer aObj = new Integer(655);
        System.out.println("Value of aObj Integer: " + aObj);

        Double bObj = new Double(54.4);
        System.out.println("Value of bObj Double: " + bObj);

        // convert primitive type to wrapper objects 
        // using valueOf method

        int c = 654;
        double d = 236.5;
        Integer cInt = Integer.valueOf(c);
        System.out.println("Value of cInt(Integer) : "+ cInt);

        Double dObj = Double.valueOf(d);
        System.out.println("Value of dObj(Double): " + dObj);

        // converting wrapper object to primitive

        Integer eObj = 63;
        Double fObj = 65.54;
        int e = eObj.intValue();
        double f = fObj.doubleValue();
        System.out.println("Value Of e: "+ e);
        System.out.println("Value Of f: "+ f);

    }
}