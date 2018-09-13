package com.zccoder.demo.spring.conditional.plugin.support;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 标题：开启RedisMQ<br>
 * 描述：当使用此注解时，会自动注册RedisMQ生产者<br>
 * 时间：2018/06/28<br>
 *
 * @author zc
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(RedismqConfiguration.class)
@Documented
public @interface EnableRedismq {



}
