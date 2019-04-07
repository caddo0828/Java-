
class Jl{
	String name;
	String sex;
	int age;
	String home;
	String xl;
	public void showname(){
	    System.out.println(name);
	}
	public void setname(String name){
		this.name=name;
	}
	public void showsex(){
		System.out.println(sex); 
	}
	public void setsex(String sex){
		this.sex=sex;
	}
	public void showage(){
		System.out.println(age); 
	}
	public void setage(int age){
		this.age=age;
	}
	public void showhome(){
		System.out.println(home); 
	}
	public void sethome(String home){
		this.home=home;
	}
	public void showxl(){
		System.out.println(xl);
	}
	public void setxl(String xl){
		this.xl=xl;
	}
	
}
public class Text4 {
	public  static void main(String[] args){
		Jl stu=new Jl();
		stu.name="李大路";
		stu.sex="女";
		stu.age=20;
		stu.home="萍乡";
		stu.xl="本科";	
		stu.showname();
		stu.showsex();
		stu.showage();
		stu.showhome();
		stu.showxl();
	} 
}