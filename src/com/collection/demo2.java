package com.collection;
import java.util.ArrayList;
import java.io.*;
public class demo2 {
	public static void main(String[] args){
		Empmanage em=new Empmanage();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(true){
			
			System.out.println("请输入要处理的类型：");
			
			String typenum=br.readLine();
		
			if (typenum.equals("1")){
				String empNo=br.readLine();
				String name=br.readLine();
				float sal=Float.parseFloat(br.readLine());
				Emp emp=new Emp(empNo,name,sal);
				em.addEmp(emp);
			}else if(typenum.equals("2")){
				String empNo=br.readLine();
				float newfloat=Float.parseFloat(br.readLine());
				em.setInfo(empNo, newfloat);
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
class Empmanage{
	private ArrayList arr=null;
	public Empmanage(){
		arr=new ArrayList();
	}
	public void addEmp(Emp emp){
		arr.add(emp);
	}
	public void showInfo(String empNo){
		for(int i=0;i<arr.size();i++){
			Emp emp=(Emp)arr.get(i);
			if(emp.getEmpNo().equals(empNo)){
				System.out.println("找出该员工，他的名字"+emp.getName());
				System.out.println("找出该员工，他的编号"+empNo);
				System.out.println("找出该员工，他的工资"+emp.getsal());
			}
		}
	}
    public void setInfo(String empNo,float newfloat){
    	for(int i=0;i<arr.size();i++){
    		Emp emp=(Emp)arr.get(i);
    		if(emp.getEmpNo().equals(empNo))
    		{
    			emp.setsal(newfloat);
    			System.out.println("找出该员工，他的工资"+emp.getsal());
    		}
    	}
    }

}