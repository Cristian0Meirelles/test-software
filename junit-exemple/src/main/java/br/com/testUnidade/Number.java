package br.com.testUnidade;

public class Number {
	private Integer value;
	
	public Number(Integer value) {
		super();
		this.value = value;
	}
	
	public boolean isPrime(){
		if(value <= 1)
			return false;
		
		for(int aux =2; aux < this.value; aux++) {
			if(value % aux == 0) {
				return false;
			}
		}
		return true;
	}



}
