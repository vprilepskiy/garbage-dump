package ru.pattern.decorator.extended;

import ru.pattern.decorator.PhoneDecorator;
import ru.pattern.decorator.base.Phone;

public class PhoneAndroid extends PhoneDecorator {

    public PhoneAndroid(Phone phone) {
        super(phone);
    }

    @Override
    public String use() {
        return super.use() + ", and use PlayMarket";
    }
}
