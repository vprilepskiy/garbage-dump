package ru.pattern.decorator;

import ru.pattern.decorator.base.Phone;

/**
 * Декоратор телефона.
 * Выполняет реализацию методов объекта переданного в конструктор.
 * Может быть наследован расширяемым классом.
 */
public abstract class PhoneDecorator implements Phone {

    private final Phone phone;

    public PhoneDecorator(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String use() {
        return phone.use();
    }
}
