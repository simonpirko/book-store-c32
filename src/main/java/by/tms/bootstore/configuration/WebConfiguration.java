package by.tms.bootstore.configuration;

import org.apache.commons.dbcp2.BasicDataSource;
import org.postgresql.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;

@ComponentScan(basePackages = "by.tms.bootstore")
@Configuration
@EnableWebMvc
public class WebConfiguration extends WebMvcConfigurationSupport {


    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/pages/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(){
        return new JdbcTemplate(dataSource());
    }

    @Bean
    public DataSource dataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2).build();
//                .addScript("classpath:jdbc/schema.sql")
//                .addScript("classpath:jdbc/test-data.sql").build();
    }

//    @Bean
//    public DataSource dataSource(){
//        BasicDataSource basicDataSource = new BasicDataSource();
//        basicDataSource.setUrl("");
//        basicDataSource.setUsername("");
//        basicDataSource.setPassword("");
//        basicDataSource.setDriver(new Driver());
//        basicDataSource.setInitialSize(15);
//        return basicDataSource;
//    }
}
