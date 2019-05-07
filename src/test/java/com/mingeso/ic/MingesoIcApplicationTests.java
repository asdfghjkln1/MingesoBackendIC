package com.mingeso.ic;

import com.mingeso.ic.services.ProductServiceTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@Suite.SuiteClasses({
        ProductServiceTest.class
})
@SpringBootTest
@ActiveProfiles("test")
@SpringBootApplication(scanBasePackages="com.mingeso.ic")
@ComponentScan("com.mingeso.ic.repository")
public class MingesoIcApplicationTests {

    @Test
    public void contextLoads() {
    }

}