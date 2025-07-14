package by.logisticbp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.DependsOn;

@SpringBootApplication
@EnableFeignClients
@RefreshScope
@DependsOn("eurekaAutoServiceRegistration")
public class LogisticBpApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogisticBpApplication.class, args);
	}

//	@Bean
//	public ConsumerFactory<String, String> consumerFactory() {
//		Map<String, Object> props = new HashMap<>();
//		props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9093");
//		props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//		props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//		return new DefaultKafkaConsumerFactory<>(props);
//	}
//
//	@Bean
//	public ConcurrentKafkaListenerContainerFactory<String, String> kafkaListenerContainerFactory() {
//		ConcurrentKafkaListenerContainerFactory<String, String> factory =
//				new ConcurrentKafkaListenerContainerFactory<>();
//		factory.setConsumerFactory(consumerFactory());
//		return factory;
//	}
}
