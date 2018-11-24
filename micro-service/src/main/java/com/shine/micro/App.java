package com.shine.micro;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
@EnableAspectJAutoProxy
@Slf4j
public class App 
{
    public static void main( String[] args )
    {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:spring/spring-context.xml");

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
