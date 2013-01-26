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






