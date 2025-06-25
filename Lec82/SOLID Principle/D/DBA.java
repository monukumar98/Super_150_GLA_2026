package D;

public class DBA {
	private Database mq;

	public DBA(Database mq) {
		// TODO Auto-generated constructor stub
		this.mq = mq;
	}

	public void save() {
		mq.save();
	}

	public static void main(String[] args) {
		DBA d = new DBA(new NoSqlDatabase());
		DBA d1 = new DBA(new MySQLDataBase());
	}
}
