# itest
A simple test bar !


###Maven
```xml
<dependency>
	<groupId>com.importsource.itest</groupId>
	<artifactId>importsource-itest</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```


###Hello World
```java
/**
 * @author Hezf
 */
@Test
public class FirstTest {
	@Test
	public void save() {
		//System.out.println("你好");
		Assert.assertTrue("你好"!=null);
	}

	@Test
	public String get() {
		//System.out.println("你好");
		Assert.assertTrue("你好"!=null);
		return "你好";
	}
	
	@Test
	public String get1() {
		//System.out.println("你好");
		Assert.assertTrue("你好"==null);
		return "你好";
	}
	
	@Test
	public String get2() {
		//System.out.println("你好");
		Assert.assertTrue("你好"==null);
		return "你好";
	}
}

```

###Create main class
```java
public class Demo {
	public static void main(String[] args) {
        Itest.startTest(Demo.class);
	}
}

```

All is ok!
