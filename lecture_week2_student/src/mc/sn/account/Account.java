package mc.sn.account;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	
	public Account(String ano, String owner) {
		this.ano = ano;
		this.owner = owner;
		this.balance = 0;
	}
	public String getAno() { return this.ano; }
	public void setAno(String ano) {this.ano = ano;}
	public String getOwner() {return this.owner;}
	public void setOwner(String owner) {this.owner= owner;}
	public int getBalance() {return this.balance;}
	public void setBalance(int balance) {this.balance+=balance;}
}
