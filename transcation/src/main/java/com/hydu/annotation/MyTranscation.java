package com.hydu.annotation;

import java.lang.annotation.*;

/**
 * Created on 2020/6/1 @author heyong
 */

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface MyTranscation {
}
