package com.collection;
import java.util.*;

public class demo3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
       HashMap hm=new HashMap();
       Emp emp1=new Emp("s001","�ν�",5.2f);
       Emp emp2=new Emp("s002","�ֳ�",2.5f);
       hm.put("s001", emp1);
       hm.put("s002", emp2);
       if(hm.containsKey("s001"))
       {
    	   System.out.print("�и�Ա��");
    	   Emp emp=(Emp)hm.get("s001");
       }else{
    	   System.out.print("û�и�Ա��");
       }
       Iterator it=hm.keySet().iterator();
       while(it.hasNext){
    	   String key=it.next().toString();
    	   Emp emp=(Emp)hm.get(key);
    	   
       }
	}

}
class Emp{
	private String empNo;
	private String name;
	private float sal;
    public Emp(String empNo,String name,float sal){
    	this.empNo=empNo;
    	this.name=name;
    	this.sal=sal;
    }
    public String getEmpNo(){
    	return empNo;
    }
    public String setEmpNo(){
    	return this.empNo=empNo;
    }
    public String getName(){
    	return name;
    }
    public String setName(float newname){
    	return this.name=name;
    }
    public float getsal(){
    	return sal;
    }
    public float setsal(float newsal){
    	return this.sal=newsal;
    }
    
    }
