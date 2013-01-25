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
fix sidebar

TODO
item 分割2個表
財務結算






