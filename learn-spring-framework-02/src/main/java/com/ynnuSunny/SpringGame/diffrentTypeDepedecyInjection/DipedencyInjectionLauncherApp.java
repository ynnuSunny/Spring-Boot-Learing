package com.ynnuSunny.SpringGame.diffrentTypeDepedecyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class DipedencyInjectionLauncherApp {

	@Component
	class YourBusinessClass{
		/*Field Injection
			@Autowired
			Dependency1 dependency1;
			@Autowired
			Dependency2 dependency2;
		*/
		
	 /* Setter Injection
	  * 
		Dependency1 dependency1;
		Dependency2 dependency2;
		
		@Autowired
		public void setDependency1(Dependency1 dependency1) {
			this.dependency1 = dependency1;
		}

        @Autowired
		public void setDependency2(Dependency2 dependency2) {
			this.dependency2 = dependency2;
		} */
         
		
		// Constructor based Injection
		// No need to Write @Autowired on the top of the constructor 
		// It's autometically Inject 
		
        Dependency1 dependency1;
        Dependency2 dependency2;
		
		public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
			this.dependency1 = dependency1;
			this.dependency2 = dependency2;
		}


		public String toString() {
			return " YourBusinessClass set "+dependency1.toString()+" and "+dependency2.toString();
		}
	}
	
	@Component
	class Dependency1 {
		
		public String toString() {
			return " Dependecy 1 is Initiate";
		}
	}
	
	@Component
	class Dependency2 {
		public String toString() {
			return " Dependecy 2 is Initiate";
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		var context = new AnnotationConfigApplicationContext(DipedencyInjectionLauncherApp.class);
		
		System.out.println(context.getBean(YourBusinessClass.class));
		
		
		
	}

}
