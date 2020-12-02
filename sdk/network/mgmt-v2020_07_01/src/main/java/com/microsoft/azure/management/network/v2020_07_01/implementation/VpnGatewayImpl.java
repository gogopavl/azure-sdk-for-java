/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_07_01.VpnGateway;
import rx.Observable;
import com.microsoft.azure.SubResource;
import java.util.List;
import com.microsoft.azure.management.network.v2020_07_01.BgpSettings;
import com.microsoft.azure.management.network.v2020_07_01.ProvisioningState;
import com.microsoft.azure.management.network.v2020_07_01.VpnGatewayIpConfiguration;
import java.util.ArrayList;
import com.microsoft.azure.management.network.v2020_07_01.VpnConnection;

class VpnGatewayImpl extends GroupableResourceCoreImpl<VpnGateway, VpnGatewayInner, VpnGatewayImpl, NetworkManager> implements VpnGateway, VpnGateway.Definition, VpnGateway.Update {
    VpnGatewayImpl(String name, VpnGatewayInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<VpnGateway> createResourceAsync() {
        VpnGatewaysInner client = this.manager().inner().vpnGateways();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VpnGateway> updateResourceAsync() {
        VpnGatewaysInner client = this.manager().inner().vpnGateways();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<VpnGatewayInner> getInnerAsync() {
        VpnGatewaysInner client = this.manager().inner().vpnGateways();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public BgpSettings bgpSettings() {
        return this.inner().bgpSettings();
    }

    @Override
    public List<VpnConnection> connections() {
        List<VpnConnection> lst = new ArrayList<VpnConnection>();
        if (this.inner().connections() != null) {
            for (VpnConnectionInner inner : this.inner().connections()) {
                lst.add( new VpnConnectionImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public List<VpnGatewayIpConfiguration> ipConfigurations() {
        return this.inner().ipConfigurations();
    }

    @Override
    public Boolean isRoutingPreferenceInternet() {
        return this.inner().isRoutingPreferenceInternet();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public SubResource virtualHub() {
        return this.inner().virtualHub();
    }

    @Override
    public Integer vpnGatewayScaleUnit() {
        return this.inner().vpnGatewayScaleUnit();
    }

    @Override
    public VpnGatewayImpl withBgpSettings(BgpSettings bgpSettings) {
        this.inner().withBgpSettings(bgpSettings);
        return this;
    }

    @Override
    public VpnGatewayImpl withConnections(List<VpnConnectionInner> connections) {
        this.inner().withConnections(connections);
        return this;
    }

    @Override
    public VpnGatewayImpl withIsRoutingPreferenceInternet(Boolean isRoutingPreferenceInternet) {
        this.inner().withIsRoutingPreferenceInternet(isRoutingPreferenceInternet);
        return this;
    }

    @Override
    public VpnGatewayImpl withVirtualHub(SubResource virtualHub) {
        this.inner().withVirtualHub(virtualHub);
        return this;
    }

    @Override
    public VpnGatewayImpl withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit) {
        this.inner().withVpnGatewayScaleUnit(vpnGatewayScaleUnit);
        return this;
    }

}