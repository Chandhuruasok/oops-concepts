package com.oops.encap;

public class ABCBank {
	long accountNo,phoneNumber;
	int depositAmnt;
	String userName, IFSC;
	public ABCBank()
	{
		
	}
	public ABCBank(long accountNo, long phoneNumber, int depositAmnt, String userName, String iFSC) {
		
		this.accountNo = accountNo;
		this.phoneNumber = phoneNumber;
		this.depositAmnt = depositAmnt;
		this.userName = userName;
		IFSC = iFSC;
	}
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getDepositAmnt() {
		return depositAmnt;
	}
	public void setDepositAmnt(int depositAmnt) {
		this.depositAmnt = depositAmnt;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getIFSC() {
		return IFSC;
	}
	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}
	@Override
	public String toString() {
		return "ABCBank [accountNo=" + accountNo + ", phoneNumber=" + phoneNumber + ", depositAmnt=" + depositAmnt
				+ ", userName=" + userName + ", IFSC=" + IFSC + "]";
	}
	
	
}
