# javacode-to-neo4j

Parse java source code, extract code entities (classes, interfaces, methods and fields) and static dependencies (inheritance, invocation, decleration, etc.), then store them into a neo4j graph database.

### Usage example

``
JavaCodeGraphBuilder.process(GRAPH_DIR_PATH,SRC_DIR_PATH);
``

see [the test case](https://github.com/linzeqipku/javacode-to-neo4j/blob/master/src/test/java/com/github/linzeqipku/javacode_to_neo4j/JavaCodeGraphBuilderTest.java).

### Maven

Add this repository in your ``pom.xml`` file:

```
<repositories>
    <repository>
        <id>linzeqipku-public-snapshots</id>
        <url>https://raw.github.com/linzeqipku/maven-repo/master/snapshots</url>
    </repository>
    <repository>
        <id>linzeqipku-public-releases</id>
        <url>https://raw.github.com/linzeqipku/maven-repo/master/releases</url>
    </repository>
</repositories>
```

Add the maven dependence:

```
<dependencies>
    <dependency>
        <groupId>com.github.linzeqipku</groupId>
        <artifactId>javacode-to-neo4j</artifactId>
        <version>1.1-SNAPSHOT</version>
    </dependency>
</dependencies>
```
