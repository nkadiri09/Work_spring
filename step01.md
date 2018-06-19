# spring-maven

## BeanFactory VS ApplicationContext
BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
// place the spring.xml document in main directory
ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");  
// place the spring.xml in src directory.


BeanFactory is also called basic IOC and ApplicationContext is called Advanced IOC. Although BeanFactory and ApplicationContext both are used to get the beans from IOC container by using method getBean(String beanName). But they have some significant differences in their implementation which are described as below :

  1. BeanFactory uses lazy initialization approach whereas ApplicationContext uses eager initialization approach.
  i.e BeanFactory creates a singleton bean only when it is requested from it but ApplicationContext creates all singleton beans at the time of its own initialization.
  2. ApplicationContext supports internationalization but BeanFactory do not.
  3. Annotation based dependency Injection is not supported by BeanFactory whereas ApplicationContext supports using annotation @PreDestroy, @Autowired.
