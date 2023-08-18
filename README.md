#### 要点记录

1、pom下载依赖 spring-boot-starter-data-redis

2、新建redis配置类，必须要配置，否则容器找不到redis的Bean对象 无法使用，参考/config/RedisConfig

    - Configuration 标记为配置类，在Spring应用程序中，配置类通常用于定义和组织应用程序的配置和组件
    - Bean 它会告诉Spring容器将带有该注解的方法的返回值注册为一个bean，并使其可在应用程序的其他部分进行注入和使用。
3、配置文件
    - 目录： resources/application.yaml
    - 踩坑记录：springboot3.0 下，配置与之前不同，spring-data-redis 网上的文章大多是springboot2.0的配法 spring-redis

4、RedisTemplate
    - 是Spring Data Redis库提供的一个强大的Redis操作模板类。它封装了与Redis服务器的交互，并提供了一组方法用于执行常见的Redis操作，如存储、检索、更新和删除数据等
    - 具体用法参考test下示例