# How to access ApplicationContext inside a java bean?

    To get access to ApplicationContext we should implement ApplicationContextAware interface in the respective java bean. It has a method
    void setApplicationContext(ApplicationContext applicationContext)
                               throws BeansException

## Bean Scopes:

     Singleton
     Prototype
     (WebAware Scopes)
     Request
     Session
     GlobalSession

## Parent Bean declaration:

    <?xml version="1.0" encoding="UTF-8"?>
    <!-- <!DOCTYPE beans PUBLIC "-//SPRING//DTD BEAN 2.0//EN" "http://www.springframework.org/dtd/spring-beans-2.0.dtd"> -->
    <beans xmlns="http://www.springframework.org/schema/beans"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
            http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd"
        xmlns:context="http://www.springframework.org/schema/context">

        <bean id="triangle" class="com.naren.kadiri.Triangle">
            <property name="point1" ref="pointA" />
        </bean>

        <bean id="parentTriangle" class="com.naren.kadiri.Triangle">
            <property name="point1" ref="pointA" />
        </bean>
        <bean id="triangle1" class="com.naren.kadiri.Triangle"
            parent="parentTriangle">
            <property name="point2" ref="pointB" />
            <property name="point3" ref="pointC" />
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

    </beans> 
