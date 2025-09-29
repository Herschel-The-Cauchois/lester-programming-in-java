# 2nd Lab Answers

---

## Exercise 1

2) Constants allows usually for programmers to keep certain useful values, such as pi for mathematicians, at a handy space for easy reuse without modification.
3) Final turns local variables into constants, and instance variables into constants at the level of an object. It goes for the whole class at the class level. At the level of methods, however, it prevents overriding by a superclass, and a final class will not allow inheritance in any shape or form.
4) a) No, because the types of some fields might be mutable objects. b) Yes, because there is really no way to change the data inside.
5) It is not immutable because the getter yields a reference to the inside array, allowing modification by the user.

## Exercise 2

EnumBasedSingleton follows correctly the singleton pattern, because the enum ensures that there is only one member, the INSTANCE, that can be accessed. It is thread safe because it doesn't need external states or ressources to work, so it can be used by multiprocessing units. However, it is not immutable, because there is a setter method.

## Exercise 3

2) A nested class at its most bare expression is a class inside another class. There is a static member class, who can be accessed from the outside without creating an object of the outer class. A classic non static member class needs to be interacted with from a created object from the outer class. A Local Class is declared inside a block of code belonging to the outer class, and can only be accessed from this block, which is often a method. It has access however to all members of the enclosing class. An anonymous class is similar in funcitoning, differentiated by the fact that it doesn't have a name.
3) a) No, because its definition is strictly bound by the outer class. You'd need to pass by the outer class first to use it. b) Yes, it defines if the outer class and its instances can access or not the inner class.

## Exercise 4

2) An Interface first and foremost specifies a list of abstract method to be implemented by a class. An abstract class can combine concrete and abstract methods, as well as concrete and abstract data fields. A class can also implement multiple interfaces, but only inherit from a class. Everything in an interface must be public, and all its variables are public, static and final.
3) There are public and abstract methods, and public, static and final variables.
4) D and E are correctly defined abstract classes. The requirements are that any class having an abstract method must have the keyword abstract before their name, but abstract classes aren't necessarily obligated to have an abstract method in the compilation.
5) A and D are the correct choice, because all methods are implicitly defined as abstract and public. No need to add the abstract keyword before declaration !
6) It refers to an instance of B as both an instance of A and C. This is true, because the objects of a class implementing an interface are also considered objects of the type "Implemented Interface", like in the case of inheritance !

## Exercise 5

2) Functional interfaces are a prerequisite necessary to realise lambda expressions. After all, they use those interfaces to create an object, each time allowing to define a new lambda function to do certain procedures.
3) See :

```package agh.ii.prinjava.lab02.lst02_11;

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
```