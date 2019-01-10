package pl.justynababinska.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import pl.justynababinska.beans.Producer.ProducerType;

@Component
@Producer(type = ProducerType.SIMPLE)
public class SimpleMessageProducer implements MessageProducer {

	@Autowired
	@Qualifier("randomNumber")
	private int random;

	public String getMessage() {
		return "Simple Message: " + this + " " + random;
	}
}