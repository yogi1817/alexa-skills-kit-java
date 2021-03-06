/*
    Copyright 2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.

    Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
    except in compliance with the License. A copy of the License is located at

        http://aws.amazon.com/apache2.0/

    or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
    the specific language governing permissions and limitations under the License.
 */

package com.amazon.speech.speechlet.interfaces.display.element;

/**
 * Enumerates valid image sizes to be used in an image instance. See
 * {@link ImageInstance#setSize(ImageSize)} for usage.
 */
public enum ImageSize {
    X_SMALL("x-small"),
    SMALL("small"),
    MEDIUM("medium"),
    LARGE("large"),
    X_LARGE("x-large");

    private String size;

    private ImageSize(String size) {
        this.size = size;
    }

    /**
     * Returns the size of image (x-small, small, medium, large, x-large).
     *
     * @return the size of image
     */
    public String getSize() {
        return size;
    }
}
