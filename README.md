# Java 设计模式
设计模式（Design pattern）是一套被反复使用、多数人知晓的、经过分类编目的、代码设计经验的总结。使用设计模式是为了可重用代码、让代码更容易被他人理解、保证代码可靠性。 毫无疑问，设计模式于己于他人于系统都是多赢的，设计模式使代码编制真正工程化，设计模式是软件工程的基石，如同大厦的一块块砖石一样。项目中合理的运用设计模式可以完美的解决很多问题，每种模式在现在中都有相应的原理来与之对应，每一个模式描述了一个在我们周围不断重复发生的问题，以及该问题的核心解决方案，这也是它能被广泛应用的原因。

## 1. 设计模式的分类

总体来说设计模式分为三大类：

* 创建型模式，共五种：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式。

* 结构型模式，共七种：适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享元模式。

* 行为型模式，共十一种：策略模式、模板方法模式、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式。

其实还有两类：并发型模式和线程池模式。用一个图片来整体描述一下：

![我是图片](./src/main/resources/images/dp-all.png)

## 2. 工厂方法模式(Factory Method)
工厂方法模式分为三种
(1) 普通工厂模式
(2) 多个工厂方法模式
(3) 静态工厂方法模式

### 2.1 普通工厂方法
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
class SenderFactory {
	
	/**
	 * @param protocolType 协议类型
	 */
	Sender produce(String protocolType) {

		switch (protocolType) {
			case "TCP":
				return new TCPSender();
			case "FTP":
				return new FTPSender();
			case "HTTP":
				return new HTTPSender();
			default:
				System.out.println("请输入合适的类型");
				break;
		}
		return  null;
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
### 2.2 多个工厂方法模式
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

### 2.3 静态工厂方法模式
静态工厂方法模式就是在工厂类中的方法加上static关键字修饰，不再使用对象调用方法，而是直接使用类名直接条用方法。
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
import org.junit.Test;

public class StaticFactoryTest {

	@Test
	public void testSend() {
		SenderFactory.getFTPSender().send();
		SenderFactory.getTCPSender().send();
		SenderFactory.getHTTPSender().send();
	}
}

```
总体来说，工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，可以通过工厂方法模式进行创建。在以上的三种模式中，第一种如果传入的字符串有误，不能正确创建对象，第三种相对于第二种，不需要实例化工厂类，所以，大多数情况下，我们会选用第三种——静态工厂方法模式。

## 3. 抽象工厂方法模式
工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则，所以，从设计角度考虑，有一定的问题，如何解决？就用到抽象工厂模式，创建多个工厂类，这样一旦需要增加新的功能，直接增加新的工厂类就可以了，不需要修改之前的代码。抽象工厂方法模式的关键是创建多个工厂类。
以下为示例代码：

定义Sender接口
```java
public interface Sender {
	void send();
}

```

创建HTTPSender类并使用Sender接口
```java
public class HTTPSender implements Sender {

	@Override
	public void send() {
		System.out.println("HTTPSender send...");
	}

}
```
定义Provider接口
```java
public interface Provider {
	Sender produce();
}
```
创建HTTPSenderFactory类并使用Provider接口
```java
public class HTTPSenderFactory implements Provider {

	@Override
	public Sender produce() {
		return new HTTPSender();
	}
}
```
创建测试类AbstractFactoryTest,编写针对HTTPSender的测试类
```java
import org.junit.Test;

public class AbstractFactoryTest {
	
	@Test
	public void testHTTPSend() {
		Provider provider = new HTTPSenderFactory();
		Sender httpSender = provider.produce();
		httpSender.send();
	}
}
```

如果需要添加其他协议的代码支持，例如TCP协议，需要创建TCPSender类，再创建一个TCPSender对应的工厂类TCPSenderFactory类

```java
public class TCPSender implements Sender {

	@Override
	public void send() {
		System.out.println("TCPSender send...");
	}

}
```

```java
public class TCPSenderFactory implements Provider {
	
	@Override
	public Sender produce() {
		return new TCPSender();
	}
}
```

在测试类中添加testTCPSend方法
```java
public class AbstractFactoryTest {
	@Test
	public void testTCPSend() {
		Provider provider = new TCPSenderFactory();
		Sender tcpSender = provider.produce();
		tcpSender.send();
	}
}
```

## 4. 单例模式
这里暂时没有考虑多线程的情况，后面会补充进来
```java
package com.designpattern.creative.singleton;

public class Singleton {

	// 静态变量存储在方法区中
	private static Singleton instance = null;
	
	private Singleton() {
		
	}

	private static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}
	
	public static void main(String [] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println(instance1 == instance2);
	}
}


```

## 4. 建造者模式
工厂类模式提供的是创建单个类的模式，而建造者模式则是将各种产品集中起来进行管理，用来创建复合对象，所谓复合对象就是指某个类具有不同的属性，其实建造者模式就是前面抽象工厂模式和最后的Test结合起来得到的。我们看一下代码

```java
public interface Builder {
	
	 void buildPart1();
	
	 void buildPart2();
	
	 void buildPart3();
	
	 Product buildProduct();
}
```

```java
package com.designpattern.creative.builder;

public class Product {
	
	private String part1;
	
	private String part2;
	
	private String part3;

	
	public String getPart1() {
		return part1;
	}

	public String getPart2() {
		return part2;
	}

	public String getPart3() {
		return part3;
	}

	public void setPart1(String part1) {
		this.part1 = part1;
	}

	public void setPart2(String part2) {
		this.part2 = part2;
	}

	public void setPart3(String part3) {
		this.part3 = part3;
	}


	
}

```

```java
package com.designpattern.creative.builder;

public class ConcreteBuilder implements Builder {

	private Product product;
	
	public ConcreteBuilder() {
		product = new Product();
	}
	
	@Override
	public void buildPart1() {
		product.setPart1("创建part1");
		System.out.println("创建part1");

	}

	@Override
	public void buildPart2() {
		product.setPart2("创建part2");
		System.out.println("创建part2");

	}

	@Override
	public void buildPart3() {
		product.setPart3("创建part3");
		System.out.println("创建part3");
	}

	@Override
	public Product buildProduct() {
		return product;
	}

}

```

```java
package com.designpattern.creative.builder;

public class Director {

	private Product constructProduct(ConcreteBuilder concreteBuilder){
        concreteBuilder.buildPart1();
        concreteBuilder.buildPart2();
        concreteBuilder.buildPart3();
        return concreteBuilder.buildProduct();
    }
	
	private Product constructProduct1(ConcreteBuilder concreteBuilder){
        concreteBuilder.buildPart1();
        concreteBuilder.buildPart3();
        return concreteBuilder.buildProduct();
    }
	
	
}

```

```java
package com.designpattern.creative.builder;

import org.junit.Test;

public class BuilderTest {

	@Test
	public void testBuilder() {
		//new Director().constructProduct(new ConcreteBuilder());
		
		new Director().constructProduct1(new ConcreteBuilder());
	}
}

```