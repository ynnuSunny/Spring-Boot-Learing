package com.ynnuSunny.example.annotation;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //Default component are Singleton 
           //One bean Create in IOC container
class SingletonClass{
	
}
@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//Every Initialization new bean Create in IOC container
class PrototypeClass{
	
}



@Configuration
@ComponentScan
public class BeanScope {
    
	public static void main(String...strings) {
		var context = new AnnotationConfigApplicationContext(BeanScope.class);
		System.out.println(context.getBean(SingletonClass.class));
		System.out.println(context.getBean(SingletonClass.class));
		System.out.println(context.getBean(SingletonClass.class));
		System.out.println(context.getBean(PrototypeClass.class));
		System.out.println(context.getBean(PrototypeClass.class));
		System.out.println(context.getBean(SingletonClass.class));
	}
	
	
}
