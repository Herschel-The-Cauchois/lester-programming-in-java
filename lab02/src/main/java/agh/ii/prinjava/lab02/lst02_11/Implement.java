package agh.ii.prinjava.lab02.lst02_11;

@FunctionalInterface
interface void2int {
    int v2i();
}

@FunctionalInterface
interface int2void {
    void i2v(int val);
}

@FunctionalInterface
interface int2int {
    int i2i(int val);
}

@FunctionalInterface
interface tuple2void {
    void t2v(int v1, int v2);
}

public class Implement {
    int test =1 ;

    public Implement (){

    }

    static public void interfacator() {
        void2int int1 = new void2int() {
            @Override
            public int v2i() {
                return 0;
            }
        };
        int2void int2 = (val) -> {
            System.out.println("val: " + val);
        };
        int2int int3 = (val) -> {
            return val + 2*val;
        };
        tuple2void int4 = (v1, v2) -> {
            System.out.println("v1: " + v1 + " v2: " + v2);
        };
        System.out.println("Test 1: " + int1.v2i());
        int2.i2v(5);
        System.out.println("Test 3: " + int3.i2i(3));
        int4.t2v(3, 2);
    }
}
