/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Data Lake Analytics job resources.
 */
public class JobResource {
    /**
     * the name of the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * the path to the resource.
     */
    @JsonProperty(value = "resourcePath")
    private String resourcePath;

    /**
     * the job resource type. Possible values include: 'VertexResource',
     * 'JobManagerResource', 'StatisticsResource',
     * 'VertexResourceInUserFolder', 'JobManagerResourceInUserFolder',
     * 'StatisticsResourceInUserFolder'.
     */
    @JsonProperty(value = "type")
    private JobResourceType type;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the JobResource object itself.
     */
    public JobResource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the resourcePath value.
     *
     * @return the resourcePath value
     */
    public String resourcePath() {
        return this.resourcePath;
    }

    /**
     * Set the resourcePath value.
     *
     * @param resourcePath the resourcePath value to set
     * @return the JobResource object itself.
     */
    public JobResource withResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public JobResourceType type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the JobResource object itself.
     */
    public JobResource withType(JobResourceType type) {
        this.type = type;
        return this;
    }

}
