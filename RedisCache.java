package com.sf.skss.co.dcn.redis;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 * 缓存注解
 * @author sfit0401
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface RedisCache {

	String prefix();// 缓存前缀标识 如：prefix=APIConst.STORE_CACHE

	int expiration() default 60 * 60 * 2;// 缓存有效期  以秒为单位 ——默认2小时

}
