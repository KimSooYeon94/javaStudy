class DataTypeTest 
{
	public static void main(String[] args) 
	{
		//byte age;
		//short age;
		int age;
		//long age;
		age = 27;
		
		System.out.println("�������� ����: " + age + "���Դϴ�.");

		//double height;
		float height;
		//height = 173.8;
        //height = 173.8f; //�Ǽ����� float������ �����ϱ� ���ؼ��� ���̻� f�� ���̰ų�
		height = (float)177.8; //�ڷ��� ��ȯ�� �Ͽ� ������ �� �־��
		System.out.println("�������� Ű: " + height);

		char gender;
		gender = 'M';
		//gender = "M"; //�ֵ���ǥ�� ������ ���ڿ�(String)�� ����ϱ� ������ char�� ������ �� �����
		System.out.println("�������� ������: " + gender);

		boolean isVaccine;
		isVaccine = true;
		System.out.println("�������� 1����� ��������: " + isVaccine);



	}
}
/*
C:\javaStudy\day0928>javac DataTypeTest.java
DataTypeTest.java:15: error: incompatible types: possible lossy conversion from double to float
                height = 173.8;
                         ^
1 error
*/

/*
C:\javaStudy\day0928>javac DataTypeTest.java
DataTypeTest.java:22: error: incompatible types: String cannot be converted to char
                gender = "M";
                         ^
1 error
*/