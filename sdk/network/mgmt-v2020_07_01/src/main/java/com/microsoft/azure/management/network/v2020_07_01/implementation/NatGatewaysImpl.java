/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2020_07_01.NatGateways;
import com.microsoft.azure.management.network.v2020_07_01.NatGateway;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class NatGatewaysImpl extends GroupableResourcesCoreImpl<NatGateway, NatGatewayImpl, NatGatewayInner, NatGatewaysInner, NetworkManager>  implements NatGateways {
    protected NatGatewaysImpl(NetworkManager manager) {
        super(manager.inner().natGateways(), manager);
    }

    @Override
    protected Observable<NatGatewayInner> getInnerAsync(String resourceGroupName, String name) {
        NatGatewaysInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        NatGatewaysInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<NatGateway> listByResourceGroup(String resourceGroupName) {
        NatGatewaysInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<NatGateway> listByResourceGroupAsync(String resourceGroupName) {
        NatGatewaysInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<NatGatewayInner>, Iterable<NatGatewayInner>>() {
            @Override
            public Iterable<NatGatewayInner> call(Page<NatGatewayInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NatGatewayInner, NatGateway>() {
            @Override
            public NatGateway call(NatGatewayInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<NatGateway> list() {
        NatGatewaysInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<NatGateway> listAsync() {
        NatGatewaysInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<NatGatewayInner>, Iterable<NatGatewayInner>>() {
            @Override
            public Iterable<NatGatewayInner> call(Page<NatGatewayInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NatGatewayInner, NatGateway>() {
            @Override
            public NatGateway call(NatGatewayInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public NatGatewayImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected NatGatewayImpl wrapModel(NatGatewayInner inner) {
        return  new NatGatewayImpl(inner.name(), inner, manager());
    }

    @Override
    protected NatGatewayImpl wrapModel(String name) {
        return new NatGatewayImpl(name, new NatGatewayInner(), this.manager());
    }

}