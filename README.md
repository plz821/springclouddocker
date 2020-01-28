# Demo Project for Spring Cloud Docker
本项目主要演示用Docker Compose编排Spring Cloud分布式应用。

## 模块说明
- common-model: 公用模型
- eureka-server: 注册中心
- provider-service: 服务提供者
- consumer-service: 服务消费者

## 使用方法
1. 克隆代码到本地，`git clone https://github.com/plz821/springclouddocker.git`。
2. 模块common-model目录下使用命令 `mvn clean install`。
3. 3个模块eureka-server、provider-service、consumer-service目录下使用命令 `mvn clean package -DskipTests`。
4. 项目目录下执行命令 `docker-compose build`，构建docker镜像
5. 项目目录下执行命令 `docker-compose up` 或 `docker-compose up -d`，启动docker镜像，-d表示后台运行不即时输出日志；
   或者 `docker-compose up -d --scale provider-service=3`，启动docker镜像，
   其中--scale provider-service=3表示3个provider-service镜像。
   注：如果某个服务需要扩容，则 docker-compose.yml 的这服务的port只能设置为单端口方式8010，而不能是8010:8010，
   因为这种方式在宿主机上无法同时绑定多个8010端口。
6. 浏览器上打开 http://localhost:8000 查看Eureka注册中心。
7. 浏览器上打开 http://localhost:9010/user/1 以RestTemplate方式访问服务提供者。
   或 http://localhost:9010/user/feign/1 以Feign方式访问服务提供者。