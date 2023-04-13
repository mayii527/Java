package org.mayii.java8.lambda;

import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        Predicate<Integer> test = num -> num > 10;
        boolean r = test.test(7);
        System.out.println("r = " + r);

        Predicate<String> test2 = role -> role.equals("ROLE:ADMIN");
        System.out.println(test2.test("ROLE.USER"));
    }
}
