package inheritance;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class InheritanceTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(InheritanceContext.class);
		context.registerShutdownHook();
		context.getBean("parentName1", Parent.class).print();
		System.out.println("Parent names: " + Arrays.toString(context.getBeanNamesForType(Parent.class)));
		System.out.println("Child names: " + Arrays.toString(context.getBeanNamesForType(Child.class)));
		context.close();
	}

}
