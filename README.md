ZooKeeper作为一个分布式服务的提供者，就有很多玩法了。

分布式锁：无非是对一个ZNode做监控（或者说对一个path），根据这个path是否存在就可以做一个锁了。

消费队列：生产者往path里添加，消费者直接消费path里的children节点，还可以根据顺序号完成FIFO，FILO之类的操作。

分布式服务：提供分布式中消费者和生产者的信息，根据这些信息去消费信息。

待续...

---

现在网上对于详细系统的Zookeeper教程较少，于是自己想着来写一个，其实也是结合官方英文文档进行学习，计划将覆盖Zookeeper配置使用，结合Java实现一些案例，源码解读，以及最终与dubbo等进行结合部署一个分布式系统。

一：[ Zookeeper教程(一)：快速开始以及结合java实现分布式Barrier和Queue][1]
二：[ Zookeeper教程(二):ZooKeeper与Dubbo结合以及原理讲解][2]
三：[Zookeeper教程(三):ZooKeeper源码阅读之Worker机制及集群状态监控][3]


  [1]: http://blog.csdn.net/killuazoldyck/article/details/72773873
  [2]: http://blog.csdn.net/killuazoldyck/article/details/72804280
  [3]: http://blog.csdn.net/killuazoldyck/article/details/72832413