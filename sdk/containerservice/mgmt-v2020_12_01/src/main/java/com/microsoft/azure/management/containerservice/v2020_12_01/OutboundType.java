/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OutboundType.
 */
public final class OutboundType extends ExpandableStringEnum<OutboundType> {
    /** Static value loadBalancer for OutboundType. */
    public static final OutboundType LOAD_BALANCER = fromString("loadBalancer");

    /** Static value userDefinedRouting for OutboundType. */
    public static final OutboundType USER_DEFINED_ROUTING = fromString("userDefinedRouting");

    /**
     * Creates or finds a OutboundType from its string representation.
     * @param name a name to look for
     * @return the corresponding OutboundType
     */
    @JsonCreator
    public static OutboundType fromString(String name) {
        return fromString(name, OutboundType.class);
    }

    /**
     * @return known OutboundType values
     */
    public static Collection<OutboundType> values() {
        return values(OutboundType.class);
    }
}