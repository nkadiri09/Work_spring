# Spring Lifecycle Callbacks

## InitializingBean, DisposableBean.

  InitializingBean and DisposableBean are two marker interfaces, a useful way for Spring to perform certain actions upon bean initialization and destruction.

  1. For bean implemented InitializingBean, it will run afterPropertiesSet() after all bean properties have been set.
  2. For bean implemented DisposableBean, it will run destroy() after Spring container is released the bean.
  
  
## other than sprign declaration in java

create a method in any bean and mention the bean in the spring.xml as a parameter init-method="yourMethod" simpilar for destrodi method also.

for example:

    public class Triangle {

      private Point point1;
      private Point point2;
      private Point point3;
      // setter getters
      
      public void myInit(){
      System.out.println("init method called");
      }
      
      public void myDestroy(){
      System.out.println("destryo method called");
      }}
      
      and mentioned in spring.xml
      
      <bean id="triangle" class="com.naren.kadiri.Triangle" init-method="myInin" destroy-method="mydestroy">
		    <property name="point1" ref="pointA" />
      </bean>
      
so this two mehtods will call befor the initialization of the bean and destroy of the bean.
      
if we declare the default inti-mehtod and destroy-method in the  **_parent tag beans_** so it will be applicable to ath all beans with that name
      
      
      
