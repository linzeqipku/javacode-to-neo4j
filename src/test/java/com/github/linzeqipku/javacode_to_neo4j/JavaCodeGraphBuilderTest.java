package com.github.linzeqipku.javacode_to_neo4j;

import org.junit.Test;

import java.io.IOException;

public class JavaCodeGraphBuilderTest {

    private static final String GRAPH_DIR_PATH="E:/tmp/graphdb";
    private static final String SRC_DIR_PATH="D:/test/lucene-7.2.1";

    @Test
    public void testCodeGraphBuilder() throws IOException {
        JavaCodeGraphBuilder.process(GRAPH_DIR_PATH,SRC_DIR_PATH);
    }

}
