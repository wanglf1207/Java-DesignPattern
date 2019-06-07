# Java 设计模式
设计模式（Design pattern）是一套被反复使用、多数人知晓的、经过分类编目的、代码设计经验的总结。使用设计模式是为了可重用代码、让代码更容易被他人理解、保证代码可靠性。 毫无疑问，设计模式于己于他人于系统都是多赢的，设计模式使代码编制真正工程化，设计模式是软件工程的基石，如同大厦的一块块砖石一样。项目中合理的运用设计模式可以完美的解决很多问题，每种模式在现在中都有相应的原理来与之对应，每一个模式描述了一个在我们周围不断重复发生的问题，以及该问题的核心解决方案，这也是它能被广泛应用的原因。

## 设计模式的分类

总体来说设计模式分为三大类：

* 创建型模式，共五种：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式。

* 结构型模式，共七种：适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享元模式。

* 行为型模式，共十一种：策略模式、模板方法模式、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式。

其实还有两类：并发型模式和线程池模式。用一个图片来整体描述一下：

![我是图片](./src/main/resources/images/dp-all.png)

## 工厂方法模式
工厂方法模式分为三种
1. 普通工厂模式
2. 多个工厂方法模式
3. 静态工厂方法模式

### 普通工厂方法
就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。

* 创建Sender接口，声明send()方法
```java
public interface Sender {

	void send();
}
```

```java
public class FTPSender implements Sender {

	@Override
	public void send() {
		System.out.println("FTPSender send...");
	}

}

```

```java
public class HTTPSender implements Sender {

	@Override
	public void send() {
		System.out.println("HTTPSender send...");
	}

}

```
```java
public class TCPSender implements Sender {

	@Override
	public void send() {
		System.out.println("TCPSender send...");
	}

}

```

```java
public class SenderFactory {
	
	/**
	 * @param protocolType 协议类型
	 */
	public Sender produce(String protocolType) {
		
		if(protocolType.equals("TCP")) {
			return new TCPSender();
		} else if(protocolType.equals("FTP")) {
			return new FTPSender();
		} else if(protocolType.equals("HTTP")) {
			return new HTTPSender();
		} else {
			System.out.println("请输入合适的类型");
			return null;
		}
	}
}

```

```java
import org.junit.Test;

public class CommonFactoryPatternTest {

	@Test
	public void testSend() {
		
		SenderFactory senderFactory = new SenderFactory();
		
		senderFactory.produce("TCP").send();
		senderFactory.produce("FTP").send();
		senderFactory.produce("HTTP").send();
	}
}

```
### 多个工厂方法模式
是对普通工厂方法模式的改进，在普通工厂方法模式中，如果传递的字符串出错，则不能正确创建对象，而多个工厂方法模式是提供多个工厂方法，分别创建对象。

代码示例如下：
除了工厂类和测试类与普通工厂方法模式代码不同，其他均相同。

```java
public class SenderFactory {
	public Sender getTCPSender() {
		return new TCPSender();
	}
	public Sender getHTTPSender() {
		return new HTTPSender();
	}
	public Sender getFTPSender() { return new FTPSender(); }
}

```

```java
import org.junit.Test;

public class MutiFactoryMethodTest {

	@Test
	public void testSend() {
		
		SenderFactory senderFactory = new SenderFactory();
		senderFactory.getFTPSender().send();
		senderFactory.getTCPSender().send();
		senderFactory.getHTTPSender().send();
	}
}

```

### 静态工厂模式

```java
public class SenderFactory {
	
	public static Sender getTCPSender() {
		return new TCPSender();
	}
	public static Sender getHTTPSender() {
		return new HTTPSender();
	}
	public static Sender getFTPSender() {
		return new FTPSender();
	}
}

```

```java
public class StaticFactoryTest {
	
	public static void main(String[] args) {
		
		SenderFactory.getFTPSender().send();
		SenderFactory.getTCPSender().send();
		SenderFactory.getHTTPSender().send();
	}
}

```