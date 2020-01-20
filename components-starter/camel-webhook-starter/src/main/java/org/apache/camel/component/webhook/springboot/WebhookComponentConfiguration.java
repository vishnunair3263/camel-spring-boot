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
package org.apache.camel.component.webhook.springboot;

import javax.annotation.Generated;
import org.apache.camel.spi.RestConfiguration;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The webhook component allows other Camel components that can receive push
 * notifications to expose webhook endpoints and automatically register them
 * with their own webhook provider.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.webhook")
public class WebhookComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the webhook component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Set the default configuration for the webhook meta-component.
     */
    private WebhookConfigurationNestedConfiguration configuration;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;

    public WebhookConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            WebhookConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }

    public static class WebhookConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.webhook.WebhookConfiguration.class;
        /**
         * The delegate uri. Must belong to a component that supports webhooks.
         */
        private String endpointUri;
        private RestConfiguration restConfiguration;
        /**
         * Automatically register the webhook at startup and unregister it on
         * shutdown.
         */
        private Boolean webhookAutoRegister = true;
        /**
         * The first (base) path element where the webhook will be exposed. It's
         * a good practice to set it to a random string, so that it cannot be
         * guessed by unauthorized parties.
         */
        private String webhookBasePath;
        /**
         * The Camel Rest component to use for the REST transport, such as
         * netty-http.
         */
        private String webhookComponentName;
        /**
         * The URL of the current service as seen by the webhook provider
         */
        private String webhookExternalUrl;
        /**
         * The path where the webhook endpoint will be exposed (relative to
         * basePath, if any)
         */
        private String webhookPath;

        public String getEndpointUri() {
            return endpointUri;
        }

        public void setEndpointUri(String endpointUri) {
            this.endpointUri = endpointUri;
        }

        public RestConfiguration getRestConfiguration() {
            return restConfiguration;
        }

        public void setRestConfiguration(RestConfiguration restConfiguration) {
            this.restConfiguration = restConfiguration;
        }

        public Boolean getWebhookAutoRegister() {
            return webhookAutoRegister;
        }

        public void setWebhookAutoRegister(Boolean webhookAutoRegister) {
            this.webhookAutoRegister = webhookAutoRegister;
        }

        public String getWebhookBasePath() {
            return webhookBasePath;
        }

        public void setWebhookBasePath(String webhookBasePath) {
            this.webhookBasePath = webhookBasePath;
        }

        public String getWebhookComponentName() {
            return webhookComponentName;
        }

        public void setWebhookComponentName(String webhookComponentName) {
            this.webhookComponentName = webhookComponentName;
        }

        public String getWebhookExternalUrl() {
            return webhookExternalUrl;
        }

        public void setWebhookExternalUrl(String webhookExternalUrl) {
            this.webhookExternalUrl = webhookExternalUrl;
        }

        public String getWebhookPath() {
            return webhookPath;
        }

        public void setWebhookPath(String webhookPath) {
            this.webhookPath = webhookPath;
        }
    }
}