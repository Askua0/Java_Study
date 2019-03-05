import java.util.Date; //用于日期和时间字符串格式化
import java.lang.*;

public class string {
	public static void main(String[] args){
		//字符串
		
		/* 在java中由双引号（“”）的都是字符串
		 * 不能作为其他数据类型来使用，如"1+2",的输出
		 * 不会是3 */
		
		
		//创建字符串方式一
		
		char a[] = {'g','o','o','d'};
		String s = new String(a);
		
		//等同于
		
		String k = new String("boy!");
		System.out.println(s + k);
		
		
		//创建字符串方式二
		
		String str1,str2;
		str1 = "I am kingsley,";
		str2 = "I love Emily!";
		System.out.println(str1 + str2);
		
		//使用+运算符可实现连接多个字符串的功能。
		
		
		//连接多个字符串的方法
		
		String s1 = new String("hello,");
		String s2 = new String("world");
		String s3 = s1 + s2;
		System.out.println(s3);
		
		
		//获取字符串的长度方法
		//使用length()方法可以获取声明的字符串对象的长度
		
		String s5 = "I am a boy";
		int size = s5.length();
		System.out.println("s5的长度是：" + size);
		//字符串长度包括空格键所占的大小
		
		
		
		
		//字符串查找
		//查找方法主要有 indexOf()和lastindexOf().
		
		String s7 = "I love you";
		int size2 = s7.indexOf("o");
		System.out.println("字符o的位置是：" + size2);
		//字符串索引位置是：0--n的形式来确定的
		
		
		
		
		//获取指定索引位置的字符串
		//使用charAt()的方法可以将指定索引处的字符返回
		
		String s8 = "kingsley";
		char name = s8.charAt(3);
		System.out.println("字符name索引位置为3的字符："
				+ name);
		
		
		
		
		//获取字符串
		//通过String类的subString()方法可对字符串进行截取
		
		String hello = "hello world";
		String sub = hello.substring(0,3);
		System.out.println("截取到的字符是：" + sub);
		//第一个整数截取开始的位置，第二个整数截取结束位置
		
		
		
		
		//去除空格
		//trim()方法返回字符串的副本，忽略前导空格和尾部空格
		
		String java = " he llo,ja va ";
		System.out.println("原来的长度是" + java.length());
		System.out.println("去掉空格后的长度是" + java.trim().length());
		
		
		
		
		//字符串的替换
		//replace()方法可实现将指定的字符串换成新的字符串
		
		String emily = "emily";
		String Emily = emily.replace("e", "E");
		System.out.println("原字符串" + emily + "现字符串" + Emily);
		
		/*
		 如果要替换的oldChar在字符串中出现多次，replace()方法会将oldChar全部
		 替换成newChar。
		 
		 注意，要替换的oldChar的大小要与原字符串中的大小写保持一致，否则不能成功。
		 */
		
		
		
		
		//判断字符串是否相等
		//比较字符串是否相等，要使用equals()方法（区分大小写）和equalIgnorecase()(忽略大小写），返回值为布尔型
		
		String me = new String("yzaw");
		String me2 = new String("YZAW");

		boolean b = me.equals(me2);
		boolean b2 = me.equalsIgnoreCase(me2);

		System.out.println("me 和 me2 相等吗？" + b);
		System.out.println("me 和 me2 相等吗？" +b2); //不是quals.别少了e
		
		/*
		System.out.println("me 和 me2 相等吗？" + me.equals(me));
		System.out.println("me 和 me2 相等吗？" + me.equalsIgnoreCase(me));
		*/



		//字母大小转换
		//toLowerCase()方法将所有大小写字母转换为小写字母
		//toUpperCase()方法将所有小写字母转转化为大写字母  
		//同c语言的toupper()和tolower()
		/*
		String kill = new String("helloEmily");
		String kill2 = kill.toLowerCase(kill);
		String kill3 = kill.toUpperCase(kill);
		
		System.out.println("原来的字符串是：" + kill);
		System.out.println("小写的字符串是：" + kill2);
		System.out.println("大写的字符串是：" + kill3);
		*/
		



		//格式化字符串
		Date date = new Date();
		String year = String.format("%tY",date);
		String month = String.format("%tb",date);
		String day = String.format("%td",date);

		System.out.println("今年是：" + year + "年");
		System.out.println("现在是：" + month);
		System.out.println("今天是：" + day + "号");


		String hour = String.format("%tH",date);
		String minute = String.format("%tM",date);
		String second = String.format("%tS",date);

		System.out.println("现在是：" + hour + "时" + minute + "分" + second + "秒");
		
		//这些日期时间格式，都是"%tX"的形式作为参数返回输出的
		
	}

}
