package S;

public class Invoice {
	Pen p;

	public Invoice(Pen p) {
		// TODO Auto-generated constructor stub
		this.p = p;
	}

	public int CreateInvoice() {
		return (int) ((p.price * 1.18) + 2);
	}

//	public void PrintInvoice() {
//		System.out.println("Invoice Print kra");
//	}
//	public void SendMail() {
//		System.out.println("Mail pe sendz kra");
//	}

}
