# Building exceptions

## Configuración

Hay que añadir las siguientes dependencias

### Slf4j


#### Dependencia

```xml
 <dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-log4j12</artifactId>
    <version>2.0.13</version>
</dependency>
```
#### log4j.xml

```xml
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE log4j:configuration SYSTEM "log4j.dtd">

<log4j:configuration debug="true">
    <appender name="fileAppender" class="org.apache.log4j.RollingFileAppender">
        <param name="File" value="out.log"/>
        <layout class="org.apache.log4j.PatternLayout">
            <param name="ConversionPattern" value="%d{yyyy-MM-dd HH:mm:ss} %-5p %c:%L - %m%n" />
        </layout>
    </appender>

    <appender name="consoleAppender" class="org.apache.log4j.ConsoleAppender">
        <param name="Target" value="System.out"/>
        <layout class="org.apache.log4j.PatternLayout">
            <param name="ConversionPattern" value="%d{yyyy-MM-dd HH:mm:ss} %-5p %c:%L - %m%n" />
        </layout>
    </appender>
    <root>
        <priority value="DEBUG" />
        <appender-ref ref="consoleAppender" />
        <appender-ref ref="fileAppender" />
    </root>
</log4j:configuration>
```

### Lobmok

Hay que cargar:

#### Propiedades

```xml
<lombok.version>1.18.30</lombok.version>
<maven-plugin.version>3.8.1</maven-plugin.version>
```

#### Dependencia

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>${lombok.version}</version>
    <scope>provided</scope>
</dependency>
```
#### Plugin

```xml
<build>
        <pluginManagement>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-compiler-plugin</artifactId>
                    <version>${maven-plugin.version}</version>
                    <configuration>
                        <annotationProcessorPaths>
                            <path>
                                <groupId>org.projectlombok</groupId>
                                <artifactId>lombok</artifactId>
                                <version>${lombok.version}</version>
                            </path>
                        </annotationProcessorPaths>
                    </configuration>
                </plugin>
            </plugins>
        </pluginManagement>
    </build>
```