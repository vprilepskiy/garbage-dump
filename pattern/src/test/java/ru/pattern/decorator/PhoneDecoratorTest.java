package ru.pattern.decorator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.pattern.decorator.base.PhoneImpl;
import ru.pattern.decorator.extended.PhoneAndroid;
import ru.pattern.decorator.extended.PhoneApple;

class PhoneDecoratorTest {

    @Test
    void phoneAndroidTest() {
        var phoneAndroid = new PhoneAndroid(new PhoneImpl());
        Assertions.assertEquals(phoneAndroid.use(), "call, and use PlayMarket");
    }

    @Test
    void phoneAppleTest() {
        var phoneApple = new PhoneApple(new PhoneImpl());
        Assertions.assertEquals(phoneApple.use(), "call, and use AppStore");
    }
}