import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsSender {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "AC1ece7ed43d5c8b636906d9aa7fb6aaef";
  public static final String AUTH_TOKEN = "524dd6345368a7ebcc2de08b944dd6ec";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    Message message = Message.creator(new PhoneNumber("+15038809309"),
        new PhoneNumber("+19086635615"),
        "Neen Machine!!!!").create();

    System.out.println(message.getSid());
  }
}
