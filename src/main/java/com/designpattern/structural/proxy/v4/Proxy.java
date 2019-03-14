package com.designpattern.structural.proxy.v4;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import javax.tools.JavaCompiler.CompilationTask;

// ���������������
// ��ʱ��������ַ�������ʽչ��
// �Ѷ�̬�������ɹ����ַ�ʽ��JDK�Դ�API��CGLib��ASM
public class Proxy {
	public static Object newProxyInstance(Class<?> infce) throws Exception {
		// ����س������ַ�����֤���ɵ��ļ���ʽ
		String rt = "\r\n";
		// ��ʱ������װ���ַ���
		String src = 
			"package com.proxy;" + rt + 
			"public class TankTimeProxy implements IMoveable {" + rt +
			"	IMoveable t;" + rt +
				
			"	public TankTimeProxy(IMoveable t) {" + rt +
			"		super();" + rt +
			"		this.t = t;" + rt +
			"	}" + rt +
				
			"	@Override" + rt +
			"	public void move() {" + rt +
			"		long startTime = System.currentTimeMillis();" + rt +
			"		t.move();" + rt +
			"		long endTime = System.currentTimeMillis();" + rt +
			"		System.out.println(\"�������е�ʱ��:\"+(endTime-startTime));" + rt +
			"	}" + rt +
			"}";
		
		String fileName = System.getProperty("user.dir") + 
							"/src/com/proxy/TankTimeProxy.java";
		System.out.println(fileName);
		
		File file = new File(fileName);
		FileWriter fw = new FileWriter(file);
		fw.write(src);
		fw.flush();
		fw.close();
		// �õ�JAVAϵͳĬ�ϵı���������ʵ����javac
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		System.out.println(compiler.getClass().getName());
		
		// param: 1.��ϵļ�����,2.���ʻ���صģ�3.����    ��ָ��null��Ĭ�ϵ�
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
		// ͨ��fileMgr�ҵ���������ļ�
		Iterable<?> compilationUnits = fileManager.getJavaFileObjects(fileName);
		// �õ���������
		// out:���뵽��  diagnosticListener:������ options:javac�����ʱ��ָ���Ĳ��� classes���õ���Щclass�ļ�
		CompilationTask t = compiler.getTask(null, fileManager, null, null, null, (Iterable<? extends JavaFileObject>) compilationUnits);
		// �������񣬱���
		t.call();
		fileManager.close();
		
		// load into memory and create new instance
		
		URL[] urls = new URL[]{new URL("file:/" + System.getProperty("user.dir")  + "/src")};
		URLClassLoader ul = new URLClassLoader(urls);
		String name = "com.proxy.TankTimeProxy";
		Class<?> c = ul.loadClass(name);
		System.out.println(c);
		// �õ����췽��
		Constructor<?> construcrot = c.getConstructor(IMoveable.class);
		IMoveable m = (IMoveable) construcrot.newInstance(new Tank());
		//m.move();
		return m;
	}
}
