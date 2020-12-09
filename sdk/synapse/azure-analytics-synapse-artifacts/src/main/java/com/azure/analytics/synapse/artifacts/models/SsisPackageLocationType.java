// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for SsisPackageLocationType. */
public final class SsisPackageLocationType extends ExpandableStringEnum<SsisPackageLocationType> {
    /** Static value SSISDB for SsisPackageLocationType. */
    public static final SsisPackageLocationType SSISDB = fromString("SSISDB");

    /** Static value File for SsisPackageLocationType. */
    public static final SsisPackageLocationType FILE = fromString("File");

    /** Static value InlinePackage for SsisPackageLocationType. */
    public static final SsisPackageLocationType INLINE_PACKAGE = fromString("InlinePackage");

    /**
     * Creates or finds a SsisPackageLocationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding SsisPackageLocationType.
     */
    @JsonCreator
    public static SsisPackageLocationType fromString(String name) {
        return fromString(name, SsisPackageLocationType.class);
    }

    /** @return known SsisPackageLocationType values. */
    public static Collection<SsisPackageLocationType> values() {
        return values(SsisPackageLocationType.class);
    }
}