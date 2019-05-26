## disconf-client-demo 说明文档
### 1. disconf web 项目部署准备
#### 1.1 disconf-web war包构建
disconf 父pom修改
```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.baidu.disconf</groupId>
    <artifactId>disconf-base</artifactId>
    <version>2.6.36</version>
    <packaging>pom</packaging>

    <modules>
        <module>disconf-client</module>
        <module>disconf-core</module>
    </modules>

    <inceptionYear>2015</inceptionYear>
    <licenses>
        <license>
            <name>Apache 2</name>
            <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
            <distribution>repo</distribution>
            <comments>A business-friendly OSS license</comments>
        </license>
    </licenses>

    <properties>
        <!-- 模块版本号 -->
        <disconf-core.version>2.6.36</disconf-core.version>
        <disconf-client.version>2.6.36</disconf-client.version>
        <disconf-client-spring.version>2.6.36</disconf-client-spring.version>

        <!-- Spring項目配置 -->
        <encoding>UTF-8</encoding>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        <maven.compiler.encoding>UTF-8</maven.compiler.encoding>

        <!-- JAVA环境 -->
        <java.version>1.6</java.version>
        <source.version>1.6</source.version>
        <target.version>1.6</target.version>
        <spring.version>4.1.7.RELEASE</spring.version>
        <spring.amqp.version>1.4.5.RELEASE</spring.amqp.version>
        <junit.version>4.10</junit.version>
        <jsp.version>2.0</jsp.version>
        <servlet.version>2.5</servlet.version>
        <cglib.version>2.2.2</cglib.version>

        <!-- resource path -->
        <project.build.online.sourceDir>${project.basedir}/src/main/online-resources</project.build.online.sourceDir>
        <project.build.offline.sourceDir>${project.basedir}/src/main/resources</project.build.offline.sourceDir>

    </properties>

    <dependencyManagement>
        <dependencies>

            <!-- common dependencies -->

            <dependency>
                <groupId>org.aopalliance</groupId>
                <artifactId>com.springsource.org.aopalliance</artifactId>
                <version>2.5.6</version>
            </dependency>

            <dependency>
                <groupId>javax.mail</groupId>
                <artifactId>mail</artifactId>
                <version>1.4.7</version>
            </dependency>

            <dependency>
                <groupId>redis.clients</groupId>
                <artifactId>jedis</artifactId>
                <version>2.1.0</version>
            </dependency>

            <dependency>
                <groupId>cglib</groupId>
                <artifactId>cglib</artifactId>
                <version>2.2.2</version>
            </dependency>

            <dependency>
                <groupId>c3p0</groupId>
                <artifactId>c3p0</artifactId>
                <version>0.9.1.2</version>
            </dependency>

            <dependency>
                <groupId>com.google.code.gson</groupId>
                <artifactId>gson</artifactId>
                <version>2.2.4</version>
            </dependency>

            <dependency>
                <groupId>commons-beanutils</groupId>
                <artifactId>commons-beanutils</artifactId>
                <version>1.6</version>
            </dependency>

            <dependency>
                <groupId>commons-collections</groupId>
                <artifactId>commons-collections</artifactId>
                <version>3.2</version>
            </dependency>

            <dependency>
                <groupId>commons-dbcp</groupId>
                <artifactId>commons-dbcp</artifactId>
                <version>1.2.1</version>
            </dependency>

            <dependency>
                <groupId>commons-digester</groupId>
                <artifactId>commons-digester</artifactId>
                <version>1.6</version>
            </dependency>

            <dependency>
                <groupId>commons-fileupload</groupId>
                <artifactId>commons-fileupload</artifactId>
                <version>1.2.1</version>
            </dependency>

            <dependency>
                <groupId>commons-io</groupId>
                <artifactId>commons-io</artifactId>
                <version>1.4</version>
            </dependency>

            <dependency>
                <groupId>org.apache.commons</groupId>
                <artifactId>commons-lang3</artifactId>
                <version>3.4</version>
            </dependency>

            <dependency>
                <groupId>javax.servlet</groupId>
                <artifactId>servlet-api</artifactId>
                <version>${servlet.version}</version>
                <scope>provided</scope>
            </dependency>

            <dependency>
                <groupId>javax.servlet.jsp</groupId>
                <artifactId>jsp-api</artifactId>
                <version>${jsp.version}</version>
                <scope>provided</scope>
            </dependency>

            <dependency>
                <groupId>org.apache.zookeeper</groupId>
                <artifactId>zookeeper</artifactId>
                <version>3.3.6</version>
                <exclusions>
                    <exclusion>
                        <groupId>com.sun.jmx</groupId>
                        <artifactId>jmxri</artifactId>
                    </exclusion>
                    <exclusion>
                        <groupId>com.sun.jdmk</groupId>
                        <artifactId>jmxtools</artifactId>
                    </exclusion>
                    <exclusion>
                        <groupId>javax.jms</groupId>
                        <artifactId>jms</artifactId>
                    </exclusion>
                </exclusions>
            </dependency>

            <dependency>
                <groupId>commons-logging</groupId>
                <artifactId>commons-logging</artifactId>
                <version>1.0.4</version>
            </dependency>

            <dependency>
                <groupId>commons-logging</groupId>
                <artifactId>commons-logging-api</artifactId>
                <version>1.0.4</version>
            </dependency>

            <dependency>
                <groupId>commons-net</groupId>
                <artifactId>commons-net</artifactId>
                <version>1.4.1</version>
            </dependency>

            <dependency>
                <groupId>commons-pool</groupId>
                <artifactId>commons-pool</artifactId>
                <version>1.4</version>
            </dependency>

            <dependency>
                <groupId>net.sf.ehcache</groupId>
                <artifactId>ehcache</artifactId>
                <version>2.7.4</version>
            </dependency>

            <dependency>
                <groupId>javax.annotation</groupId>
                <artifactId>javax.annotation</artifactId>
                <version>1.0.0.v20100513-0750</version>
            </dependency>

            <dependency>
                <groupId>javax.xml</groupId>
                <artifactId>javax.xml</artifactId>
                <version>1.3.4.v201005080400</version>
            </dependency>

            <dependency>
                <groupId>com.fasterxml.jackson.core</groupId>
                <artifactId>jackson-core</artifactId>
                <version>2.6.0</version>
            </dependency>

            <dependency>
                <groupId>org.freemarker</groupId>
                <artifactId>freemarker</artifactId>
                <version>2.3.20</version>
            </dependency>

            <dependency>
                <groupId>com.fasterxml.jackson.core</groupId>
                <artifactId>jackson-databind</artifactId>
                <version>2.6.0</version>
            </dependency>

            <dependency>
                <groupId>mysql</groupId>
                <artifactId>mysql-connector-java</artifactId>
                <version>5.1.6</version>
            </dependency>

            <dependency>
                <groupId>com.google.protobuf</groupId>
                <artifactId>protobuf-java</artifactId>
                <version>2.5.0</version>
            </dependency>

            <dependency>
                <groupId>net.sf.supercsv</groupId>
                <artifactId>super-csv</artifactId>
                <version>2.1.0</version>
            </dependency>

            <dependency>
                <groupId>javax.validation</groupId>
                <artifactId>validation-api</artifactId>
                <version>1.1.0.Final</version>
            </dependency>

            <dependency>
                <groupId>javax.annotation</groupId>
                <artifactId>javax.annotation-api</artifactId>
                <version>1.2</version>
            </dependency>

            <dependency>
                <groupId>org.projectlombok</groupId>
                <artifactId>lombok</artifactId>
                <version>1.14.4</version>
            </dependency>

            <dependency>
                <groupId>org.ostermiller</groupId>
                <artifactId>utils</artifactId>
                <version>1.07.00</version>
            </dependency>

            <dependency>
                <groupId>com.google.guava</groupId>
                <artifactId>guava</artifactId>
                <version>19.0-rc2</version>
            </dependency>

            <dependency>
                <groupId>commons-codec</groupId>
                <artifactId>commons-codec</artifactId>
                <version>1.9</version>
            </dependency>

            <dependency>
                <groupId>org.mortbay.jetty</groupId>
                <artifactId>jetty-util</artifactId>
                <version>6.1.14</version>
            </dependency>

            <!-- spring -->

            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-context</artifactId>
                <version>${spring.version}</version>
            </dependency>

            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-context-support</artifactId>
                <version>${spring.version}</version>
            </dependency>

            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-aop</artifactId>
                <version>${spring.version}</version>
            </dependency>

            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-core</artifactId>
                <version>${spring.version}</version>
            </dependency>

            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-jms</artifactId>
                <version>${spring.version}</version>
            </dependency>

            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-instrument-tomcat</artifactId>
                <version>${spring.version}</version>
            </dependency>

            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-tx</artifactId>
                <version>${spring.version}</version>
            </dependency>

            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-aspects</artifactId>
                <version>${spring.version}</version>
            </dependency>

            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-beans</artifactId>
                <version>${spring.version}</version>
            </dependency>

            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-expression</artifactId>
                <version>${spring.version}</version>
            </dependency>

            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-instrument</artifactId>
                <version>${spring.version}</version>
            </dependency>

            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-tomcat</artifactId>
                <version>${spring.version}</version>
            </dependency>

            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-jdbc</artifactId>
                <version>${spring.version}</version>
            </dependency>

            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-orm</artifactId>
                <version>${spring.version}</version>
            </dependency>

            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-oxm</artifactId>
                <version>${spring.version}</version>
            </dependency>

            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-web</artifactId>
                <version>${spring.version}</version>
            </dependency>

            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-webmvc</artifactId>
                <version>${spring.version}</version>
            </dependency>

            <!-- test dependencies -->

            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-test</artifactId>
                <version>${spring.version}</version>
            </dependency>

            <dependency>
                <groupId>com.h2database</groupId>
                <artifactId>h2</artifactId>
                <version>1.3.174</version>
                <scope>test</scope>
            </dependency>

            <dependency>
                <groupId>com.googlecode.jmockit</groupId>
                <artifactId>jmockit</artifactId>
                <version>1.5</version>
                <scope>test</scope>
            </dependency>

            <dependency>
                <groupId>com.googlecode.jmockit</groupId>
                <artifactId>jmockit-coverage</artifactId>
                <version>0.999.24</version>
                <scope>test</scope>
            </dependency>

            <dependency>
                <groupId>junit</groupId>
                <artifactId>junit</artifactId>
                <version>${junit.version}</version>
                <scope>test</scope>
            </dependency>

            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-test</artifactId>
                <version>${spring.version}</version>
                <scope>test</scope>
            </dependency>

            <dependency>
                <groupId>junit</groupId>
                <artifactId>junit-dep</artifactId>
                <version>4.11</version>
                <scope>test</scope>
            </dependency>

            <dependency>
                <groupId>org.mortbay.jetty</groupId>
                <artifactId>jetty</artifactId>
                <version>6.1.14</version>
            </dependency>

            <dependency>
                <groupId>org.hibernate</groupId>
                <artifactId>hibernate-validator</artifactId>
                <version>5.0.1.Final</version>
            </dependency>

            <dependency>
                <groupId>org.aspectj</groupId>
                <artifactId>aspectjtools</artifactId>
                <version>1.7.4</version>
            </dependency>

            <!-- log -->

            <dependency>
                <groupId>org.slf4j</groupId>
                <artifactId>slf4j-nop</artifactId>
                <version>1.7.6</version>
            </dependency>

            <dependency>
                <groupId>org.slf4j</groupId>
                <artifactId>slf4j-api</artifactId>
                <version>1.7.6</version>
            </dependency>

            <dependency>
                <groupId>ch.qos.logback</groupId>
                <artifactId>logback-core</artifactId>
                <version>1.0.9</version>
            </dependency>

            <dependency>
                <groupId>ch.qos.logback</groupId>
                <artifactId>logback-classic</artifactId>
                <version>1.0.9</version>
            </dependency>

            <dependency>
                <groupId>log4j</groupId>
                <artifactId>log4j</artifactId>
                <version>1.2.14</version>
                <exclusions>
                    <exclusion>
                        <groupId>com.sun.jmx</groupId>
                        <artifactId>jmxri</artifactId>
                    </exclusion>
                    <exclusion>
                        <groupId>com.sun.jdmk</groupId>
                        <artifactId>jmxtools</artifactId>
                    </exclusion>
                    <exclusion>
                        <groupId>javax.jms</groupId>
                        <artifactId>jms</artifactId>
                    </exclusion>
                </exclusions>
            </dependency>

            <dependency>
                <groupId>com.github.tomakehurst</groupId>
                <artifactId>wiremock</artifactId>
                <version>1.46</version>
                <scope>test</scope>
                <!-- Include this if you have dependency conflicts for Guava,
                    Jetty, Jackson or Apache HTTP Client -->
                <classifier>standalone</classifier>
            </dependency>

            <dependency>
                <groupId>org.slf4j</groupId>
                <artifactId>slf4j-log4j12</artifactId>
                <version>1.4.3</version>
            </dependency>

        </dependencies>
    </dependencyManagement>


    <!-- 构建 -->
    <build>
        <resources>
            <resource>
                <directory>${project.basedir}/src/main/java</directory>
                <excludes>
                    <exclude>**/*.java</exclude>
                </excludes>
            </resource>
            <resource>
                <directory>${project.basedir}/src/main/resources</directory>
                <includes>
                    <include>**/*.*</include>
                </includes>
            </resource>
        </resources>

        <finalName>disconf-base</finalName>

        <!-- 覆盖率 mvn test -->
        <plugins>
          <!--  <plugin>
                <groupId>org.codehaus.mojo</groupId>
                <artifactId>cobertura-maven-plugin</artifactId>
                <version>2.6</version>
                <configuration>
                    <formats>
                        <format>xml</format>
                        <format>html</format>
                    </formats>
                    <aggregate>true</aggregate>
                    <instrumentation>
                        <excludes>
                            <exclude>**/*Proto.class</exclude>
                            <exclude>**/*Proto$*.class</exclude>
                            <exclude>**/*Test.class</exclude>
                            <exclude>**/*Controller.class</exclude>
                            <exclude>**/*Vo.class</exclude>
                            <exclude>**/*Form.class</exclude>
                        </excludes>
                    </instrumentation>
                </configuration>
                <executions>
                    <execution>
                        <phase>package</phase>
                        <goals>
                            <goal>cobertura</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>-->

            <!-- 编译 -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>2.3.1</version>
                <configuration>
                    <source>${source.version}</source>
                    <target>${target.version}</target>
                    <encoding>${encoding}</encoding>
                    <failOnError>true</failOnError>
                    <showDeprecation>true</showDeprecation>
                    <showWarnings>true</showWarnings>
                    <compilerArguments>
                        <verbose/>
                        <bootclasspath>${java.home}/lib/rt.jar</bootclasspath>
                    </compilerArguments>
                </configuration>

<!--                <dependencies>
                    <dependency>
                        <groupId>org.codehaus.plexus</groupId>
                        <artifactId>plexus-compiler-javac</artifactId>
                        <version>1.8.1</version>
                    </dependency>
                </dependencies>-->
            </plugin>

            <!-- JAR包 -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-jar-plugin</artifactId>
                <version>2.4</version>
            </plugin>

            <!-- war包 -->
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-war-plugin</artifactId>
                <version>2.1.1</version>
                <configuration>
                    <webXml>${project.basedir}/src/main/webapp/WEB-INF/web.xml</webXml>
                </configuration>
            </plugin>

            <!-- embedded web servers -->
            <plugin>
                <groupId>org.mortbay.jetty</groupId>
                <artifactId>maven-jetty-plugin</artifactId>
                <version>6.1.10</version>
            </plugin>

            <plugin>
                <groupId>org.apache.tomcat.maven</groupId>
                <artifactId>tomcat6-maven-plugin</artifactId>
                <version>2.0</version>
            </plugin>

            <!-- auto deploy plugin -->
            <!--<plugin>
                <groupId>org.codehaus.cargo</groupId>
                <artifactId>cargo-maven2-plugin</artifactId>
                <version>1.2.0</version>
            </plugin>-->

            <!-- 单测 -->
<!--            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>2.5</version>
                <configuration>
                    <argLine>-Dfile.encoding=UTF-8</argLine>
                    <includes>
                        <include>**/*TestCase.java</include>
                    </includes>
                    <excludes>
                        <exclude>**/*ServiceTest.java</exclude>
                        <exclude>**/TempDaoTest.java</exclude>
                    </excludes>
                </configuration>
            </plugin>-->

            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-source-plugin</artifactId>
                <executions>
                    <execution>
                        <id>attach-sources</id>
                        <goals>
                            <goal>jar</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>

            <!-- 为了github的测试覆盖率 -->
            <!--<plugin>
                <groupId>org.eluder.coveralls</groupId>
                <artifactId>coveralls-maven-plugin</artifactId>
                <version>3.1.0</version>
            </plugin>-->

           <!-- <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-javadoc-plugin</artifactId>
                <executions>
                    <execution>
                        <id>attach-javadocs</id>
                        <goals>
                            <goal>jar</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>-->

        </plugins>
    </build>

  <!--  <developers>
        <developer>
            <name>Liao Qiqi</name>
            <id>knightliao</id>
            <email>knightliao@gmail.com</email>
            <roles>
                <role>Developer</role>
            </roles>
            <timezone>+8</timezone>
        </developer>
    </developers>-->

  <!--  <organization>
        <name>KNIGHT</name>
        <url>http://www.liaoqiqi.com</url>
    </organization>

    <scm>
        <url>scm:git:git@github.com:knightliao/disconf</url>
        <connection>scm:git:git@github.com:knightliao/disconf</connection>
        <tag>disconf-base</tag>
    </scm>

    <url>https://github.com/knightliao/disconf</url>
    <name>disconf</name>
    <description>Distributed Configuration Management Platform.</description>-->

<!--    <profiles>
        <profile>
           &lt;!&ndash; <id>release</id>
            <distributionManagement>
                <snapshotRepository>
                    <id>nexus-release</id>
                    <url>https://oss.sonatype.org/content/repositories/snapshots/</url>
                </snapshotRepository>
                <repository>
                    <id>nexus-release</id>
                    <url>https://oss.sonatype.org/service/local/staging/deploy/maven2/</url>
                </repository>
            </distributionManagement>&ndash;&gt;
            <build>
                <plugins>
                    &lt;!&ndash; Source &ndash;&gt;
                    <plugin>
                        <groupId>org.apache.maven.plugins</groupId>
                        <artifactId>maven-source-plugin</artifactId>
                        <version>2.2.1</version>
                        <executions>
                            <execution>
                                <phase>package</phase>
                                <goals>
                                    <goal>jar-no-fork</goal>
                                </goals>
                            </execution>
                        </executions>
                    </plugin>
                    &lt;!&ndash; Javadoc &ndash;&gt;
                    <plugin>
                        <groupId>org.apache.maven.plugins</groupId>
                        <artifactId>maven-javadoc-plugin</artifactId>
                        <version>2.9.1</version>
                        <executions>
                            <execution>
                                <phase>package</phase>
                                <goals>
                                    <goal>jar</goal>
                                </goals>
                            </execution>
                        </executions>
                    </plugin>
                    <plugin>
                        <groupId>org.apache.maven.plugins</groupId>
                        <artifactId>maven-gpg-plugin</artifactId>
                        <version>1.5</version>
                        <executions>
                            <execution>
                                <id>sign-artifacts</id>
                                <phase>verify</phase>
                                <goals>
                                    <goal>sign</goal>
                                </goals>
                            </execution>
                        </executions>
                    </plugin>
                </plugins>
            </build>
        </profile>
    </profiles>-->
</project>
```
禁用掉doc,test生成部分依赖,然后执行mvn install构建

