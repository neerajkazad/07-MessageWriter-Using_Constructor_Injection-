package com.ci.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.ci.beans.MessageWriter;

public class CITest {
	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new ClassPathResource("com/ci/common/application-context.xml"));
		MessageWriter messageWriter = null;
		messageWriter = factory.getBean("messageWriter", MessageWriter.class);
		messageWriter.writeMessage("Constructor Injection");
	}
}
