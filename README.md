# spring-boot-security-demo
整合spring-boot/spring-security/mybatis/freemarker的通用后台管理系统，实现了基础的用户/菜单/角色/权限功能，权限控制粒度在URL级别，可基于此项目直接开发自己的业务管理平台。  
演示站点：待续

## 相关博客
http://xxxx 

## 启动
+ git clone https://github.com/fp2952/spring-boot-security-demo.git
+ 导入maven项目，下载所需的依赖包 
+ mysql下创建数据库admin，初始化数据脚本（执行doc包下的base-data.sql文件）
+ 修改配置文件 application.yml
+ 启动 DemoApplication.java main方法
+ 访问 http://localhost:8080/
+ 用户名: sysadmin 密码: 000000  

## 技术栈
+ spring-boot
+ spring-security
+ mysql
+ mybatis
+ druid
+ freemarker
+ maven

## 登陆页
![avatar](/doc/login.png)

## 首页
image...

## 用户管理
image...

## 角色管理
image...

## 菜单管理
image...

## 注意
本项目依赖于[db-spring-boot-starter](http://www.baidu.com)(整合了 Mybatis、通用 Mapper、PageHelper 分页插件的 Spring Boot Starter 模块)，为方便快速构建，直接使用本地jar依赖，如下
```
 <!--本地jar,通用mapper,集成mybatis、druid、pagehelper分页-->
       <dependency>
            <groupId>com.github.peng</groupId>
            <artifactId>db-spring-boot-starter</artifactId>
            <version>1.0-SNAPSHOT</version>
            <scope>system</scope>
            <systemPath>${project.basedir}/src/main/lib/db-spring-boot-starter-1.0-SNAPSHOT.jar</systemPath>
        </dependency>
        <!--本地jar依赖-->
        <dependency>
            <groupId>com.github.peng</groupId>
            <artifactId>db-spring-boot-autoconfigure</artifactId>
            <version>1.0-SNAPSHOT</version>
            <scope>system</scope>
            <systemPath>${project.basedir}/src/main/lib/db-spring-boot-autoconfigure-1.0-SNAPSHOT.jar</systemPath>
        </dependency>
        <!--本地jar依赖-->
        <dependency>
            <groupId>com.github.peng</groupId>
            <artifactId>common</artifactId>
            <version>1.0-SNAPSHOT</version>
            <scope>system</scope>
            <systemPath>${project.basedir}/src/main/lib/common-1.0-SNAPSHOT.jar</systemPath>
        </dependency>
```


## 更新日志
2018-04-23 项目初始化  
2018-04-24 更新文档  
待续...