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
              <username>admin</username>
              <password>syphan</password>
            </server>
          </servers>
    </settings>
```
##




