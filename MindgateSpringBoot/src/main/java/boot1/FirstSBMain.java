package boot1;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import boot2.Sample1;

@SpringBootApplication//entry point
@ComponentScan(basePackages = {"boot1","boot2"})
public class FirstSBMain 
{
	public static void main(String[] args)
	{
		ApplicationContext ctx11 = SpringApplication.run(FirstSBMain.class, args);
	
	      FirstBoot object1 = ctx11.getBean(FirstBoot.class);
	      object1.display();


	      Sample1 object2 = ctx11.getBean(Sample1.class);
	      object2.display1();
  
	      EmployeeJDBC empOBJ = ctx11.getBean(EmployeeJDBC.class);

	      System.out.println("JDBC Insertion:::");
	      Scanner s1=new Scanner(System.in);
	      System.out.println("EmpNo: ");
	      int a=s1.nextInt();
	      System.out.println("EmpName: ");
	      String b=s1.next();
	      System.out.println("EmpSalary: ");
	      float c=s1.nextFloat();

	  	EmployeeBean p1=new EmployeeBean();
		p1.setEno(a);
		p1.setName(b);
		p1.setSalary(c);

		empOBJ.insertEmployee(p1);

	      empOBJ.getAllEmployees();
	
	  	StudentConf team1 = ctx11.getBean(StudentConf.class);
		System.out.println("--- College ---");
		System.out.println(team1);

	}
/*
	@Bean
	public ViewResolver getViewResolver()
	{
	InternalResourceViewResolver resolver=new InternalResourceViewResolver();
	resolver.setPrefix("/WEB-INF/myjsps/");
	resolver.setSuffix(".jsp");
	resolver.setViewClass(JstlView.class);
	return resolver;

	}
*/
}
