package com.seksimus.basicjava.module3.task2;

import java.util.Objects;

/**
 * Дан класс ComplexNumber. Переопределите в нем методы equals() и hashCode() так, чтобы equals() сравнивал экземпляры
 * ComplexNumber по содержимому полей re и im, a hashCode() был бы согласованным с реализацией equals().
 *
 * Реализация hashCode(), возвращающая константу или не учитывающая дробную часть rе и im, засчитана не будет
 */

public final class ComplexNumber {

    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        ComplexNumber other = (ComplexNumber) obj;

        return re == other.re && im == other.im;

    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(re);
        result = 31 * result + Double.hashCode(im);
        return result;
    }
}