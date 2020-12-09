/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.microsoft.azure.management.cdn.v2020_09_01.ResourcesResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.cdn.v2020_09_01.ResourcesResponseCustomDomainsItem;
import com.microsoft.azure.management.cdn.v2020_09_01.ResourcesResponseEndpointsItem;

class ResourcesResponseImpl extends WrapperImpl<ResourcesResponseInner> implements ResourcesResponse {
    private final CdnManager manager;
    ResourcesResponseImpl(ResourcesResponseInner inner, CdnManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public List<ResourcesResponseCustomDomainsItem> customDomains() {
        return this.inner().customDomains();
    }

    @Override
    public List<ResourcesResponseEndpointsItem> endpoints() {
        return this.inner().endpoints();
    }

}