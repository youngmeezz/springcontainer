package kr.co.itcen.springcontainer.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.itcen.springcontainer.user.User;

public class ContainerTest {

	public static void main(String[] args) {
//		testBeanFactory();
		testApplicationContext();
	}
	
	//종류2 ApplicationContext
	public static void testApplicationContext() {
		ApplicationContext appCtxt = new ClassPathXmlApplicationContext("config/user/applicationContext01.xml");
		
		// error : 같은 타입의 빈이 1개 이상 있는 경우
		//			타입으로 가져오면 에러가 발생.
		//User user1 = appCtxt.getBean(User.class);
		
		// id로 가져 오기
		User user1 = (User)appCtxt.getBean( "user1" );
		System.out.println(user1);
		
		// name으로 가져오기
		User usr2 = (User)appCtxt.getBean("usr2");
		System.out.println(usr2);
		
		// singletone 확인 id로 가져와서 
		User user2 = (User)appCtxt.getBean("user2");
		System.out.println(usr2 == user2);
		
		// User(Long, String)으로 생성된 빈 가져오기 기본생성자 아닌 다른 applicationContext에서 설정방법
		User user3 = (User)appCtxt.getBean("user3");
		System.out.println(user3);
		
		// User() 으로 생성되고 프로퍼티 세팅을 한 (setter) 빈 가져오기
		User user4 = (User)appCtxt.getBean("user4");
		System.out.println(user4);
		
		// DI 설정한 빈 가져오기1
		User user5 = (User)appCtxt.getBean("user5");
		System.out.println(user5);
		
		// DI 설정한 빈 가져오기2
		User user6 = (User)appCtxt.getBean("user6");
		System.out.println(user6);
		
		
		((ConfigurableApplicationContext)appCtxt).close();
	}
	
	
	
	
	
	
	//종류1 container  BeanFactory (현장에서 x)
//	public static void testBeanFactory() {
//		BeanFactory bf1 = new XmlBeanFactory(new ClassPathResource("config/user/applicationContext01.xml"));
//		User user = bf1.getBean(User.class);
//		System.out.println(user);
		
		
//		BeanFactory bf2 = new XmlBeanFactory(new ClassPathResource("config/user/applicationContext02.xml"));
//		user = bf2.getBean(User.class);
//		System.out.println(user);
//		
//	}

}
