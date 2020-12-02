// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Connection State of the Private Endpoint Connection. */
@Fluent
public final class PrivateLinkServiceConnectionStatePropertyAutoGenerated {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(PrivateLinkServiceConnectionStatePropertyAutoGenerated.class);

    /*
     * The private link service connection status.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * Any action that is required beyond basic workflow (approve/ reject/
     * disconnect)
     */
    @JsonProperty(value = "actionsRequired", access = JsonProperty.Access.WRITE_ONLY)
    private String actionsRequired;

    /**
     * Get the status property: The private link service connection status.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: The private link service connection status.
     *
     * @param status the status value to set.
     * @return the PrivateLinkServiceConnectionStatePropertyAutoGenerated object itself.
     */
    public PrivateLinkServiceConnectionStatePropertyAutoGenerated withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the actionsRequired property: Any action that is required beyond basic workflow (approve/ reject/
     * disconnect).
     *
     * @return the actionsRequired value.
     */
    public String actionsRequired() {
        return this.actionsRequired;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}