package org.commons.jconfig.configloader;

import java.io.File;
import java.io.IOException;

import org.commons.jconfig.configloader.ConfManCmd;
import org.testng.annotations.Test;


/**
 * The Configuration command line application.
 * 
 */
public class ConfManCmdTest {

    @Test
    public void testHelp() {
        // these test don't test much just validate that exceptions are not
        // raised
        String[] args = { "-help" };
        ConfManCmd.main(args);
    }

    @Test
    public void testSave() throws IOException {
        // these test don't test much just validate that exceptions are not
        // raised
        File file = File.createTempFile("ConfigCommandRunnerTest", ".json", new File("/tmp"));
        String[] args = { "-save", file.getAbsolutePath() };
        ConfManCmd.main(args);
        file = File.createTempFile("ConfigCommandRunnerTestPretty", ".json", new File("/tmp"));
        String[] args2 = { "-save", file.getAbsolutePath(), "-pretty" };
        ConfManCmd.main(args2);
    }

    @Test
    public void testList() {
        //these test don't test much just validate that exceptions are not
        //raised
         String[] args = { "-list" };
         ConfManCmd.main(args);
         String[] args2 = { "-list", "-pretty" };
         ConfManCmd.main(args2);
        String[] args3 = { "-save", "/tmp/jmx.json" };
        ConfManCmd.main(args3);
    }

}