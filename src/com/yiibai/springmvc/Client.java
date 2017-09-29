package com.yiibai.springmvc;

public class Client {
 
	public static void main(String[] args) {
		System.out.println(getExcelColumnName(712));
	}
	
	private static void setExcelColumnName(StringBuilder str, int col){
	    int tmp = col / 26;
	    if(tmp > 26){
	        setExcelColumnName(str, tmp - 1);
	    }else if(tmp > 0){
	        str.append((char)(tmp + 64));
	    }
	    str.append((char)(col % 26 + 65));
	}
	 
	public static String getExcelColumnName(int col) {
		col=col-1;
	    StringBuilder str = new StringBuilder(2);
	    setExcelColumnName(str, col);
	    return str.toString();
	}

}
