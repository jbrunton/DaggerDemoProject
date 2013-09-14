package com.jbrunton.daggerdemo;

import java.lang.annotation.Retention;

import javax.inject.Qualifier;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by John on 14/09/2013.
 */
@Qualifier @Retention(RUNTIME)
public @interface ForApplication {
}