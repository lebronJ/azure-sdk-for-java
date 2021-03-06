/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ContainerGroupNetworkProtocol.
 */
public final class ContainerGroupNetworkProtocol {
    /** Static value TCP for ContainerGroupNetworkProtocol. */
    public static final ContainerGroupNetworkProtocol TCP = new ContainerGroupNetworkProtocol("TCP");

    /** Static value UDP for ContainerGroupNetworkProtocol. */
    public static final ContainerGroupNetworkProtocol UDP = new ContainerGroupNetworkProtocol("UDP");

    private String value;

    /**
     * Creates a custom value for ContainerGroupNetworkProtocol.
     * @param value the custom value
     */
    public ContainerGroupNetworkProtocol(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ContainerGroupNetworkProtocol)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        ContainerGroupNetworkProtocol rhs = (ContainerGroupNetworkProtocol) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
