package hgp.demo.springbatch.batch.annotation;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OrderProcessor {

    String jobName();

    String stepName();

    int order();
}
