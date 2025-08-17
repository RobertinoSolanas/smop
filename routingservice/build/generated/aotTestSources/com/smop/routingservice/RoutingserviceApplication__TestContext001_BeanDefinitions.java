package com.smop.routingservice;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link RoutingserviceApplication}.
 */
@Generated
public class RoutingserviceApplication__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'routingserviceApplication'.
   */
  public static BeanDefinition getRoutingserviceApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(RoutingserviceApplication.class);
    beanDefinition.setInstanceSupplier(RoutingserviceApplication::new);
    return beanDefinition;
  }
}
