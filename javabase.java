public class javabase {
	//java����
	
	public static void main(String[] args) {
		/*java�������������ĳ���������ԣ���ɵĻ�����λ���࣬
		 �����ְ������Ժͷ��������֡�main�����ࡣ*/
		String s1="hello,";
		String s2="java";
		System.out.println(s1+s2);
		//ȫ�ֱ��� = ��Ա���� > �ֲ�����
		
		//ͬc��c++һ����javaҲ���ַ���������������
		
		//switch ����б��ʽ��ֵ���������͡��ַ����ַ�������
		/* ͬһ��switch��䣬case�ĳ������뻥����ͬ�� */
		
		String name = "��ҹϢ";
		switch(name){
			case "��ҹϢ":
				System.out.println("����Ӣ�������ĺ�ҹϢ");
				break;
			case "��ҹϢ":
				System.out.println("��ҹϢ");
				break;
		}
		int x = 1;
		do{
			x++;
			System.out.println("��ҹϢ");
		}while(x<=0);
		//do...while����У�while�����";"�����٣���!
		

		for(int i = 2; i<=10; i+=2){
			System.out.println("2��10֮�������ż���ǣ�"+i);
		}
		
		/* foreach�����for�������⻯�汾��������һ���ؼ���
		 �����ڱ������鷽���ܷ��㡣 */
		
		int arr[] = {1,3,1,4,5,2,0};
		System.out.println("һά�����е�Ԫ���ǣ�");
		for(int y : arr){
			System.out.println(y);
		}
	}

}