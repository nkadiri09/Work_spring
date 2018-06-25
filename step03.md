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
