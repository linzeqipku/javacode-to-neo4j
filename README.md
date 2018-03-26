# javacode-to-neo4j

Parse java source code, extract code entities (classes, interfaces, methods and fields) and static dependencies (inheritance, invocation, decleration, etc.), then store them into a neo4j graph database.

Usage example:

``
JavaCodeGraphBuilder.process(GRAPH_DIR_PATH,SRC_DIR_PATH);
``

see [the test case](https://github.com/linzeqipku/javacode-to-neo4j/blob/master/src/test/java/com/github/linzeqipku/javacode_to_neo4j/JavaCodeGraphBuilderTest.java).
