package pl.justynababinska.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pl.justynababinska.beans.Producer.ProducerType;

@Component
public class MessagePrinter {

	private MessageProducer producer;

	MessagePrinter() {
	}

	@Autowired
	public MessagePrinter(@Producer(type = ProducerType.FILE) MessageProducer producer) {
		this.producer = producer;
	}

	public void print() {
		System.out.println(producer.getMessage());
	}
}