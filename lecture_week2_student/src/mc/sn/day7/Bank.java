package mc.sn.day7;

public class Bank {
	private static AccountVO[] accArray = new AccountVO[5];
	private static int num = 0;
	public static void main (String[] args) {
		Bank b = new Bank();
		while (true) {
			if(num==5) {
				break;
			}
			b.createAccount("111","j",0);
		}
		b.listAccount();
	}
	public void createAccount(String ano, String owner, int balance) {
		AccountVO account1 = new AccountVO(ano, owner,balance);
		accArray[num]=account1;
		num++;
	}
	public void listAccount() {
		for(AccountVO account : accArray) {
			//System.out.println(account.getAno()+", "+account.getOwner()+", "+account.getBalance());
			System.out.println(account);
		}
	}
}
