package Utilities;

import java.io.UnsupportedEncodingException;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import config.Config;



public class SendEmail {


	/**
	 * [Description("To generate Report via Email ")]
	 * @param filepath
	 * @throws UnsupportedEncodingException
	 */
	public static void EmailReporter(String filepath) throws UnsupportedEncodingException {

		// Recipient's email ID needs to be mentioned.
		String to = Config.readData("Emailer", "receiver");


		// Sender's email ID needs to be mentioned
		String from = Config.readData("Emailer", "sender");
		//String from = "richashrutiricha@gmail.com";

		final String username = Config.readData("Emailer", "sender");;//change accordingly
		final String password = Config.readData("Emailer", "password");;//change accordingly

		// Assuming you are sending email through relay.jangosmtp.net
		String host = "smtp.gmail.com";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "465");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");

		// Get the Session object.
		Session session = Session.getInstance(props,
				new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			// Create a default MimeMessage object.
			Message message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from, "Test Automation Report"));

			// Set To: header field of the header.
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(to));

			String email_CC1=Config.readData("Emailer", "CCRecepient1");
			String email_CC2=Config.readData("Emailer", "CCRecepient2");
			String email_CC3=Config.readData("Emailer", "CCRecepient3");

			message.addRecipients(Message.RecipientType.CC, InternetAddress.parse(email_CC1));
			message.addRecipients(Message.RecipientType.CC, InternetAddress.parse(email_CC2));
			message.addRecipients(Message.RecipientType.CC, InternetAddress.parse(email_CC3));


			// Set Subject: header field
			message.setSubject("TravelStart : Automation Execution Report - "+Random_String.getReportTime());

			// Create the message part
			BodyPart messageBodyPart = new MimeBodyPart();

			// Now set the actual message
			messageBodyPart.setText("Hi,"+"\n\n"+"Please find an automation execution detailed report in attachment."
					+"\n\n\n"+
					"Note :"+
					"\n"+
					"1. For the best view, please download the attached report and open in Chrome/FF/Edge browser."+
					"\n"+
					"2. This is an auto generated email via automation."+
					"\n\n\n"+
					"Thanks");
			// Create a multipar message
			Multipart multipart = new MimeMultipart();

			// Set text message part
			multipart.addBodyPart(messageBodyPart);

			// Part two is attachment
			messageBodyPart = new MimeBodyPart();
			String filename =filepath;
			
			
			DataSource source = new FileDataSource(filename);
		
		
			messageBodyPart.setDataHandler(new DataHandler(source));
		
			
			messageBodyPart.setFileName(filename);
			
			
			multipart.addBodyPart(messageBodyPart);

			// Send the complete message parts
			message.setContent(multipart);

			// Send message
			Transport.send(message);

			System.out.println("Sent message successfully....");

		} 
		
		catch (MessagingException e)
		{

		}
	}
}