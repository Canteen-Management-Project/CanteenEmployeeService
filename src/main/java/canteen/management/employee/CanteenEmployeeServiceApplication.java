package canteen.management.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages="canteen.management.employee")
@ComponentScan(basePackages ="canteen.management.employee")
public class CanteenEmployeeServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CanteenEmployeeServiceApplication.class, args);
	}

}
