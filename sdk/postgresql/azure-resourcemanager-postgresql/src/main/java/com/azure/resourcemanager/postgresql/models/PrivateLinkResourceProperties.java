// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Properties of a private link resource. */
@Immutable
public final class PrivateLinkResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkResourceProperties.class);

    /*
     * The private link resource group id.
     */
    @JsonProperty(value = "groupId", access = JsonProperty.Access.WRITE_ONLY)
    private String groupId;

    /*
     * The private link resource required member names.
     */
    @JsonProperty(value = "requiredMembers", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> requiredMembers;

    /**
     * Get the groupId property: The private link resource group id.
     *
     * @return the groupId value.
     */
    public String groupId() {
        return this.groupId;
    }

    /**
     * Get the requiredMembers property: The private link resource required member names.
     *
     * @return the requiredMembers value.
     */
    public List<String> requiredMembers() {
        return this.requiredMembers;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}