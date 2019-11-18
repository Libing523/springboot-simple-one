package serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
    * @ClassName: TestPersonSerialize
    * @Description: 序列化和反序列化
    * @author lishuaibing
    * @date 2019年11月18日 下午2:30:07
    *
 */
public class TestPersonSerialize {
	public static void main(String[] args) throws Exception {
		serializePerson();
		Person p = deserializePerson();
		System.out.println(p.getName() + ";" + p.getAge());

	}

	private static void serializePerson() throws FileNotFoundException, IOException {
		Person person = new Person();
		person.setName("测试实例");
		person.setAge(25);
		person.setSex("male");

		ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream(new File("E:/person.txt")));
		oo.writeObject(person);
		System.out.println("序列化成功");
		oo.close();
	}

	private static Person deserializePerson() throws IOException, Exception {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("E:/person.txt")));
		Person person = (Person) ois.readObject();
		System.out.println("反序列化成功");
		return person;
	}
}
