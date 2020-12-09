/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AFDEndpointProtocols.
 */
public final class AFDEndpointProtocols extends ExpandableStringEnum<AFDEndpointProtocols> {
    /** Static value Http for AFDEndpointProtocols. */
    public static final AFDEndpointProtocols HTTP = fromString("Http");

    /** Static value Https for AFDEndpointProtocols. */
    public static final AFDEndpointProtocols HTTPS = fromString("Https");

    /**
     * Creates or finds a AFDEndpointProtocols from its string representation.
     * @param name a name to look for
     * @return the corresponding AFDEndpointProtocols
     */
    @JsonCreator
    public static AFDEndpointProtocols fromString(String name) {
        return fromString(name, AFDEndpointProtocols.class);
    }

    /**
     * @return known AFDEndpointProtocols values
     */
    public static Collection<AFDEndpointProtocols> values() {
        return values(AFDEndpointProtocols.class);
    }
}