#### 1.2 disconf-web Linux部署环境配置
#### 1.2.1 nginx安装
以下为必要部分配置,具体安装请参考中引用的文章

必要路径创建
war包部署路径
```shell
mkdir  -p /home/work/dsp/disconf-rd/war
mkdir -p /home/work/var/logs/disconf
```

nginx.conf
```shell
   upstream disconf {
       server localhost:8015;#反向代理指向的tomcat端口
    }

    server {

    listen   8081;#浏览器访问端口
    server_name disconf.com;#该值与disconf-web中的application.properties中的domain=disconf.com,且application-demo.properties复制为application.properties
    access_log /home/work/var/logs/disconf/access.log;
    error_log /home/work/var/logs/disconf/error.log;

    location / {
        root /home/work/dsp/disconf-rd/war/html;
        if ($query_string) {
            expires max;
        }
    }

    location ~ ^/(api|export) {
        proxy_pass_header Server;
        proxy_set_header Host $http_host;
        proxy_redirect off;
        proxy_set_header X-Real-IP $remote_addr;
        proxy_set_header X-Scheme $scheme;
        proxy_pass http://disconf;
    }
   }

```
将构建好的war及相关文件放置到创建的路径/home/work/dsp/disconf-rd/war下
```shell
[root@centos-0 war]# ll
total 36188
-rwxr-xr-x. 1 root root 37049305 May 26 06:54 disconf-web.war
drwxr-xr-x. 7 root root     4096 May 25 01:20 html
drwxr-xr-x. 2 root root        6 May 25 01:20 META-INF
drwxr-xr-x. 4 root root       47 May 25 01:20 WEB-INF
[root@centos-0 war]# pwd
/home/work/dsp/disconf-rd/war
```
其中html,META-INF,WEB-INF目录需要中编译后的targat下拷贝到目录下

