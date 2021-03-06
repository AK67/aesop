/*******************************************************************************
 *
 * Copyright 2012-2015, the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obta a copy of the License at
 *      http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *******************************************************************************/

package com.flipkart.aesop.elasticsearchdatalayer.delete;


import com.flipkart.aesop.elasticsearchdatalayer.elasticsearchclient.ElasticSearchClient;
import org.springframework.beans.factory.FactoryBean;


/**
 * Generates objects of {@link ElasticSearchDeleteDataLayer} and ensures that it is singleton.
 * @author Pratyay Banerjee
 */
public class ElasticSearchDeleteDataLayerFactory implements FactoryBean<ElasticSearchDeleteDataLayer>
{
    /* Data Layer Client */
    private ElasticSearchClient elasticSearchClient;

    public ElasticSearchDeleteDataLayer getObject() throws Exception
    {
        ElasticSearchDeleteDataLayer  elasticSearchDeleteDataLayer =  new ElasticSearchDeleteDataLayer();

        /* set the elasticSearchDataLayerClient */
        elasticSearchDeleteDataLayer.setElasticSearchClient(elasticSearchClient);

        return elasticSearchDeleteDataLayer;
    }

    public Class<?> getObjectType() {
        return ElasticSearchDeleteDataLayer.class;
    }

    public boolean isSingleton() {
        return true;
    }

    /* Getters and Setters Start */
    public ElasticSearchClient getElasticSearchClient() {
        return elasticSearchClient;
    }

    public void setElasticSearchClient(ElasticSearchClient elasticSearchClient) {
        this.elasticSearchClient = elasticSearchClient;
    }
    /* Getters and Setters End */
}
