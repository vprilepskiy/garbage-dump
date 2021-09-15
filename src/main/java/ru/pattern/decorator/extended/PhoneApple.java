package ru.pattern.decorator.extended;

import ru.pattern.decorator.PhoneDecorator;
import ru.pattern.decorator.base.Phone;

public class PhoneApple extends PhoneDecorator {

    public PhoneApple(Phone phone) {
        super(phone);
    }

    @Override
    public String use() {
        return super.use() + ", and use AppStore";
    }
}
