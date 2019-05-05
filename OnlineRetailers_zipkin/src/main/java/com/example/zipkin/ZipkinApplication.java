package com.example.zipkin;

import com.example.zipkin.ctrl.IndexCtrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableEurekaClient
//@EnableZipkinServer
@EnableFeignClients
public class ZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class, args);
    }

}
@Component
class InitProject implements ApplicationRunner {
    private static final Logger LOG = LoggerFactory.getLogger(InitProject.class);

    @Autowired
    IndexCtrl indexCtrl;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        for (int i = 0; i <1000 ; i++) {
            indexCtrl.index();
        }
        LOG.info("==========init project===========");
    }
}

