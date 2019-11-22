- [Dubbo](https://dubbo.apache.org)
- [Zookeeper](https://zookeeper.apache.org)
- [Nexus](https://www.sonatype.com/product-nexus-repository)

## config file m2.setting.xml (nếu chưa có file thì phải tạo mới) để gói đẩy file .jar vào nexus.
```$xslt
    <settings xmlns="http://maven.apache.org/SETTINGS/1.1.0"
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.1.0 http://maven.apache.org/xsd/settings-1.1.0.xsd">
        <servers>
            <server>
              <id>nexus-snapshot</id>
              <username>admin</username> //tai khoan admin nesus
              <password>syphan</password>
            </server>
          </servers>
    </settings>
```
## config file pom.xml để đẩy file jar vào nexus
```$xslt
<profiles>
        <profile>
            <id>dev</id>
            <activation>
                <activeByDefault>true</activeByDefault>
            </activation>

            <distributionManagement>
                <snapshotRepository>
                    <id>nexus-snapshot</id>    //id này trùng với id trong file setting.xml
                    <name>maven-snapshots</name>
                    <url>http://localhost:8800/repository/maven-snapshots/</url>
                </snapshotRepository>
            </distributionManagement>
        </profile>

    </profiles>
```

## chạy lệnh mvn deploy để đẩy file vào nexus



