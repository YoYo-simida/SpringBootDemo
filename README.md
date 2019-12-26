# SpringBootDemo
IDEA 部署 Spring Boot + Mybaits + Maven + Oracle 入门案例

 - 环境部署并不需要很大的难度，但是很考验动手能力和经验。
 - 刚开始学的时候，踩了不少坑，花了很多时间，于是总结了这篇文档，与大家一起共同学习。
 - 主要分为两部分
 	- 1 环境部署的思路、流程(博客: `https://blog.csdn.net/qq_34745941/article/details/98024556`)
 	- 2 项目源码案例（能自己跑起来，可以增大信心哦 `^_^`）
  
# 实现的功能
 - 数据库的增、删、改、查、调用存储过程
 
# 环境准备
 - 若想在本地运行，请修改以下文件
 - application.properties: 修改为你本地的 Oracle 用户名、等
 - 在该用户下创建 person 表和存储过程，参考源码中的 `请修改-person.sql`
