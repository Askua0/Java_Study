import java.util.Arrays;

public class array{
	public static void main(String[] args){
	
		//数组是具有相同数据类型的一组数据的集合
		//java中也将数组看做对象数组中的每个元素具有相同的数据类型
		//数组作为对象如同Sting一样，允许通过new关键字进行内存分配
		//数组的下表也是从0开始的，并且对于整数数组来说，各个元素的初始值都为0
		
		//创建数组的方法同创建String的方法

		//将各个月的天数进行输出
		int day[] = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		
		int i=0;
		for(i=0;i<12;i++)
		{
			System.out.println((i+1) + "月有" + day[i] + "天"); 
		}


		//二维数组：如果一位数组中的各个元素仍是一个数组，那么它就是二维数组。

		//二维数组常用于表示表格，第一下标代表元素所在的行，第二个下标代表元素所在的列。
		
		//输出三行四列的0

		int a[][] = new int[3][4];
		for(int x = 0;x<a.length;x++)
		{
			for(int y = 0;y<a[x].length;y++)
			{
				System.out.println(a[x][y]);
			}
			System.out.println();//输出空格
		}

		//遍历数组
		int b[][] = new int[][]{{1},{2,3},{4,5,6}}; //定义二维数组
		for(int k=0;k<b.length;k++)
		{
			for(int c=0;c<b[k].length;c++)
			{	
				System.out.print(b[k][c]);
			}
			System.out.println();
		}

		//使用foreach遍历数组
		int arr2[][] = {{13,14},{5,20}};

		System.out.println("数组arr[]2的元素是：");
		for(int x[]:arr2)    //外层循环变量为一维数组
		{
			for(int e:x)    //遍历每一个数组元素
			{
				if(e == x.length)  //判断是否为数组最后一个元素
				{
					System.out.println(e);  //输出最后一个元素
				}else{
					System.out.println(e);
				}
			}
		}

		//通过Array类的静态方法fill()来对数组中的元素进行替换

		int arr3[] = new int[]{1998,03,27,9,78};  //定义有五个元素的一维数组
		
		for(int h=0;h<arr3.length;h++)
		{
			System.out.println(arr3[h]);
		}
		Arrays.fill(arr3,8); //替换元素  Arrays.fill(arr3[3],8); 不能替换单个元素
		System.out.println("替换后的元素是：");
		for(int h=0;h<arr3.length;h++)
		{
			System.out.println(arr3[h]);
		}
		System.out.println();

		//替换指定元素
		Arrays.fill(arr3,4,5,99);
		for(int h=0;h<arr3.length;h++)
		{
			System.out.println(arr3[h]);
		}
		
		int arr4[] = new int[]{1999,11,14,9,78};
		System.out.println();
		//排序数组
		//Arrays中的sort()可以实现对数组的排序
		Arrays.sort(arr4);
		System.out.println("排序后的数组");
		for(int h=0;h<arr4.length;h++)
		{
			System.out.println(arr4[h]);
		}
		
		//binarySearch()可以查询 排序后 的数组中某个元素的位置
		int index = Arrays.binarySearch(arr4,1999);    //获得元素的下标
		//int index = Arrays.binarySearch(arr4,8);  没有找到元素会返回-1
		System.out.println("11 的索引位置是：" +index);

	}
}