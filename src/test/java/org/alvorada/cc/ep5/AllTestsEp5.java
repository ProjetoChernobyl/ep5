package org.alvorada.cc.ep5;

import org.alvorada.cc.ep5.domain.NodeTest;
import org.alvorada.cc.ep5.io.ReaderTest;
import org.alvorada.cc.ep5.io.WriterTest;
import org.alvorada.cc.ep5.lists.LinkedListTest;
import org.alvorada.cc.ep5.lists.StructBuilderTest;
import org.alvorada.cc.ep5.util.ToolsTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MainTest.class, ToolsTest.class, LinkedListTest.class, StructBuilderTest.class, NodeTest.class,
		WriterTest.class, ReaderTest.class })
public class AllTestsEp5 {

}
