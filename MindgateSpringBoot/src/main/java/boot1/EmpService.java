package boot1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmpService 
{
	//@Value annotation is used to 
	//read the environment or application property
	 @Value("${name}")
String name;
	 
public String getName() {
	return getName11(name);
}
public String getName11(String n) {
    return "Hello " + n;
}
}
