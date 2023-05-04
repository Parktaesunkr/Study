package tr0504;

class TimeAccount extends Account{
	
	private long timeBalance;

		public TimeAccount(String name, String no, long timeBalance) {
		super(name, no);
		this.timeBalance = timeBalance;
	}

		public long getTimeBalance() {
			return timeBalance;
		}
	
	
	
		void cancel() {
			deposit(timeBalance);
			timeBalance =0;
		}
	

	
	
	

}
