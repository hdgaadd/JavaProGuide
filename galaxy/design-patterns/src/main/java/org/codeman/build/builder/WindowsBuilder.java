package org.codeman.build.builder;

import org.codeman.build.component.Server;

/**
 * @author hdgaadd
 * created on 2022/10/04
 */
public class WindowsBuilder extends Builder<Server> {
    @Override
    public void setServer() {
        super.t = new Server("Windows");
    }
}
