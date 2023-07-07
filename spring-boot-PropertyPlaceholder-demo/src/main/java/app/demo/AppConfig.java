package app.demo;

//import javax.sql.DataSource;
//import org.apache.commons.dbcp.BasicDataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;

@Configuration
// @PropertySource("classpath:myApp.properties")

@PropertySource ("file:${app_home}/myApp.properties")

public class AppConfig {

	@Autowired
	Environment env;

	 @Value("${myApp.url}")
	 private String myAppUrl;

//	 @Value("${jdbc.url}")
//	 private String jdbcURL;

	@Value("${myApp.username}")
	 private String myAppusername;
	 @Value("${myApp.password}")
	 private String myApppassword;	



//     @Bean
//	 public DataSource getDataSource() {
//	    BasicDataSource dataSource = new BasicDataSource();
//	    dataSource.setDriverClassName(driverClassName);
//	    dataSource.setUrl(jdbcURL);
//	    dataSource.setUsername(username);
//	    dataSource.setPassword(password);
//	    return dataSource;
//	 }
	 
//	 @Bean
//	 public VillageDAO villageDAO(DataSource dataSource) {
//		return new VillageDAO(dataSource);
//	 }
	 
	 @Bean
	 public void dataProcess () {
			System.out.println("*********************************");
						
			System.out.println("from Environment = " + env.getProperty("app.home"));
			
			System.out.println("*********************************");


			System.out.println(myAppUrl + "\n" + myAppusername + "\n" + myApppassword);
		//		return new DataProcess();
	 }


	@Bean
	 public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	 }	 
 }
