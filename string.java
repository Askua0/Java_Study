import java.util.Date; //�������ں�ʱ���ַ�����ʽ��
import java.lang.*;

public class string {
	public static void main(String[] args){
		//�ַ���
		
		/* ��java����˫���ţ��������Ķ����ַ���
		 * ������Ϊ��������������ʹ�ã���"1+2",�����
		 * ������3 */
		
		
		//�����ַ�����ʽһ
		
		char a[] = {'g','o','o','d'};
		String s = new String(a);
		
		//��ͬ��
		
		String k = new String("boy!");
		System.out.println(s + k);
		
		
		//�����ַ�����ʽ��
		
		String str1,str2;
		str1 = "I am kingsley,";
		str2 = "I love Emily!";
		System.out.println(str1 + str2);
		
		//ʹ��+�������ʵ�����Ӷ���ַ����Ĺ��ܡ�
		
		
		//���Ӷ���ַ����ķ���
		
		String s1 = new String("hello,");
		String s2 = new String("world");
		String s3 = s1 + s2;
		System.out.println(s3);
		
		
		//��ȡ�ַ����ĳ��ȷ���
		//ʹ��length()�������Ի�ȡ�������ַ�������ĳ���
		
		String s5 = "I am a boy";
		int size = s5.length();
		System.out.println("s5�ĳ����ǣ�" + size);
		//�ַ������Ȱ����ո����ռ�Ĵ�С
		
		
		
		
		//�ַ�������
		//���ҷ�����Ҫ�� indexOf()��lastindexOf().
		
		String s7 = "I love you";
		int size2 = s7.indexOf("o");
		System.out.println("�ַ�o��λ���ǣ�" + size2);
		//�ַ�������λ���ǣ�0--n����ʽ��ȷ����
		
		
		
		
		//��ȡָ������λ�õ��ַ���
		//ʹ��charAt()�ķ������Խ�ָ�����������ַ�����
		
		String s8 = "kingsley";
		char name = s8.charAt(3);
		System.out.println("�ַ�name����λ��Ϊ3���ַ���"
				+ name);
		
		
		
		
		//��ȡ�ַ���
		//ͨ��String���subString()�����ɶ��ַ������н�ȡ
		
		String hello = "hello world";
		String sub = hello.substring(0,3);
		System.out.println("��ȡ�����ַ��ǣ�" + sub);
		//��һ��������ȡ��ʼ��λ�ã��ڶ���������ȡ����λ��
		
		
		
		
		//ȥ���ո�
		//trim()���������ַ����ĸ���������ǰ���ո��β���ո�
		
		String java = " he llo,ja va ";
		System.out.println("ԭ���ĳ�����" + java.length());
		System.out.println("ȥ���ո��ĳ�����" + java.trim().length());
		
		
		
		
		//�ַ������滻
		//replace()������ʵ�ֽ�ָ�����ַ��������µ��ַ���
		
		String emily = "emily";
		String Emily = emily.replace("e", "E");
		System.out.println("ԭ�ַ���" + emily + "���ַ���" + Emily);
		
		/*
		 ���Ҫ�滻��oldChar���ַ����г��ֶ�Σ�replace()�����ὫoldCharȫ��
		 �滻��newChar��
		 
		 ע�⣬Ҫ�滻��oldChar�Ĵ�СҪ��ԭ�ַ����еĴ�Сд����һ�£������ܳɹ���
		 */
		
		
		
		
		//�ж��ַ����Ƿ����
		//�Ƚ��ַ����Ƿ���ȣ�Ҫʹ��equals()���������ִ�Сд����equalIgnorecase()(���Դ�Сд��������ֵΪ������
		
		String me = new String("yzaw");
		String me2 = new String("YZAW");

		boolean b = me.equals(me2);
		boolean b2 = me.equalsIgnoreCase(me2);

		System.out.println("me �� me2 �����" + b);
		System.out.println("me �� me2 �����" +b2); //����quals.������e
		
		/*
		System.out.println("me �� me2 �����" + me.equals(me));
		System.out.println("me �� me2 �����" + me.equalsIgnoreCase(me));
		*/



		//��ĸ��Сת��
		//toLowerCase()���������д�Сд��ĸת��ΪСд��ĸ
		//toUpperCase()����������Сд��ĸתת��Ϊ��д��ĸ  
		//ͬc���Ե�toupper()��tolower()
		/*
		String kill = new String("helloEmily");
		String kill2 = kill.toLowerCase(kill);
		String kill3 = kill.toUpperCase(kill);
		
		System.out.println("ԭ�����ַ����ǣ�" + kill);
		System.out.println("Сд���ַ����ǣ�" + kill2);
		System.out.println("��д���ַ����ǣ�" + kill3);
		*/
		



		//��ʽ���ַ���
		Date date = new Date();
		String year = String.format("%tY",date);
		String month = String.format("%tb",date);
		String day = String.format("%td",date);

		System.out.println("�����ǣ�" + year + "��");
		System.out.println("�����ǣ�" + month);
		System.out.println("�����ǣ�" + day + "��");


		String hour = String.format("%tH",date);
		String minute = String.format("%tM",date);
		String second = String.format("%tS",date);

		System.out.println("�����ǣ�" + hour + "ʱ" + minute + "��" + second + "��");
		
		//��Щ����ʱ���ʽ������"%tX"����ʽ��Ϊ�������������
		
	}

}
