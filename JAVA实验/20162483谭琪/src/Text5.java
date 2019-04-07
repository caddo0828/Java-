class Ma{
   public void plus(double a,double b){
		System.out.println("两个数相加得"+(a+b));
	}
	public void reduce(double a,double b){
		System.out.println("两个数相减得"+(a-b));
	}
    public void multiply(double a,double b){
    	System.out.println("两个数相乘得"+(a*b));
    }
    public void except(double a,double b){
    	System.out.println("两个数相除得"+(a/b));
    }
    public void xfs(double a){
    	System.out.println("相反数为"+(-a));
    }
    public void ds(double a){
    	System.out.println("倒数为"+(1/a));
    }
    public void jdz(double a){
    	if(a>=0){
    		System.out.println("绝对值为"+a);
    	}
    	else {
    		System.out.println("绝对值为"+(-a));
    	}
    }
    public void maxValue(double a,double b){
    	if(a>b){
    		System.out.println("最大值为");
    		System.out.println(a);
    	}else{
    		System.out.println("最大值为");
    		System.out.println(b);
    	}
    }
    public void minValue(double a,double b){
    	if(a<b){
    		System.out.println("最小值为");
    		System.out.println(a);
    	}else{
    		System.out.println("最小值为");
    		System.out.println(b);
    	}
    }
    public void fds(double a){
    	double b;
        b=(int)a;
    	System.out.println("最大整数或最小整数为"+b);
    }
    public static void  sqrt(double b){
           System.out.println("平方根为"+Math.sqrt(b));
    }
    public void  log(double b){
    	System.out.println("自然对数为"+Math.log(b));
    }
	public void pow(double a,double b){
    	System.out.println("指数幂"+Math.pow(a,b));
    }
}
public class Text5 {
	public  static void main(String[] args){
	     Ma td=new Ma();
	     td.plus(5,2);
	     td.reduce(5,2);
	     td.multiply(5,2);
	     td.except(5,2);
	     td.xfs(-5);
	     td.ds(5) ;  
	     td.jdz(-5);
	     td.maxValue(2,5);
	     td.minValue(5,2);
	     td.fds(5.1);
	     td.sqrt(4);
	     td.log(4);
	     td.pow(2.0,2);
	}  
}

