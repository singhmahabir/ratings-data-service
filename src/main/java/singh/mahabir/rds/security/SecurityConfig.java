/**
 *
 */
package singh.mahabir.rds.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * If you want to call Post and Put rest end point even after passing basic-auth
 * This WebSecurityConfigurerAdapter class is mandatory
 *
 * @author Mahabir Singh
 *
 */
@EnableWebSecurity
//@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
	http.csrf().disable();
    }
}
