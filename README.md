# 打包说明
建议使用阿里云的maven仓库，方便快捷。
```xml
  <mirrors>     
	<!--阿里云镜像-->
    <mirror>  
      <id>alimaven</id>  
      <name>aliyun maven</name>  
      <url>http://maven.aliyun.com/nexus/content/groups/public/</url>  
      <mirrorOf>central</mirrorOf>
	</mirror>
  </mirrors>
```
jar包和maven plugins下载无压力。下载下来之后可以正常编译、打包。

# 单元测试
默认情况下好像运行不了；因为Shiro Realm里有个东西注入不了。TODO

# 部署说明
1. 创建数据库  
建议和jdbc.properties文件中已有数据保持一致；如果不一致，改一下配置文件使之保持一致。
2. 执行初始化SQL  
执行document/P2P.sql和document/P2P_2.sql。原始SQL中有部分语法问题，我已修正。
3. 发布到Tomcat上  
发布成功后即可访问，访问地址是http://localhost:8080/P2Ppro/。  
访问首页时应该会看到打印一堆日志出来。