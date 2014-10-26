package user.business;

import user.core.Account;

public class SavingsAccount extends Account{

	@Override
	public String welcomeKit() {
		StringBuffer kit = new StringBuffer();
		kit.append("No of cheques 13 \n" );
		kit.append("Atm card free \n" );
		kit.append("No of transactions per year 12 \n" );
		return kit.toString();
	}

}
