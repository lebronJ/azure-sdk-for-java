/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.batch.protocol.implementation.api;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for ComputeNodeFillType.
 */
public enum ComputeNodeFillType {
    /** Enum value spread. */
    SPREAD("spread"),

    /** Enum value pack. */
    PACK("pack"),

    /** Enum value unmapped. */
    UNMAPPED("unmapped");

    /** The actual serialized value for a ComputeNodeFillType instance. */
    private String value;

    ComputeNodeFillType(String value) {
        this.value = value;
    }

    /**
     * Gets the serialized value for a ComputeNodeFillType instance.
     *
     * @return the serialized value.
     */
    @JsonValue
    public String toValue() {
        return this.value;
    }

    /**
     * Parses a serialized value to a ComputeNodeFillType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed ComputeNodeFillType object, or null if unable to parse.
     */
    @JsonCreator
    public static ComputeNodeFillType fromValue(String value) {
        ComputeNodeFillType[] items = ComputeNodeFillType.values();
        for (ComputeNodeFillType item : items) {
            if (item.toValue().equals(value)) {
                return item;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return toValue();
    }
}