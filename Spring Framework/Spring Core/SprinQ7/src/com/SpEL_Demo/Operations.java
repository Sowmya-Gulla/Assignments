package com.SpEL_Demo;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Operations {
	
	int num1=2;
	
	@Value("#{2+2}")//#{${anyproperty}+2}
	int add;
	
	@Value("#{4-2}")
	int sub;
	
	@Value("#{4>3}")
	String equals;
	
	@Value("#{6<10?'True':'False'}")
	String tenary;
	
	@Value("#{true and true}")
	String bool;

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getAdd() {
		return add;
	}

	public void setAdd(int add) {
		this.add = add;
	}

	public int getSub() {
		return sub;
	}

	public void setSub(int sub) {
		this.sub = sub;
	}

	public String getEquals() {
		return equals;
	}

	public void setEquals(String equals) {
		this.equals = equals;
	}

	public String getTenary() {
		return tenary;
	}

	public void setTenary(String tenary) {
		this.tenary = tenary;
	}

	public String getBool() {
		return bool;
	}

	public void setBool(String bool) {
		this.bool = bool;
	}

	@Override
	public String toString() {
		return "Operations [num1=" + num1 + ", add=" + add + ", sub=" + sub + ", equals=" + equals + ", tenary="
				+ tenary + ", bool=" + bool + "]";
	}

	
	
	

}
