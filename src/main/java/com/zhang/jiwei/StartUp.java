package com.zhang.jiwei;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * @author jiwei.zhang
 * @DATE 2017/12/18 0018
 */
public class StartUp {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8088);
        WebAppContext context = new WebAppContext(System.getProperty("user.dir") + "/src/main/webapp", "/");
        context.setMaxFormContentSize(1024 * 1024 * 60);
        server.setHandler(context);
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                server.stop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }));
        server.start();
        server.join();
    }
}
