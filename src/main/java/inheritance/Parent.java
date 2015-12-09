package inheritance;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Parent {

	@Bean(name = {"parentName1", "parentName2"})
	public Parent additionalParentNames() {
		return new Parent();
	}

	public void print() {
		System.out.println("Print from parent.");
	}

}
