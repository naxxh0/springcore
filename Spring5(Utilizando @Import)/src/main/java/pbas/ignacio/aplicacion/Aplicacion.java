package pbas.ignacio.aplicacion;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import pbas.ignacio.cliente.Cliente;

import pbas.ignacio.datasourceBean.Configuracion.DataSourceConfig;

@Import(DataSourceConfig.class)
@Configuration
public class Aplicacion {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Aplicacion.class);
		 context.getBean(Cliente.class).mostrarDato();
		
		
			((ConfigurableApplicationContext) context).close();
	}
	
	@Bean
	Cliente clienteBean() {
		return new Cliente();
		
	}
	
	



}
