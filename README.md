# LetspartyServer
1.为了避免maven长时间下载依赖包，可以解压repository.zip到用户目录下的.m2文件夹，repository.zip下载地址：http://pan.baidu.com/s/1eQYtjFk
    测试通过Maven版本下载地址：http://pan.baidu.com/s/1o7tb7U6,需要解压以后添加环境变量
2.Build and run 
  Maven: 
    mvn spring-boot:run 
	or 
    mvn clean package;java -jar target/gs-rest-service-0.1.0.jar
