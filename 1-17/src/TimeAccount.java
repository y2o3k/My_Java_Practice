class TimeAccount extends Account 
		private long timeBalance;

//생성자
	TimeAccount(String name, String no, long balance, long timeBalance){
		super(name, no, balance);
		this.timeBalance = timeBalance;
	}
 // 정기예금 잔액 확인
	long getTimeBalance() { 
		return timeBalance;
	}
	//정기예금을 해약하고 전액을 보통예금으로 이체
	void cancel() {
		deposit(timeBalance);
		timeBalance = 0 ;
	}
}
