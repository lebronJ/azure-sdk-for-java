/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.storage;

import com.microsoft.rest.AzureClient;
import com.microsoft.rest.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.CustomHeaderInterceptor;
import com.squareup.okhttp.OkHttpClient;
import java.util.UUID;
import retrofit.Retrofit;

/**
 * Initializes a new instance of the StorageManagementClient class.
 */
public class StorageManagementClientImpl extends AzureServiceClient implements StorageManagementClient {
    private String baseUri;
    private AzureClient azureClient;

    /**
     * Gets the URI used as the base for all cloud service requests.
     * @return The BaseUri value.
     */
    public String getBaseUri() {
        return this.baseUri;
    }

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    private ServiceClientCredentials credentials;

    /**
     * Gets The management credentials for Azure.
     *
     * @return the credentials value.
     */
    public ServiceClientCredentials getCredentials() {
        return this.credentials;
    }

    private String subscriptionId;

    /**
     * Gets Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Gets subscription credentials which uniquely identify Microsoft Azure subscription. The subscription ID forms part of the URI for every service call.
     *
     * @param subscriptionId the subscriptionId value.
     */
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    private String apiVersion;

    /**
     * Gets Client Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     */
    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout for Long Running Operations.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int getLongRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout for Long Running Operations.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     */
    public void setLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
    }

    private StorageAccountsOperations storageAccounts;

    /**
     * Gets the StorageAccountsOperations object to access its operations.
     * @return the storageAccounts value.
     */
    public StorageAccountsOperations getStorageAccounts() {
        return this.storageAccounts;
    }

    private UsageOperations usage;

    /**
     * Gets the UsageOperations object to access its operations.
     * @return the usage value.
     */
    public UsageOperations getUsage() {
        return this.usage;
    }

    /**
     * Initializes an instance of StorageManagementClient client.
     */
    public StorageManagementClientImpl() {
        this("https://management.azure.com");
    }

    /**
     * Initializes an instance of StorageManagementClient client.
     *
     * @param baseUri the base URI of the host
     */
    public StorageManagementClientImpl(String baseUri) {
        this(baseUri, null);
    }

    /**
     * Initializes an instance of StorageManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public StorageManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of StorageManagementClient client.
     *
     * @param baseUri the base URI of the host
     * @param credentials the management credentials for Azure
     */
    public StorageManagementClientImpl(String baseUri, ServiceClientCredentials credentials) {
        super();
        this.baseUri = baseUri;
        this.credentials = credentials;
        initialize();
    }

    /**
     * Initializes an instance of StorageManagementClient client.
     *
     * @param baseUri the base URI of the host
     * @param credentials the management credentials for Azure
     * @param client the {@link OkHttpClient} client to use for REST calls
     * @param retrofitBuilder the builder for building up a {@link Retrofit}
     */
    public StorageManagementClientImpl(String baseUri, ServiceClientCredentials credentials, OkHttpClient client, Retrofit.Builder retrofitBuilder) {
        super(client, retrofitBuilder);
        this.baseUri = baseUri;
        this.credentials = credentials;
        initialize();
    }

    private void initialize() {
        if (this.credentials != null)
        {
            this.credentials.applyCredentialsFilter(this.client);
        }
        this.apiVersion = "2015-06-15";
        this.acceptLanguage = "en-US";
        this.getClientInterceptors().add(new CustomHeaderInterceptor("x-ms-client-request-id", UUID.randomUUID().toString()));
        this.azureClient = new AzureClient(client, retrofitBuilder);
        this.azureClient.setCredentials(this.credentials);
        Retrofit retrofit = retrofitBuilder.baseUrl(baseUri).build();
        this.storageAccounts = new StorageAccountsOperationsImpl(retrofit, this);
        this.usage = new UsageOperationsImpl(retrofit, this);
    }
}
