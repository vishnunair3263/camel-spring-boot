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
package org.apache.camel.component.servicenow.springboot;

import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.camel.component.servicenow.ServiceNowRelease;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.apache.camel.support.jsse.SSLContextParameters;
import org.apache.cxf.configuration.security.ProxyAuthorizationPolicy;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The servicenow component is used to integrate Camel with ServiceNow cloud
 * services.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.springboot.maven.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.servicenow")
public class ServiceNowComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the servicenow component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * The ServiceNow instance name
     */
    private String instanceName;
    /**
     * The ServiceNow default configuration
     */
    private ServiceNowConfigurationNestedConfiguration configuration;
    /**
     * The ServiceNow REST API url
     */
    private String apiUrl;
    /**
     * ServiceNow user account name
     */
    private String userName;
    /**
     * ServiceNow account password
     */
    private String password;
    /**
     * OAuth2 ClientID
     */
    private String oauthClientId;
    /**
     * OAuth2 ClientSecret
     */
    private String oauthClientSecret;
    /**
     * OAuth token Url
     */
    private String oauthTokenUrl;
    /**
     * The proxy host name
     */
    private String proxyHost;
    /**
     * The proxy port number
     */
    private Integer proxyPort;
    /**
     * Username for proxy authentication
     */
    private String proxyUserName;
    /**
     * Password for proxy authentication
     */
    private String proxyPassword;
    /**
     * Enable usage of global SSL context parameters.
     */
    private Boolean useGlobalSslContextParameters = false;
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

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ServiceNowConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            ServiceNowConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getApiUrl() {
        return apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOauthClientId() {
        return oauthClientId;
    }

    public void setOauthClientId(String oauthClientId) {
        this.oauthClientId = oauthClientId;
    }

    public String getOauthClientSecret() {
        return oauthClientSecret;
    }

    public void setOauthClientSecret(String oauthClientSecret) {
        this.oauthClientSecret = oauthClientSecret;
    }

    public String getOauthTokenUrl() {
        return oauthTokenUrl;
    }

    public void setOauthTokenUrl(String oauthTokenUrl) {
        this.oauthTokenUrl = oauthTokenUrl;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public Integer getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    public String getProxyUserName() {
        return proxyUserName;
    }

    public void setProxyUserName(String proxyUserName) {
        this.proxyUserName = proxyUserName;
    }

    public String getProxyPassword() {
        return proxyPassword;
    }

    public void setProxyPassword(String proxyPassword) {
        this.proxyPassword = proxyPassword;
    }

    public Boolean getUseGlobalSslContextParameters() {
        return useGlobalSslContextParameters;
    }

    public void setUseGlobalSslContextParameters(
            Boolean useGlobalSslContextParameters) {
        this.useGlobalSslContextParameters = useGlobalSslContextParameters;
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

    public static class ServiceNowConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.servicenow.ServiceNowConfiguration.class;
        /**
         * The ServiceNow REST API url
         */
        private String apiUrl;
        /**
         * The ServiceNow REST API version, default latest
         */
        private String apiVersion;
        /**
         * The date format used for Json serialization/deserialization
         */
        private String dateFormat = "yyyy-MM-dd";
        /**
         * The date-time format used for Json serialization/deserialization
         */
        private String dateTimeFormat = "yyyy-MM-dd HH:mm:ss";
        /**
         * Set this parameter to true to return only scorecards where the
         * indicator Display field is selected. Set this parameter to all to
         * return scorecards with any Display field value. This parameter is
         * true by default.
         */
        private String display = "true";
        /**
         * Return the display value (true), actual value (false), or both (all)
         * for reference fields (default: false)
         */
        private String displayValue = "false";
        /**
         * True to exclude Table API links for reference fields (default: false)
         */
        private Boolean excludeReferenceLink;
        /**
         * Set this parameter to true to return only scorecards that are
         * favorites of the querying user.
         */
        private Boolean favorites;
        /**
         * To configure http-client
         */
        private HTTPClientPolicy httpClientPolicy;
        /**
         * Set this parameter to true to always return all available aggregates
         * for an indicator, including when an aggregate has already been
         * applied. If a value is not specified, this parameter defaults to
         * false and returns no aggregates.
         */
        private Boolean includeAggregates;
        /**
         * Set this parameter to true to return all available aggregates for an
         * indicator when no aggregate has been applied. If a value is not
         * specified, this parameter defaults to false and returns no
         * aggregates.
         */
        private Boolean includeAvailableAggregates;
        /**
         * Set this parameter to true to return all available breakdowns for an
         * indicator. If a value is not specified, this parameter defaults to
         * false and returns no breakdowns.
         */
        private Boolean includeAvailableBreakdowns;
        /**
         * Set this parameter to true to return all notes associated with the
         * score. The note element contains the note text as well as the author
         * and timestamp when the note was added.
         */
        private Boolean includeScoreNotes;
        /**
         * Set this parameter to true to return all scores for a scorecard. If a
         * value is not specified, this parameter defaults to false and returns
         * only the most recent score value.
         */
        private Boolean includeScores;
        /**
         * True to set raw value of input fields (default: false)
         */
        private Boolean inputDisplayValue;
        /**
         * Set this parameter to true to return only scorecards for key
         * indicators.
         */
        private Boolean key;
        /**
         * Sets Jackson's ObjectMapper to use for request/reply
         */
        private ObjectMapper mapper;
        /**
         * Defines both request and response models
         */
        private Map models;
        /**
         * OAuth2 ClientID
         */
        private String oauthClientId;
        /**
         * OAuth2 ClientSecret
         */
        private String oauthClientSecret;
        /**
         * OAuth token Url
         */
        private String oauthTokenUrl;
        /**
         * ServiceNow account password, MUST be provided
         */
        private String password;
        /**
         * Enter the maximum number of scorecards each query can return. By
         * default this value is 10, and the maximum is 100.
         */
        private Integer perPage = 10;
        /**
         * To configure proxy authentication
         */
        private ProxyAuthorizationPolicy proxyAuthorizationPolicy;
        /**
         * The proxy host name
         */
        private String proxyHost;
        /**
         * Password for proxy authentication
         */
        private String proxyPassword;
        /**
         * The proxy port number
         */
        private Integer proxyPort;
        /**
         * Username for proxy authentication
         */
        private String proxyUserName;
        /**
         * The ServiceNow release to target, default to Helsinki See
         * https://docs.servicenow.com
         */
        private ServiceNowRelease release = ServiceNowRelease.HELSINKI;
        /**
         * Defines the request model
         */
        private Map requestModels;
        /**
         * The default resource, can be overridden by header
         * CamelServiceNowResource
         */
        private String resource;
        /**
         * Defines the response model
         */
        private Map responseModels;
        /**
         * Set this parameter to true to retrieve the target record when using
         * import set api. The import set result is then replaced by the target
         * record
         */
        private Boolean retrieveTargetRecordOnImport = false;
        /**
         * Specify the value to use when sorting results. By default, queries
         * sort records by value.
         */
        private String sortBy;
        /**
         * Specify the sort direction, ascending or descending. By default,
         * queries sort records in descending order. Use sysparm_sortdir=asc to
         * sort in ascending order.
         */
        private String sortDir;
        /**
         * To configure security using SSLContextParameters. See
         * http://camel.apache.org/camel-configuration-utilities.html
         */
        private SSLContextParameters sslContextParameters;
        /**
         * True to suppress auto generation of system fields (default: false)
         */
        private Boolean suppressAutoSysField;
        /**
         * Set this value to true to remove the Link header from the response.
         * The Link header allows you to request additional pages of data when
         * the number of records matching your query exceeds the query limit
         */
        private Boolean suppressPaginationHeader;
        /**
         * The default table, can be overridden by header CamelServiceNowTable
         */
        private String table;
        /**
         * Set this parameter to true to return only scorecards that have a
         * target.
         */
        private Boolean target;
        /**
         * The time format used for Json serialization/deserialization
         */
        private String timeFormat = "HH:mm:ss";
        /**
         * Gets only those categories whose parent is a catalog.
         */
        private Boolean topLevelOnly;
        /**
         * ServiceNow user account name, MUST be provided
         */
        private String userName;

        public String getApiUrl() {
            return apiUrl;
        }

        public void setApiUrl(String apiUrl) {
            this.apiUrl = apiUrl;
        }

        public String getApiVersion() {
            return apiVersion;
        }

        public void setApiVersion(String apiVersion) {
            this.apiVersion = apiVersion;
        }

        public String getDateFormat() {
            return dateFormat;
        }

        public void setDateFormat(String dateFormat) {
            this.dateFormat = dateFormat;
        }

        public String getDateTimeFormat() {
            return dateTimeFormat;
        }

        public void setDateTimeFormat(String dateTimeFormat) {
            this.dateTimeFormat = dateTimeFormat;
        }

        public String getDisplay() {
            return display;
        }

        public void setDisplay(String display) {
            this.display = display;
        }

        public String getDisplayValue() {
            return displayValue;
        }

        public void setDisplayValue(String displayValue) {
            this.displayValue = displayValue;
        }

        public Boolean getExcludeReferenceLink() {
            return excludeReferenceLink;
        }

        public void setExcludeReferenceLink(Boolean excludeReferenceLink) {
            this.excludeReferenceLink = excludeReferenceLink;
        }

        public Boolean getFavorites() {
            return favorites;
        }

        public void setFavorites(Boolean favorites) {
            this.favorites = favorites;
        }

        public HTTPClientPolicy getHttpClientPolicy() {
            return httpClientPolicy;
        }

        public void setHttpClientPolicy(HTTPClientPolicy httpClientPolicy) {
            this.httpClientPolicy = httpClientPolicy;
        }

        public Boolean getIncludeAggregates() {
            return includeAggregates;
        }

        public void setIncludeAggregates(Boolean includeAggregates) {
            this.includeAggregates = includeAggregates;
        }

        public Boolean getIncludeAvailableAggregates() {
            return includeAvailableAggregates;
        }

        public void setIncludeAvailableAggregates(
                Boolean includeAvailableAggregates) {
            this.includeAvailableAggregates = includeAvailableAggregates;
        }

        public Boolean getIncludeAvailableBreakdowns() {
            return includeAvailableBreakdowns;
        }

        public void setIncludeAvailableBreakdowns(
                Boolean includeAvailableBreakdowns) {
            this.includeAvailableBreakdowns = includeAvailableBreakdowns;
        }

        public Boolean getIncludeScoreNotes() {
            return includeScoreNotes;
        }

        public void setIncludeScoreNotes(Boolean includeScoreNotes) {
            this.includeScoreNotes = includeScoreNotes;
        }

        public Boolean getIncludeScores() {
            return includeScores;
        }

        public void setIncludeScores(Boolean includeScores) {
            this.includeScores = includeScores;
        }

        public Boolean getInputDisplayValue() {
            return inputDisplayValue;
        }

        public void setInputDisplayValue(Boolean inputDisplayValue) {
            this.inputDisplayValue = inputDisplayValue;
        }

        public Boolean getKey() {
            return key;
        }

        public void setKey(Boolean key) {
            this.key = key;
        }

        public ObjectMapper getMapper() {
            return mapper;
        }

        public void setMapper(ObjectMapper mapper) {
            this.mapper = mapper;
        }

        public Map getModels() {
            return models;
        }

        public void setModels(Map models) {
            this.models = models;
        }

        public String getOauthClientId() {
            return oauthClientId;
        }

        public void setOauthClientId(String oauthClientId) {
            this.oauthClientId = oauthClientId;
        }

        public String getOauthClientSecret() {
            return oauthClientSecret;
        }

        public void setOauthClientSecret(String oauthClientSecret) {
            this.oauthClientSecret = oauthClientSecret;
        }

        public String getOauthTokenUrl() {
            return oauthTokenUrl;
        }

        public void setOauthTokenUrl(String oauthTokenUrl) {
            this.oauthTokenUrl = oauthTokenUrl;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public Integer getPerPage() {
            return perPage;
        }

        public void setPerPage(Integer perPage) {
            this.perPage = perPage;
        }

        public ProxyAuthorizationPolicy getProxyAuthorizationPolicy() {
            return proxyAuthorizationPolicy;
        }

        public void setProxyAuthorizationPolicy(
                ProxyAuthorizationPolicy proxyAuthorizationPolicy) {
            this.proxyAuthorizationPolicy = proxyAuthorizationPolicy;
        }

        public String getProxyHost() {
            return proxyHost;
        }

        public void setProxyHost(String proxyHost) {
            this.proxyHost = proxyHost;
        }

        public String getProxyPassword() {
            return proxyPassword;
        }

        public void setProxyPassword(String proxyPassword) {
            this.proxyPassword = proxyPassword;
        }

        public Integer getProxyPort() {
            return proxyPort;
        }

        public void setProxyPort(Integer proxyPort) {
            this.proxyPort = proxyPort;
        }

        public String getProxyUserName() {
            return proxyUserName;
        }

        public void setProxyUserName(String proxyUserName) {
            this.proxyUserName = proxyUserName;
        }

        public ServiceNowRelease getRelease() {
            return release;
        }

        public void setRelease(ServiceNowRelease release) {
            this.release = release;
        }

        public Map getRequestModels() {
            return requestModels;
        }

        public void setRequestModels(Map requestModels) {
            this.requestModels = requestModels;
        }

        public String getResource() {
            return resource;
        }

        public void setResource(String resource) {
            this.resource = resource;
        }

        public Map getResponseModels() {
            return responseModels;
        }

        public void setResponseModels(Map responseModels) {
            this.responseModels = responseModels;
        }

        public Boolean getRetrieveTargetRecordOnImport() {
            return retrieveTargetRecordOnImport;
        }

        public void setRetrieveTargetRecordOnImport(
                Boolean retrieveTargetRecordOnImport) {
            this.retrieveTargetRecordOnImport = retrieveTargetRecordOnImport;
        }

        public String getSortBy() {
            return sortBy;
        }

        public void setSortBy(String sortBy) {
            this.sortBy = sortBy;
        }

        public String getSortDir() {
            return sortDir;
        }

        public void setSortDir(String sortDir) {
            this.sortDir = sortDir;
        }

        public SSLContextParameters getSslContextParameters() {
            return sslContextParameters;
        }

        public void setSslContextParameters(
                SSLContextParameters sslContextParameters) {
            this.sslContextParameters = sslContextParameters;
        }

        public Boolean getSuppressAutoSysField() {
            return suppressAutoSysField;
        }

        public void setSuppressAutoSysField(Boolean suppressAutoSysField) {
            this.suppressAutoSysField = suppressAutoSysField;
        }

        public Boolean getSuppressPaginationHeader() {
            return suppressPaginationHeader;
        }

        public void setSuppressPaginationHeader(Boolean suppressPaginationHeader) {
            this.suppressPaginationHeader = suppressPaginationHeader;
        }

        public String getTable() {
            return table;
        }

        public void setTable(String table) {
            this.table = table;
        }

        public Boolean getTarget() {
            return target;
        }

        public void setTarget(Boolean target) {
            this.target = target;
        }

        public String getTimeFormat() {
            return timeFormat;
        }

        public void setTimeFormat(String timeFormat) {
            this.timeFormat = timeFormat;
        }

        public Boolean getTopLevelOnly() {
            return topLevelOnly;
        }

        public void setTopLevelOnly(Boolean topLevelOnly) {
            this.topLevelOnly = topLevelOnly;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }
}