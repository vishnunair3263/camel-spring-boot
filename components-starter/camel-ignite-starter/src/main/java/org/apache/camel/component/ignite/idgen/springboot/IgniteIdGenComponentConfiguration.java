/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.ignite.idgen.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The Ignite ID Generator endpoint is one of camel-ignite endpoints which
 * allows you to interact with Ignite Atomic Sequences and ID Generators.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.ignite-idgen")
public class IgniteIdGenComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the ignite-idgen component. This
     * is enabled by default.
     */
    private Boolean enabled;
    /**
     * Sets the Ignite instance. The option is a org.apache.ignite.Ignite type.
     */
    private String ignite;
    /**
     * Sets the resource from where to load the configuration. It can be a: URI,
     * String (URI) or an InputStream. The option is a java.lang.Object type.
     */
    private String configurationResource;
    /**
     * Allows the user to set a programmatic IgniteConfiguration. The option is
     * a org.apache.ignite.configuration.IgniteConfiguration type.
     */
    private String igniteConfiguration;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;

    public String getIgnite() {
        return ignite;
    }

    public void setIgnite(String ignite) {
        this.ignite = ignite;
    }

    public String getConfigurationResource() {
        return configurationResource;
    }

    public void setConfigurationResource(String configurationResource) {
        this.configurationResource = configurationResource;
    }

    public String getIgniteConfiguration() {
        return igniteConfiguration;
    }

    public void setIgniteConfiguration(String igniteConfiguration) {
        this.igniteConfiguration = igniteConfiguration;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }
}