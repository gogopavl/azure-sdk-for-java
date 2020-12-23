/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Required inbound or outbound traffic for Azure Spring Cloud instance.
 */
public class RequiredTraffic {
    /**
     * The protocol of required traffic.
     */
    @JsonProperty(value = "protocol", access = JsonProperty.Access.WRITE_ONLY)
    private String protocol;

    /**
     * The port of required traffic.
     */
    @JsonProperty(value = "port", access = JsonProperty.Access.WRITE_ONLY)
    private Integer port;

    /**
     * The ip list of required traffic.
     */
    @JsonProperty(value = "ips", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> ips;

    /**
     * The FQDN list of required traffic.
     */
    @JsonProperty(value = "fqdns", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> fqdns;

    /**
     * The direction of required traffic. Possible values include: 'Inbound',
     * 'Outbound'.
     */
    @JsonProperty(value = "direction", access = JsonProperty.Access.WRITE_ONLY)
    private TrafficDirection direction;

    /**
     * Get the protocol of required traffic.
     *
     * @return the protocol value
     */
    public String protocol() {
        return this.protocol;
    }

    /**
     * Get the port of required traffic.
     *
     * @return the port value
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Get the ip list of required traffic.
     *
     * @return the ips value
     */
    public List<String> ips() {
        return this.ips;
    }

    /**
     * Get the FQDN list of required traffic.
     *
     * @return the fqdns value
     */
    public List<String> fqdns() {
        return this.fqdns;
    }

    /**
     * Get the direction of required traffic. Possible values include: 'Inbound', 'Outbound'.
     *
     * @return the direction value
     */
    public TrafficDirection direction() {
        return this.direction;
    }

}