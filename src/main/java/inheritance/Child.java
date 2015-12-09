package inheritance;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Child extends Parent {

	@Bean(name = {"childName1", "childName2"})
	public Child additionalChildNames() {
		return new Child();
	}

	@Override
	public void print() {
		System.out.println("Print from child.");
	}

}
