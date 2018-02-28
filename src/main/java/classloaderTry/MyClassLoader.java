package classloaderTry;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author 阮航
 * @date 创建时间：2017年12月1日 上午10:22:56
 * @version 1.0 自定义类加载器
 */
public class MyClassLoader extends ClassLoader {

	private String root;

	protected Class<?> findClass(String name) throws ClassNotFoundException {
		String fileName = name + ".class";
		byte[] classData = loadClassData(name);
		if (classData == null) {
			throw new ClassNotFoundException();
		} else {

			return defineClass(fileName, classData, 0, classData.length);
		}
	}

	protected byte[] loadClassData(String name) {

//		String fileName = root + File.separatorChar + name.replace('.', File.separatorChar) + ".java";
		String fileName = name + ".class";
//		String fileName = name;
		try {
			InputStream ins = new FileInputStream(fileName);

			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			int bufferSize = 1024;
			byte[] buffer = new byte[bufferSize];
			int length = 0;
			while ((length = ins.read(buffer)) != -1) {
				baos.write(buffer, 0, length);
			}
			return baos.toByteArray();

		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	public String getRoot() {
		return root;
	}

	public void setRoot(String root) {
		this.root = root;
	}

	public static void main(String[] args) {

		MyClassLoader classLoader =	new	MyClassLoader();
//		classLoader.setRoot("E:\\");
//		classLoader.setRoot("F:\\self");
		Class<?> testClass =null;
		
		try{
//			testClass = classLoader.loadClass("Test2");
			testClass = classLoader.findClass("E:\\Test2");
			Object object = testClass.newInstance();
			System.out.println(object.getClass());
			System.out.println(object.getClass().getClassLoader());
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(InstantiationException e){
			e.printStackTrace();

		}catch(IllegalAccessException e)
		{
			e.printStackTrace();

		}
	}
}
