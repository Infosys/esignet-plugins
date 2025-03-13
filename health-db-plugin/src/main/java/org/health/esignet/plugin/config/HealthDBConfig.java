package org.health.esignet.plugin.config;

import org.springframework.context.annotation.Configuration;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class HealthDBConfig {
    @Value("${org.health.esignet.plugin.db-url}")
    private String dbURL;

    @Value("${org.health.esignet.plugin.db-username}")
    private String dbUsername;

    @Value("${org.health.esignet.plugin.db-password}")
    private String dbPassword;

    public DataSource dataSource() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        hikariDataSource.setJdbcUrl(dbURL);
        hikariDataSource.setUsername(dbUsername);
        hikariDataSource.setPassword(dbPassword);
        hikariDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        return hikariDataSource;
    }

    @Bean("healthPluginJdbcTemplate")
    public JdbcTemplate healthPluginJdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }
}
