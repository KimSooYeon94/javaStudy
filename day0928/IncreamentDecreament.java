class IncreamentDecreament 
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j = 5;
		i++; // i = i + 1
		++j; // j = j + 1
		System.out.println(i);
		System.out.println(j);
		
		
		System.out.println("-----------------------------");
		// a++와 a+1은 다릅니다
		// a++ 은 a 자신이 변하는거
		// a+1 은 a 자신은 안변하고 +1만 하는거
		int a = 10;
		int b = 10;

		System.out.println(a+1);
		System.out.println(b++);
		System.out.println("-----------------------------");
		System.out.println(a);
		System.out.println(b);
		System.out.println("-----------------------------");
		
		int n = 5;
		int m = 5;
		n--;
		--m;
		System.out.println(n);
		System.out.println(m);
		System.out.println("-----------------------------");

		i = 5;
		j = 5;
		a = ++i;
		b = j++;
		System.out.println("i:" +i);
		System.out.println("j:" +j);
		System.out.println("a:" +a);
		System.out.println("b:" +b);
		System.out.println("-----------------------------");
		
		i = 5;
		j = 5;
		int k = 5;


		System.out.println(++i); //6
		System.out.println(j++); //5
		System.out.println(k+1); //6 
		System.out.println("i:" +i); //6
		System.out.println("j:" +j); //6 
		System.out.println("k:" +k); //5 
	}
}
