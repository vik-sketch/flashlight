/*        TIPS:- Use maven project so that u can add jars easily
 * 				 We will use commons email jar, selenium-java, junit,testNg,etc added few jars in pom.xml file go n see it
 */
package vikash.EmailSendingProject;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;    //("baby.mrh@gmail.com", "8804009096")
import org.apache.commons.mail.SimpleEmail;

public class HowToSendEmailAfterTestExecution {

	public static void main(String[] args) throws EmailException {
		
	System.out.println("=======Test Started=======");
	
	sendEmail();
	
	System.out.println("=======Email sent=======");

	}

	public static void sendEmail() throws EmailException {
	Email email = new SimpleEmail();
	email.setHostName("smtp.googlemail.com");// from which server i have to trigger the email (it's gmail server)
	email.setSmtpPort(465);   // smtp port for gmail is 465 given by gmail, FOR YOUR COMPANY SERVER PORT _ ASK TO UR IT TEAM
	email.setAuthenticator(new DefaultAuthenticator("vikash7044@gmail.com", "electronics_2013")); // mail sender account
	email.setSSLOnConnect(true);
	email.setFrom("vikash7044@gmail.com");//who is sending the email (should be same as DefaultAuthenticator) 
	email.setSubject("Selenium Test Report");
	email.setMsg("This is a test mail from selenium :-)");
	email.addTo("k.vikash09viet@gmail.com"); // to whom u want to send mail (mail recepient)
	email.send();
	}   // if you are getting this exception -  javax.mail.AuthenticationFailedException then you need to do this (see below)
}  // open gmail > click on profile icon > manage your google account > security > ENABLE THE LESS SECURE APP ACCESS
