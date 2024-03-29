package fr.pinguet62.embeddedelasticsearch;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Target(TYPE)
public @interface EmbeddedElasticsearchType {

    String name();

    /**
     * @see org.springframework.core.io.ResourceLoader#getResource(String)
     */
    String definition();

}
