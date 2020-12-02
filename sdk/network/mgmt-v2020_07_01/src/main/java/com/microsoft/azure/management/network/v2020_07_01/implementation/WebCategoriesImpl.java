/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2020_07_01.WebCategories;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.network.v2020_07_01.AzureWebCategory;
import com.microsoft.azure.arm.utils.PagedListConverter;

class WebCategoriesImpl extends WrapperImpl<WebCategoriesInner> implements WebCategories {
    private PagedListConverter<AzureWebCategoryInner, AzureWebCategory> converter;
    private final NetworkManager manager;

    WebCategoriesImpl(NetworkManager manager) {
        super(manager.inner().webCategories());
        this.manager = manager;
        this.converter = new PagedListConverter<AzureWebCategoryInner, AzureWebCategory>() {
            @Override
            public Observable<AzureWebCategory> typeConvertAsync(AzureWebCategoryInner inner) {
                return Observable.just((AzureWebCategory) wrapModel(inner));
            }
        };
    }

    public NetworkManager manager() {
        return this.manager;
    }

    private AzureWebCategoryImpl wrapModel(AzureWebCategoryInner inner) {
        return  new AzureWebCategoryImpl(inner, manager());
    }

    @Override
    public Observable<AzureWebCategory> getAsync(String name) {
        WebCategoriesInner client = this.inner();
        return client.getAsync(name)
        .map(new Func1<AzureWebCategoryInner, AzureWebCategory>() {
            @Override
            public AzureWebCategory call(AzureWebCategoryInner inner) {
                return new AzureWebCategoryImpl(inner, manager());
            }
        });
    }

    @Override
    public PagedList<AzureWebCategory> list() {
        WebCategoriesInner client = this.inner();
        return converter.convert(client.list());
    }

    @Override
    public Observable<AzureWebCategory> listAsync() {
        WebCategoriesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<AzureWebCategoryInner>, Iterable<AzureWebCategoryInner>>() {
            @Override
            public Iterable<AzureWebCategoryInner> call(Page<AzureWebCategoryInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AzureWebCategoryInner, AzureWebCategory>() {
            @Override
            public AzureWebCategory call(AzureWebCategoryInner inner) {
                return wrapModel(inner);
            }
        });
    }

}