/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.io.transport.ibmbluemix;

/**
 * Callback interface for sending a message to the MqttBrokerConnection.
 *
 * @author Davy Vanherbergen
 * @since 1.3.0
 */
public interface MqttSenderChannel {

    /**
     * Send a message to the MQTT broker.
     * 
     * @param topic
     *            Topic to publish the message to.
     * @param message
     *            message payload.
     * @throws Exception
     *             if an error occurs during sending.
     */
    public void publish(String topic, byte[] message) throws Exception;

}
