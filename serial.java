import java.io.*;
class Student implements Serializable
{
	int id;
	String name;
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void disp()
	{
		System.out.println("id:"+id+" name:"+name);
	}
}
class serial
{
	public static void main(String args[]) throws Exception
	{
		Student s=new Student(1,"harry");
		Student s1=new Student(2,"jack");
		FileOutputStream fos=new FileOutputStream("object.dat");
		ObjectOutputStream os=new ObjectOutputStream(fos);
		os.writeObject(s);
		os.writeObject(s1);
		os.close();
		fos.close();
		System.out.println("serialized to object.dat");
		FileInputStream fis=new FileInputStream("object.dat");
		System.out.println("deserialized from object.dat");
		ObjectInputStream oin=new ObjectInputStream(fis);
		Student obj=(Student) oin.readObject();
		Student obj2=(Student) oin.readObject();
		obj.disp();
		obj2.disp();
		fis.close();
		oin.close();
	}
}
