package ch1;

//switch语句
/*switch语句中的表达式必须是整型或者字符型，即int，short,byte,char
 * 当表达式的值与case语句常量表达式的值一样时，执行case语句后的语句序列
 * 当表达式的值无匹配时，执行default定义的语句序列
 * default语句是可以选择的，有此语句则可执行，无时不进行
 * break语句用于结束switch语句
 * 当若干个case子句所执行的内容可用同一条语句表达时，允许这些case语句共用一条语句
 *
 * 
 * */
public class switchyuju {
	public static void main(String[] args){
		int score=65;
		int textscore=score/10;
		switch(textscore){
		case 10:
			break;
		case 9:
			System.out.println("优秀");
			break;
		case 8:
			System.out.println("良好");
			break;
		case 7:
			System.out.println("中等");
			break;
		case 6:
			System.out.println("及格");
	    	break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("不及格");
			break;
		default :
			System.out.println("无此匹配项");
			break;
		}
	}

}
