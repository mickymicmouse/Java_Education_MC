package mc.sn.day9;

public class LottoBall {
	private Integer number;
	private boolean isSelected;
	
	//number�� �����ϴ� ������ �����
	public LottoBall(Integer number) {
		this.number = number;
	}
	//�� �ʵ���  get/set�� ����ÿ�.

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getNumber().toString();
	}
	
}