charitybuzz(https://github.com/yudady/charitybuzz)
=================================
jrebel.jar in web.lib
-javaagent:E:/tommyWork/charitybuzz/jrebel/jrebel.jar
=================================
install oracle jar in .m2
E:\>mvn install:install-file -Dfile=E:\tommyWork\charitybuzz\src\main\webapp\lib\ojdbc6.jar -DgroupId=com.oracle -DartifactId=ojdbc6 -Dversion=11.2.0 -Dpackaging=jar
		<dependency>
			<groupId>com.oracle</groupId>
			<artifactId>ojdbc6</artifactId>
			<version>11.2.0</version>
		</dependency>
=================================
mvn tomcat:run		(maven)
=================================
apache titles
js			webapp\resources\js\page\contact_us.js
jsp			webapp\WEB-INF\jsp\page\contactus\contact_us.jsp
tiles		webapp\WEB-INF\jsp\tiles-definitions.xml

=================================
Spring-DWR註解方式集成時，在不連網時報cvc-complex-type.2.4.c異常
問題在於Spring配置文件中申明xsi時引用http://www.directwebremoting.org/schema/spring-dwr-3.0.xsd
而本地DWR報中版本為spring-dwr-2.0.xsd，所以必須聯網才能找到該XSD定義，改成2就可以
http://www.directwebremoting.org/schema/spring-dwr http://www.directwebremoting.org/schema/spring-dwr-2.0.xsd
=================================
1.oracle (application.properties)
2.spring springjdbc
3.apache titles

=========================
1. 得標 :  win the bid
2. 流標 :  listed/re-listing the bid

3.另外常用在拍賣場上的英文

            下標 : place bid
            競標 : bidding
            結標 : end of bidding
            棄標 : non-paying bid (NPB)
            得標者 : winning bidder
=========================

TODO
財務結算
1.每分鐘結帳一次
2.確定得標者

關注
後台






