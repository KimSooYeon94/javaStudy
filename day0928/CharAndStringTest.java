class CharAndStringTest 
{
	public static void main(String[] args) 
	{
		//�ڹٿ����� ���Ϲ����� ó���� ���ڿ��� ó���� �޶��
		//�ϳ��� ���ڸ� ǥ���ϱ� ���ؼ��� Ȫ����ǥ�� ����� �ϰ�
		//���ڿ��� ó���ϱ� ���ؼ��� �ֵ���ǥ�� ������մϴ�.
		//���� �ϳ��� ���������� �ֵ���ǥ�� �����ٸ� char�� ������ �� ����
		//String���� �����ؾ� �մϴ�.
		char firstName;
		firstName = '��';
		System.out.println(firstName);

		String name;
		name = "�ڼ���";
		System.out.println(name);

		//char lastName;
		String lastName;
		lastName = "��";
		System.out.println(lastName);

		String data;
		data = "hello";
		char last = data.charAt(4);
		//charAt�� String�� ��ġ (index)�� �ִ� ���� �ϳ��� �˷��ִ� ���
		//
		System.out.println("�Ǹ������� �ִ� ���ڴ� " + last + "�Դϴ�.");

	}
}

/*
CharAndStringTest.java:19: error: incompatible types: String cannot be converted to char
                lastName = "��";
                           ^
1 error
*/