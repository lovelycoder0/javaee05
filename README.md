# javaee05
一、servlet注册：
在DispatcherServlet类中有一个initStrategies方法,在这个方法中初始化整个SpringMVC框架的初始化,包括其中的http请求映射关系。
二、Ioc容器创建：
IOC容器初始化过程分为定位、载入、注册
（1）定位是根据Resource来完成，
（2）载入是根据BeanDefinitionReader，
（3）剩下就是注册，注册是根据ListableBeanFactory。
三、MVC的流程：
首先用户通过HTTP请求到服务器，服务器会根据你的url来将请求转到不同的控制器Controller。这是第一步，具体需要做的是在web.xml中设置URLpattern映射到spring的DispatcherServlet，这是控制器是负责第一道处理，用来转发请求的，它会将请求转发到合适的Controller上。


使用 Spring IoC 管理对象
jdbc包中的类使用@Configuration注册为Bean，使用@Autowired装配实体类对象
servlet相关类，使用 @Autowired 装配jdbc的相关类的对象
