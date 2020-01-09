package boot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * CommandLineRunner Interface  
 * executing the run() method before the completion of 
 * Spring Boot Application Life Cycle and putting 
 * all the program arguments in an array of String.
 */
import org.springframework.core.annotation.Order;

@SpringBootApplication
@Order(2)
public class CommandLineMain  implements CommandLineRunner
{
	//injecting bean class and properties
@Autowired
    EmpService serv1;

	public static void main(String[] args) 
	{	
		SpringApplication.run(CommandLineMain.class, args);
	System.out.println("Spring Boot Main Loaded!!");
	}

	@Override
	public void run(String... arg1) throws Exception 
	{
		System.out.println("CL Runner Loaded!!");
		if (arg1.length > 0) {
            System.out.println("Program Arguments: "+serv1.getName11
            		(arg1[0].toString()));
        } else {
            System.out.println("Default Arguments(From prop file): "
        +serv1.getName());
        }		
	
	}

}
