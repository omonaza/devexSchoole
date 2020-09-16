package com.school.javacore.oop;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RationalTest {

    Rational r = new Rational();

    @Test
    public void testEmptyConstructor(){
            assertThat(r.getNumerator(), is(equalTo(0)));
            assertThat(r.getDenominator(), is(equalTo(1)));
    }

    @Test
    public void testSetters(){
        r.setNumerator(3);
        r.setDenominator(5);
        assertThat(r.getNumerator(), is(equalTo(3)));
        assertThat(r.getDenominator(), is(equalTo(5)));
    }

    @Test
    public void testToString(){
        r.setNumerator(3);
        r.setDenominator(5);
        assertThat(r.toString(), is(containsString(r.getNumerator() + " / "+r.getDenominator())));
    }

    @Test
    public void testNegate(){
        Rational r2 = new Rational(3,4);
        r2.negate();
        assertThat(r2.toString(), is(containsString("-")));

        r2.setNumerator(5);
        r2.setDenominator(-9);
        r2.negate();

        assertThat(r2.toString(), is(not(containsString("-"))));

    }

    @Test
    public void testGetSign(){
        Rational r3 = new Rational(4,5);
        assertThat(r3.getSign(), is(1));

        r3.setDenominator(-7);
        assertThat(r3.getSign(), is(-1));

        r3.setDenominator(7);
        r3.setNumerator(-5);
        assertThat(r3.getSign(), is(-1));

        r3.setDenominator(-7);
        r3.setNumerator(-5);
        assertThat(r3.getSign(), is(1));

    }

}