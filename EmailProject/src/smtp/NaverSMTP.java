package smtp;

import java.util.Map;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class NaverSMTP {
	private final Properties server_info; // ���� ����
	private final Authenticator auth; // ���� ����

	public NaverSMTP() {
		// ���̹� SMTP ���� ���� ����
		server_info = new Properties();
		server_info.put("mail.smtp.host", "smtp.naver.com");
		server_info.put("mail.smtp.port", "465");
		server_info.put("mail.smtp.starttls.enable", "true");
		server_info.put("mail.smtp.auth", "true");
		server_info.put("mail.smtp.debug", "true");
		server_info.put("mail.smtp.socketFactory.port", "465");
		server_info.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		server_info.put("mail.smtp.socketFactory.fallback", "false");

		// ����� ���� ����
		auth = new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("���̵�", "���");
			}
		};
	}

	// �־��� ���� ������ ���̹� SMTP ������ ���� �����մϴ�.
	public void email_sending(Map<String, String> _mail_info) throws MessagingException {
		// 1. ���� ����
		Session session = Session.getInstance(server_info, auth);
		session.setDebug(true);

		// 2. �޽��� �ۼ�
		MimeMessage msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(_mail_info.get("from"))); // ������ ��
		msg.addRecipient(Message.RecipientType.TO, new InternetAddress(_mail_info.get("to"))); // �޴� ��
		msg.setSubject(_mail_info.get("subject"), "text/html;charset=UTF-8"); // ����
		msg.setContent(_mail_info.get("content"), _mail_info.get("format")); // ����

		// 3. ����
		Transport.send(msg);
	}
}
