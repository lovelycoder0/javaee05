# javaee05
一、servlet注册：
spring mvc
使用 Spring IoC 管理对象
core包中的实体类均使用@Configuration注册为Bean
jdbc包与core包中的实体类注册相同，使用@Configuration注册为Bean，使用@Autowired装配实体类对象
servlet相关类，使用 @Autowired 装配jdbc的相关类的对象
