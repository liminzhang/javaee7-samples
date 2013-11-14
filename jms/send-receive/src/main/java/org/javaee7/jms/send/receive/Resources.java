/*
 * Copyright (c) 2013 RWE IT Slovakia, s.r.o; RWE IT GmbH
 */

package org.javaee7.jms.send.receive;

import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;

/**
 * 
 * @author Patrik Dudits
 */
@JMSDestinationDefinitions({
    @JMSDestinationDefinition(
        name = Resources.CLASSIC_QUEUE,
        resourceAdapter = "jmsra",
        interfaceName = "javax.jms.Queue",
        destinationName="classicQueue",
        description="My Sync Queue"),
    @JMSDestinationDefinition(name = Resources.ASYNC_QUEUE,
        resourceAdapter = "jmsra",
        interfaceName = "javax.jms.Queue",
        destinationName="asyncQueue",
        description="My Async Queue"),
    @JMSDestinationDefinition(name = Resources.SYNC_QUEUE,
        resourceAdapter = "jmsra",
        interfaceName = "javax.jms.Queue",
        destinationName="syncQueue",
        description="My Async Queue")       
})
public class Resources {
    public static final String SYNC_QUEUE = "java:global/jms/mySyncQueue";
    public static final String ASYNC_QUEUE = "java:global/jms/myAsyncQueue";
    public static final String CLASSIC_QUEUE = "java:global/jms/classicQueue";
}
