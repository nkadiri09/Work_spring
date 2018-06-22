Configuring different instanse of beans:

## DrawingApp.java

        import org.springframework.*;
        public class DrawingApp {

          public static void main(String args[]) {

            // BeanFactory factory = new XmlBeanFactory(new
            // FileSystemResource("spring.xml"));
            ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
            Triangle triangle = (Triangle) factory.getBean("triangle");
            triangle.draw();
          }

        }

## Triangle.java
      public class Triangle {

        private final Logger logger = LoggerFactory.getLogger(Triangle.class);

        private Point point1;
        private Point point2;
        private Point point3;

        //Setter Getters

        public void draw() {
          logger.info("inside the draw method " + " its logging");
          System.out.println("Point1(" + getPoint1().getX() + " , " + getPoint1().getY()+")");
          System.out.println("Point2(" + getPoint2().getX() + " , " + getPoint2().getY()+")");
          System.out.println("Point3(" + getPoint3().getX() + " , " + getPoint3().getY()+")");
        }

      }
      
## spring.xml

        <bean id="triangle" class="com.naren.kadiri.Triangle">
          <property name="point1" ref="pointA"></property>
          <property name="point2" ref="pointB"></property>
          <property name="point3" ref="pointC"></property>
        </bean>

        <bean id="pointA" class="com.naren.kadiri.Point">
          <property name="x" value="20"></property>
          <property name="y" value="0"></property>
        </bean>
        <bean id="pointB" class="com.naren.kadiri.Point">
          <property name="x" value="0"></property>
          <property name="y" value="0"></property>
        </bean>
        <bean id="pointC" class="com.naren.kadiri.Point">
          <property name="x" value="0"></property>
          <property name="y" value="-10"></property>
        </bean>
        
## Configuring List of Beans

        <bean id="triangle" class="com.naren.kadiri.Triangle">
            <property name="points">
              <list>
                <ref bean="pointA" />
                <ref bean="pointB" />
                <ref bean="pointC" />
              </list>
            </property>
          </bean>
          <bean id="pointA" class="com.naren.kadiri.Point">
            <property name="x" value="20"></property>
            <property name="y" value="0"></property>
          </bean>
          <bean id="pointB" class="com.naren.kadiri.Point">
            <property name="x" value="0"></property>
            <property name="y" value="0"></property>
          </bean>
          <bean id="pointC" class="com.naren.kadiri.Point">
            <property name="x" value="0"></property>
            <property name="y" value="-10"></property>
          </bean>
          
 ## Triangle.java
 
 public class Triangle {

	private final Logger logger = LoggerFactory.getLogger(Triangle.class);

	private List<Point> points;

	// setter getter

	public void draw() {
		logger.info("inside the draw method " + " its logging");
		System.out.println("Point1(" + getPoints().get(0).getX() + " , " + getPoints().get(0).getY() + ")");
		System.out.println("Point2(" + getPoints().get(1).getX() + " , " + getPoints().get(1).getY() + ")");
		System.out.println("Point3(" + getPoints().get(2).getX() + " , " + getPoints().get(2).getY() + ")");

	}

}

