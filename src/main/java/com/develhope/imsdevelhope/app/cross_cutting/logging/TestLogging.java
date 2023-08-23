package com.develhope.imsdevelhope.app.cross_cutting.logging;

import com.github.javaparser.utils.Log;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.logging.Logger;

/**
 * a logging aspect of the app.
 * @author kamar baraka.*/

@Aspect
public class TestLogging {

    private final Logger logger = Logger.getGlobal();

    @Around(value = "execution( * com.develhope.imsdevelhope.app.presentation.controllers.TestController.*())")
    public void testLogging(ProceedingJoinPoint joinPoint) throws Throwable{

        logger.info("entering test");

        joinPoint.proceed();

        logger.info("leaving test");
    }
}
