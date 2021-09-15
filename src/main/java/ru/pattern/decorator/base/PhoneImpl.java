package ru.pattern.decorator.base;

/**
 * Реализация телефона
 */
public class PhoneImpl implements Phone {

    @Override
    public String use() {
        return "call";
    }

}
