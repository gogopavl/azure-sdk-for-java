// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for DirectoryOrderby. */
public final class DirectoryOrderby extends ExpandableStringEnum<DirectoryOrderby> {
    /** Static value id for DirectoryOrderby. */
    public static final DirectoryOrderby ID = fromString("id");

    /** Static value id desc for DirectoryOrderby. */
    public static final DirectoryOrderby ID_DESC = fromString("id desc");

    /** Static value deletedDateTime for DirectoryOrderby. */
    public static final DirectoryOrderby DELETED_DATE_TIME = fromString("deletedDateTime");

    /** Static value deletedDateTime desc for DirectoryOrderby. */
    public static final DirectoryOrderby DELETED_DATE_TIME_DESC = fromString("deletedDateTime desc");

    /** Static value description for DirectoryOrderby. */
    public static final DirectoryOrderby DESCRIPTION = fromString("description");

    /** Static value description desc for DirectoryOrderby. */
    public static final DirectoryOrderby DESCRIPTION_DESC = fromString("description desc");

    /** Static value displayName for DirectoryOrderby. */
    public static final DirectoryOrderby DISPLAY_NAME = fromString("displayName");

    /** Static value displayName desc for DirectoryOrderby. */
    public static final DirectoryOrderby DISPLAY_NAME_DESC = fromString("displayName desc");

    /** Static value visibility for DirectoryOrderby. */
    public static final DirectoryOrderby VISIBILITY = fromString("visibility");

    /** Static value visibility desc for DirectoryOrderby. */
    public static final DirectoryOrderby VISIBILITY_DESC = fromString("visibility desc");

    /**
     * Creates or finds a DirectoryOrderby from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DirectoryOrderby.
     */
    @JsonCreator
    public static DirectoryOrderby fromString(String name) {
        return fromString(name, DirectoryOrderby.class);
    }

    /** @return known DirectoryOrderby values. */
    public static Collection<DirectoryOrderby> values() {
        return values(DirectoryOrderby.class);
    }
}