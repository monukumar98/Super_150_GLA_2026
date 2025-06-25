package S;
import O.SendNotification;
import O.Send_SMS;
import O.GmailNotification;
public class Client {
	public static void main(String[] args) {
		Pen p = new Pen();
		Invoice i = new Invoice(p);
		System.out.println(i.CreateInvoice());
//		i.PrintInvoice();
//		i.SendMail();
//		SendNotification s = new SendNotification();
//		s.SendMessage(i);
		SendNotification s1 = new GmailNotification();
		SendNotification s2 = new Send_SMS();
				
	}

}
