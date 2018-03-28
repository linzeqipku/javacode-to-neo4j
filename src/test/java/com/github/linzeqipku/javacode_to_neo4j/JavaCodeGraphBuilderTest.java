package com.github.linzeqipku.javacode_to_neo4j;

import org.junit.Test;

import java.io.IOException;

public class JavaCodeGraphBuilderTest {

    private static final String GRAPH_DIR_PATH="E:/dc/graph.db";
    private static final String SRC_DIR_PATH="E:/dc/data/sourcecode";

    @Test
    public void testCodeGraphBuilder() throws IOException {
        JavaCodeGraphBuilder.process(GRAPH_DIR_PATH,SRC_DIR_PATH);
    }

}
