package br.com.contmatic.infrastructure.persistence.hibernate.configuration;

import java.net.URISyntaxException;
import java.net.URL;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.hibernate.cfg.Configuration;

import br.com.caelum.vraptor.ioc.ApplicationScoped;
import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;
import br.com.contmatic.domain.model.phone.Phone;
import br.com.contmatic.domain.model.phone.favorite.FavoritePhone;
import br.com.contmatic.domain.model.requirement.Requirement;
import br.com.contmatic.domain.model.user.User;

@Component
@ApplicationScoped
public class ConfigurationCreator implements ComponentFactory<Configuration> {

	private static Logger LOGGER = Logger.getLogger(ConfigurationCreator.class);
	private Configuration cfg;

	public ConfigurationCreator() {
		cfg = new Configuration();
	}

	/**
	 * 
	 * @throws URISyntaxException
	 */
	@PostConstruct
	public void create() throws URISyntaxException {
		configureHibernateEntities();
		configureHerokuAccess();
		cfg.getProperties().setProperty("hibernate.hbm2ddl.auto", "");
	}

	protected URL getHibernateCfgLocation() {
		return getClass().getResource("/hibernate.cfg.xml");
	}

	private void configureHerokuAccess() throws URISyntaxException {		
		cfg.setProperty("hibernate.connection.url",      "jdbc:postgresql://ec2-54-83-194-117.compute-1.amazonaws.com:5432/dd7ctk6bo5lct0?ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory" );
		cfg.setProperty("hibernate.connection.username", "tchdgctxwswwzl");
		cfg.setProperty("hibernate.connection.password", "USN7-b10MjKTNTVDUwkt7cGOCw");
	}
	
	private void configureHibernateEntities() {
		LOGGER.info("Configuring Hibernate Entities:");
		cfg.addAnnotatedClass(Phone.class);
		cfg.addAnnotatedClass(FavoritePhone.class);
		cfg.addAnnotatedClass(Requirement.class);
		cfg.addAnnotatedClass(User.class);
	}

	@Override
	public Configuration getInstance() {
		return cfg;
	}
}
