import java.util.Arrays;

public class array{
	public static void main(String[] args){
	
		//�����Ǿ�����ͬ�������͵�һ�����ݵļ���
		//java��Ҳ�����鿴�����������е�ÿ��Ԫ�ؾ�����ͬ����������
		//������Ϊ������ͬStingһ��������ͨ��new�ؼ��ֽ����ڴ����
		//������±�Ҳ�Ǵ�0��ʼ�ģ����Ҷ�������������˵������Ԫ�صĳ�ʼֵ��Ϊ0
		
		//��������ķ���ͬ����String�ķ���

		//�������µ������������
		int day[] = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		
		int i=0;
		for(i=0;i<12;i++)
		{
			System.out.println((i+1) + "����" + day[i] + "��"); 
		}


		//��ά���飺���һλ�����еĸ���Ԫ������һ�����飬��ô�����Ƕ�ά���顣

		//��ά���鳣���ڱ�ʾ��񣬵�һ�±����Ԫ�����ڵ��У��ڶ����±����Ԫ�����ڵ��С�
		
		//����������е�0

		int a[][] = new int[3][4];
		for(int x = 0;x<a.length;x++)
		{
			for(int y = 0;y<a[x].length;y++)
			{
				System.out.println(a[x][y]);
			}
			System.out.println();//����ո�
		}

		//��������
		int b[][] = new int[][]{{1},{2,3},{4,5,6}}; //�����ά����
		for(int k=0;k<b.length;k++)
		{
			for(int c=0;c<b[k].length;c++)
			{	
				System.out.print(b[k][c]);
			}
			System.out.println();
		}

		//ʹ��foreach��������
		int arr2[][] = {{13,14},{5,20}};

		System.out.println("����arr[]2��Ԫ���ǣ�");
		for(int x[]:arr2)    //���ѭ������Ϊһά����
		{
			for(int e:x)    //����ÿһ������Ԫ��
			{
				if(e == x.length)  //�ж��Ƿ�Ϊ�������һ��Ԫ��
				{
					System.out.println(e);  //������һ��Ԫ��
				}else{
					System.out.println(e);
				}
			}
		}

		//ͨ��Array��ľ�̬����fill()���������е�Ԫ�ؽ����滻

		int arr3[] = new int[]{1998,03,27,9,78};  //���������Ԫ�ص�һά����
		
		for(int h=0;h<arr3.length;h++)
		{
			System.out.println(arr3[h]);
		}
		Arrays.fill(arr3,8); //�滻Ԫ��  Arrays.fill(arr3[3],8); �����滻����Ԫ��
		System.out.println("�滻���Ԫ���ǣ�");
		for(int h=0;h<arr3.length;h++)
		{
			System.out.println(arr3[h]);
		}
		System.out.println();

		//�滻ָ��Ԫ��
		Arrays.fill(arr3,4,5,99);
		for(int h=0;h<arr3.length;h++)
		{
			System.out.println(arr3[h]);
		}
		
		int arr4[] = new int[]{1999,11,14,9,78};
		System.out.println();
		//��������
		//Arrays�е�sort()����ʵ�ֶ����������
		Arrays.sort(arr4);
		System.out.println("����������");
		for(int h=0;h<arr4.length;h++)
		{
			System.out.println(arr4[h]);
		}
		
		//binarySearch()���Բ�ѯ ����� ��������ĳ��Ԫ�ص�λ��
		int index = Arrays.binarySearch(arr4,1999);    //���Ԫ�ص��±�
		//int index = Arrays.binarySearch(arr4,8);  û���ҵ�Ԫ�ػ᷵��-1
		System.out.println("11 ������λ���ǣ�" +index);

	}
}