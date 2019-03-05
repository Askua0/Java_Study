public class javabase {
	//java基础
	
	public static void main(String[] args) {
		/*java语言是面向对象的程序设计语言，组成的基本单位是类，
		 类中又包括属性和方法两部分。main是主类。*/
		String s1="hello,";
		String s2="java";
		System.out.println(s1+s2);
		//全局变量 = 成员变量 > 局部变量
		
		//同c和c++一样，java也把字符当做整数来处理
		
		//switch 语句中表达式的值必须是整型‘字符或字符串类型
		/* 同一个switch语句，case的常量必须互不相同。 */
		
		String name = "何夜息";
		switch(name){
			case "何夜息":
				System.out.println("你是英俊潇洒的何夜息");
				break;
			case "何夜息":
				System.out.println("何夜息");
				break;
		}
		int x = 1;
		do{
			x++;
			System.out.println("何夜息");
		}while(x<=0);
		//do...while语句中，while后面的";"不能少！！!
		

		for(int i = 2; i<=10; i+=2){
			System.out.println("2到10之间的所有偶数是："+i);
		}
		
		/* foreach语句是for语句的特殊化版本，并不是一个关键字
		 但是在遍历数组方面会很方便。 */
		
		int arr[] = {1,3,1,4,5,2,0};
		System.out.println("一维数组中的元素是：");
		for(int y : arr){
			System.out.println(y);
		}
	}

}