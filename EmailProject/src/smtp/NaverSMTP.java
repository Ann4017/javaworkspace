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
	private final Properties server_info; // 서버 정보
	private final Authenticator auth; // 인증 정보

	public NaverSMTP() {
		// 네이버 SMTP 서버 접속 정보
		server_info = new Properties();
		server_info.put("mail.smtp.host", "smtp.naver.com");
		server_info.put("mail.smtp.port", "465");
		server_info.put("mail.smtp.starttls.enable", "true");
		server_info.put("mail.smtp.auth", "true");
		server_info.put("mail.smtp.debug", "true");
		server_info.put("mail.smtp.socketFactory.port", "465");
		server_info.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		server_info.put("mail.smtp.socketFactory.fallback", "false");

		// 사용자 인증 정보
		auth = new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("아이디", "비번");
			}
		};
	}

	// 주어진 메일 내용을 네이버 SMTP 서버를 통해 전송합니다.
	public void email_sending(Map<String, String> _mail_info) throws MessagingException {
		// 1. 세션 생성
		Session session = Session.getInstance(server_info, auth);
		session.setDebug(true);

		// 2. 메시지 작성
		MimeMessage msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(_mail_info.get("from"))); // 보내는 이
		msg.addRecipient(Message.RecipientType.TO, new InternetAddress(_mail_info.get("to"))); // 받는 이
		msg.setSubject(_mail_info.get("subject"), "text/html;charset=UTF-8"); // 제목
		msg.setContent(_mail_info.get("content"), _mail_info.get("format")); // 내용

		// 3. 전송
		Transport.send(msg);
	}
}
