/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.RestorableMongodbCollections;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.RestorableMongodbCollectionGetResult;

class RestorableMongodbCollectionsImpl extends WrapperImpl<RestorableMongodbCollectionsInner> implements RestorableMongodbCollections {
    private final CosmosDBManager manager;

    RestorableMongodbCollectionsImpl(CosmosDBManager manager) {
        super(manager.inner().restorableMongodbCollections());
        this.manager = manager;
    }

    public CosmosDBManager manager() {
        return this.manager;
    }

    private RestorableMongodbCollectionGetResultImpl wrapModel(RestorableMongodbCollectionGetResultInner inner) {
        return  new RestorableMongodbCollectionGetResultImpl(inner, manager());
    }

    @Override
    public Observable<RestorableMongodbCollectionGetResult> listAsync(String location, String instanceId) {
        RestorableMongodbCollectionsInner client = this.inner();
        return client.listAsync(location, instanceId)
        .flatMap(new Func1<List<RestorableMongodbCollectionGetResultInner>, Observable<RestorableMongodbCollectionGetResultInner>>() {
            @Override
            public Observable<RestorableMongodbCollectionGetResultInner> call(List<RestorableMongodbCollectionGetResultInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<RestorableMongodbCollectionGetResultInner, RestorableMongodbCollectionGetResult>() {
            @Override
            public RestorableMongodbCollectionGetResult call(RestorableMongodbCollectionGetResultInner inner) {
                return wrapModel(inner);
            }
        });
    }

}