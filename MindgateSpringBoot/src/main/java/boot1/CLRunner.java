package boot1;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class CLRunner implements CommandLineRunner 
{

	@Override
	public void run(String... arg0) throws Exception
	{
		Log logger = LogFactory.getLog(getClass());
		logger.info("I Spring Boot Application Started !!");	
	logger.warn("W Spring Boot Application Started !!");
	}

}
