package com;

import com.github.tobato.fastdfs.FdfsClientConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.Import;
import org.springframework.jmx.support.RegistrationPolicy;

/**
 * @author: create QiangShW
 * @version: v1.0
 * @description: com
 * @date:2019/6/26
 **/
@Import(FdfsClientConfig.class)
@EnableMBeanExport(registration = RegistrationPolicy.IGNORE_EXISTING)
@SpringBootApplication
public class PayApp {
    public static void main(String[] args) {
		System.out.println("���");
        SpringApplication.run(PayApp.class, args);
    }
}
