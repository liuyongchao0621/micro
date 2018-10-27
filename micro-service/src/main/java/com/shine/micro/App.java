package com.shine.micro;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
@Slf4j
public class App 
{
    public static void main( String[] args )
    {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");

        context.start();

        log.info("*********dubbo服务已启动***********");
        try{
           System.in.read();
        }catch(Exception e){
            log.error("dubbo server error!",e);
            context.stop();
        }

    }
}
