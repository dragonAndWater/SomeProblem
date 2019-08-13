package sendMQ;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.jms.Destination;
import javax.jms.JMSConsumer;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.JMSProducer;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import com.ibm.msg.client.jms.JmsConnectionFactory;
import com.ibm.msg.client.jms.JmsFactoryFactory;
import com.ibm.msg.client.wmq.WMQConstants;

/**
 * A minimal and simple application for Point-to-point messaging.
 *
 * Application makes use of fixed literals, any customisations will require
 * re-compilation of this source file. Application assumes that the named queue
 * is empty prior to a run.
 *
 * Notes:
 *
 * API type: JMS API (v2.0, simplified domain)
 *
 * Messaging domain: Point-to-point
 *
 * Provider type: IBM MQ
 *
 * Connection mode: Client connection
 *
 * JNDI in use: No
 *
 */
public class JmsPutGet {

	// System exit status value (assume unset value to be 1)
	private static int status = 1;

	// Create variables for the connection to MQ
	private static final String HOST = "127.0.0.1"; // Host name or IP address
	private static final int PORT = 1414; // Listener port for your queue manager
	private static final String CHANNEL = "CHNL"; // Channel name
	private static final String QMGR = "TEST"; // Queue manager name
	private static final String APP_USER = "KAYAK"; // User name that application uses to connect to MQ
	private static final String APP_PASSWORD = "**kk"; // Password that the application uses to connect to MQ
	private static final String QUEUE_NAME = "QUEUE_NAME1"; // Queue that the application uses to put and get messages to and from


	/**
	 * Main method
	 *
	 * @param args
	 */
	public static void main(String[] args) {

		// Variables
		JMSContext context = null;// AutoCloseable
		Destination destination = null;
		JMSProducer producer = null;
		JMSConsumer consumer = null;


		File inputFile = new File("C:/Users/KAYAK/Desktop/ibps312.xml");
		String xml = null;
		try (FileInputStream fi = new FileInputStream(inputFile);
			BufferedReader is = new BufferedReader(new InputStreamReader(fi, "UTF-8"));){
			String c= null;
			StringBuilder sb = new StringBuilder();
			while( (c= is.readLine()) != null){
				sb.append(c);
			}
		  xml = sb.toString();
		} catch (IOException e) {
			e.printStackTrace();
		} 

		try {
			// Create a connection factory
			JmsFactoryFactory ff = JmsFactoryFactory.getInstance(WMQConstants.WMQ_PROVIDER);
			JmsConnectionFactory cf = ff.createConnectionFactory();

			// Set the properties
			cf.setStringProperty(WMQConstants.WMQ_HOST_NAME, HOST);
			cf.setIntProperty(WMQConstants.WMQ_PORT, PORT);
			cf.setStringProperty(WMQConstants.WMQ_CHANNEL, CHANNEL);
			cf.setIntProperty(WMQConstants.WMQ_CONNECTION_MODE, WMQConstants.WMQ_CM_CLIENT);// 客户端模式（网络访问）
//			cf.setIntProperty(WMQConstants.WMQ_CONNECTION_MODE, WMQConstants.WMQ_CM_BINDINGS);// binding 模（适用于MQ安装在本地，直接进行进程间通信）
			cf.setStringProperty(WMQConstants.WMQ_QUEUE_MANAGER, QMGR);
			cf.setStringProperty(WMQConstants.WMQ_APPLICATIONNAME, "user");
			cf.setBooleanProperty(WMQConstants.USER_AUTHENTICATION_MQCSP, true);
			cf.setStringProperty(WMQConstants.USERID, APP_USER);
			cf.setStringProperty(WMQConstants.PASSWORD, APP_PASSWORD);

			// Create JMS objects
			context = cf.createContext();
			destination = context.createQueue("queue:///" + QUEUE_NAME);

//			long uniqueNumber = System.currentTimeMillis() % 1000;
//			TextMessage message = context.createTextMessage("Your lucky number today is " + uniqueNumber);

			long uniqueNumber = System.currentTimeMillis() % 1000;
			producer = context.createProducer();
			System.out.print(xml);
			producer.send(destination, context.createTextMessage(xml));

//			consumer = context.createConsumer(destination); // autoclosable
////			String receivedMessage = consumer.receiveBody(String.class, 15000); // in ms or 15 seconds
//			consumer.setMessageListener(new MessageListener() {
//				
//				@Override
//				public void onMessage(Message message) {
//					TextMessage msg = (TextMessage)message;
//					System.out.println("\nReceived message:\n" + msg);
//					
//				}
//			});

//			int a =0;
//			while(a<10){
//				try {
//					Thread.sleep(10000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}

//			recordSuccess();
		} catch (JMSException jmsex) {
			recordFailure(jmsex);
		}

		System.exit(status);

	} // end main()

	/**
	 * Record this run as successful.
	 */
	private static void recordSuccess() {
		System.out.println("SUCCESS");
		status = 0;
		return;
	}

	/**
	 * Record this run as failure.
	 *
	 * @param ex
	 */
	private static void recordFailure(Exception ex) {
		if (ex != null) {
			if (ex instanceof JMSException) {
				processJMSException((JMSException) ex);
			} else {
				System.out.println(ex);
			}
		}
		System.out.println("FAILURE");
		status = -1;
		return;
	}

	/**
	 * Process a JMSException and any associated inner exceptions.
	 *
	 * @param jmsex
	 */
	private static void processJMSException(JMSException jmsex) {
		System.out.println(jmsex);
		Throwable innerException = jmsex.getLinkedException();
		if (innerException != null) {
			System.out.println("Inner exception(s):");
		}
		while (innerException != null) {
			System.out.println(innerException);
			innerException = innerException.getCause();
		}
		return;
	}

}
