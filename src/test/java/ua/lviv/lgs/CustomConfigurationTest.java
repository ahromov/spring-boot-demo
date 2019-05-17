package ua.lviv.lgs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ua.lviv.lgs.model.BaseBean;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {
        CustomConfiguration.class,
        BaseBean.class
})
class CustomConfigurationTest {

    @Autowired
    private CustomConfiguration customConfiguration;

    @Test
    void getBean() {
        Object baseBean = customConfiguration.getBean("baseBean");
        Assertions.assertTrue(baseBean instanceof BaseBean);
    }
}