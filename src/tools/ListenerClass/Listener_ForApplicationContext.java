package tools.ListenerClass;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@WebListener()
public class Listener_ForApplicationContext implements ServletContextListener {
	
	public static ApplicationContext context;
	
    @Override
    public void contextInitialized(ServletContextEvent sce) {
    	context = new ClassPathXmlApplicationContext("beans-config.xml");
    }
 
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

}