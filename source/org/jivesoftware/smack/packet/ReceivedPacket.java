/**
 * Copyright 2011 Glenn Maynard
 *
 * All rights reserved. Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jivesoftware.smack.packet;

import org.w3c.dom.Element;

/**
 * This class represents a received packet which we don't have special handling
 * for.  These packets are only received from the server, and never sent by us.
 */
public class ReceivedPacket extends Packet {
    private final Element element;

    public ReceivedPacket(Element element) {
        super();
        if (element == null)
            throw new IllegalArgumentException();
        this.element = element;
    }

    /**
     * If this is a packet received from the server (and not a constructed packet
     * about to be sent), retrieve the DOM element representation of this packet.
     */
    public Element getElement() {
        return element;
    }

    /* Features is only received and never sent, so we don't support converting
     * to XML.  Throws RuntimeException. */
    public String toXML() {
        throw new RuntimeException("Not implemented");
    }
}