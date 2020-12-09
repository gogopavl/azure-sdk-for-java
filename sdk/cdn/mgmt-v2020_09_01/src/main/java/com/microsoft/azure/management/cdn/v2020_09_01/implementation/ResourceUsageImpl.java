/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.microsoft.azure.management.cdn.v2020_09_01.ResourceUsage;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class ResourceUsageImpl extends WrapperImpl<ResourceUsageInner> implements ResourceUsage {
    private final CdnManager manager;
    ResourceUsageImpl(ResourceUsageInner inner, CdnManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public Integer currentValue() {
        return this.inner().currentValue();
    }

    @Override
    public Integer limit() {
        return this.inner().limit();
    }

    @Override
    public String resourceType() {
        return this.inner().resourceType();
    }

    @Override
    public String unit() {
        return this.inner().unit();
    }

}