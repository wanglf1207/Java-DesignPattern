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

// 用来产生代理的类
// 把时间代理以字符串的形式展现
// 把动态代理编译成功几种方式：JDK自带API、CGLib、ASM
public class Proxy {
	public static Object newProxyInstance(Class<?> infce) throws Exception {
		// 定义回车换行字符，保证生成的文件格式
		String rt = "\r\n";
		// 把时间代理包装成字符串
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
			"		System.out.println(\"方法运行的时间:\"+(endTime-startTime));" + rt +
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
		// 拿到JAVA系统默认的编译器，其实就是javac
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		System.out.println(compiler.getClass().getName());
		
		// param: 1.诊断的监听器,2.国际化相关的，3.编码    都指定null表默认的
		StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
		// 通过fileMgr找到被编译的文件
		Iterable<?> compilationUnits = fileManager.getJavaFileObjects(fileName);
		// 拿到编译任务
		// out:编译到哪  diagnosticListener:监听器 options:javac编译的时候指定的参数 classes：用到哪些class文件
		CompilationTask t = compiler.getTask(null, fileManager, null, null, null, (Iterable<? extends JavaFileObject>) compilationUnits);
		// 调用任务，编译
		t.call();
		fileManager.close();
		
		// load into memory and create new instance
		
		URL[] urls = new URL[]{new URL("file:/" + System.getProperty("user.dir")  + "/src")};
		URLClassLoader ul = new URLClassLoader(urls);
		String name = "com.proxy.TankTimeProxy";
		Class<?> c = ul.loadClass(name);
		System.out.println(c);
		// 拿到构造方法
		Constructor<?> construcrot = c.getConstructor(IMoveable.class);
		IMoveable m = (IMoveable) construcrot.newInstance(new Tank());
		//m.move();
		return m;
	}
}