#### 1.2.2 tomcat 安装与配置
解压缩tomcat

修改server.xml

修改端口与nginx配置文件中的反向代理tomcat的端口一致
```xml
<Connector port="8015" protocol="HTTP/1.1"
               connectionTimeout="20000"
               redirectPort="8443" />
```

修改war指向路径

Context部分不要用官网的,否则请求是404找不到路径,这个是比较坑的
```xml
 <Host name="localhost"  appBase="webapps"
            unpackWARs="true" autoDeploy="true">

        <!-- SingleSignOn valve, share authentication between web applications
             Documentation at: /docs/config/valve.html -->
        <!--
        <Valve className="org.apache.catalina.authenticator.SingleSignOn" />
        -->

        <!-- Access log processes all example.
             Documentation at: /docs/config/valve.html
             Note: The pattern used is equivalent to using pattern="common" -->
        <Valve className="org.apache.catalina.valves.AccessLogValve" directory="logs"
               prefix="localhost_access_log" suffix=".txt"
               pattern="%h %l %u %t &quot;%r&quot; %s %b" />
        <Context path="/" docBase="/home/work/dsp/disconf-rd/war/disconf-web.war"></Context>
      </Host>
```
#### 1.2.3 redis安装
disconf 需要集群安装,具体参照disconf官方文档要求

单机模式下,是启动多个实例, 两个配置文件 通过redis-server 指向不同的conf就可以了

详细[参考]部分
#### 1.2.4 zookeeper安装
安装单机版即可

其他配置参照官方文档即可

### 参考
 [1] [disconf github地址,包括官方部署文档](https://github.com/knightliao/disconf)
 
 [2] [nginx安装参考](https://www.cnblogs.com/kaid/p/7640723.html)
 
 [3] [redis 单机版master/slave 模式](https://www.cnblogs.com/gisblogs/p/5008180.html)