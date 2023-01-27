package exmpl;


import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Stream;

public class Class1 implements FFF{

    static void method(ArrayList<? extends Class3> list) {
    }
    public static void main(String[] args) {

    }

    @Override
    public void nothing() {

    }
}

class Class2 extends Class1{

}

class Class3 extends Class2{

}

class Class4 extends Class3{

}