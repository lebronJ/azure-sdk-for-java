/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for LinuxOsState.
 */
public final class LinuxOsState {
    /** Static value NonDeprovisioned for LinuxOsState. */
    public static final LinuxOsState NON_DEPROVISIONED = new LinuxOsState("NonDeprovisioned");

    /** Static value DeprovisionRequested for LinuxOsState. */
    public static final LinuxOsState DEPROVISION_REQUESTED = new LinuxOsState("DeprovisionRequested");

    /** Static value DeprovisionApplied for LinuxOsState. */
    public static final LinuxOsState DEPROVISION_APPLIED = new LinuxOsState("DeprovisionApplied");

    private String value;

    /**
     * Creates a custom value for LinuxOsState.
     * @param value the custom value
     */
    public LinuxOsState(String value) {
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
        if (!(obj instanceof LinuxOsState)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        LinuxOsState rhs = (LinuxOsState) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
