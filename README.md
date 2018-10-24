# dubbodemo
dubbo+zookeeper 测试demo

遇到的坑：reference注解注入服务提供者会空指针
解决办法：ComponentScan 注解扫描包
