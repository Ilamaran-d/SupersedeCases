package pvinsoft.employee.details.config;

import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
@ComponentScan(basePackages = "pvinsoft.employee")
public class WebConfig {

	@Bean(name = "webServerFactory")
	public ServletWebServerFactory webServerFactory() {
		
		TomcatServletWebServerFactory tomcatServletFactory = new TomcatServletWebServerFactory();
		tomcatServletFactory.addConnectorCustomizers((TomcatConnectorCustomizer) connector -> connector.setProperty("relaxedQueryChars", "[]{}"));
		return tomcatServletFactory;
		
	}
}
