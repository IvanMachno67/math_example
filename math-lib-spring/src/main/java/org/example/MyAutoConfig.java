package org.example;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

/**
 * Configuration class for auto-configuring beans within the application context.
 *
 * This class is annotated with {@code @AutoConfiguration}, which indicates that
 * it provides Spring beans that should be automatically configured when the
 * application starts. The beans defined in this class are intended to be
 * available in the Spring Application Context and can be injected wherever
 * needed.
 */
@AutoConfiguration
public class MyAutoConfig {

    /**
     * Creates a new instance of {@link MathBean}.
     *
     * This method defines a Spring bean that will be registered in the
     * application context. The bean is named {@code myService}, and it returns
     * an instance of {@link MathBean}, which can be injected into other Spring
     * components.
     *
     * @return a new instance of {@link MathBean}.
     */
    @Bean
    public MathBean myService() {
        return new MathBean();
    }
}
