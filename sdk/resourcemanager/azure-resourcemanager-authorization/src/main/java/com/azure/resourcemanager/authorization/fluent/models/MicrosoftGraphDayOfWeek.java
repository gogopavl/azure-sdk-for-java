// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MicrosoftGraphDayOfWeek. */
public final class MicrosoftGraphDayOfWeek extends ExpandableStringEnum<MicrosoftGraphDayOfWeek> {
    /** Static value sunday for MicrosoftGraphDayOfWeek. */
    public static final MicrosoftGraphDayOfWeek SUNDAY = fromString("sunday");

    /** Static value monday for MicrosoftGraphDayOfWeek. */
    public static final MicrosoftGraphDayOfWeek MONDAY = fromString("monday");

    /** Static value tuesday for MicrosoftGraphDayOfWeek. */
    public static final MicrosoftGraphDayOfWeek TUESDAY = fromString("tuesday");

    /** Static value wednesday for MicrosoftGraphDayOfWeek. */
    public static final MicrosoftGraphDayOfWeek WEDNESDAY = fromString("wednesday");

    /** Static value thursday for MicrosoftGraphDayOfWeek. */
    public static final MicrosoftGraphDayOfWeek THURSDAY = fromString("thursday");

    /** Static value friday for MicrosoftGraphDayOfWeek. */
    public static final MicrosoftGraphDayOfWeek FRIDAY = fromString("friday");

    /** Static value saturday for MicrosoftGraphDayOfWeek. */
    public static final MicrosoftGraphDayOfWeek SATURDAY = fromString("saturday");

    /**
     * Creates or finds a MicrosoftGraphDayOfWeek from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MicrosoftGraphDayOfWeek.
     */
    @JsonCreator
    public static MicrosoftGraphDayOfWeek fromString(String name) {
        return fromString(name, MicrosoftGraphDayOfWeek.class);
    }

    /** @return known MicrosoftGraphDayOfWeek values. */
    public static Collection<MicrosoftGraphDayOfWeek> values() {
        return values(MicrosoftGraphDayOfWeek.class);
    }
}