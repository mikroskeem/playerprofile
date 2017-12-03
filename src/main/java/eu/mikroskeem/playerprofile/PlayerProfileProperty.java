/*
 * Copyright 2017 Mark Vainomaa
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package eu.mikroskeem.playerprofile;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Player profile property object
 *
 * @author Mark Vainomaa
 */
public class PlayerProfileProperty {
    @NotNull private final String key;
    @NotNull private final String value;
    @Nullable private final String signature;

    /**
     * Constructs new player profile property
     *
     * @param key Property key
     * @param value Property value
     * @param signature Property signature
     */
    public PlayerProfileProperty(@NotNull String key, @NotNull String value, @Nullable String signature) {
        this.key = key;
        this.value = value;
        this.signature = signature;
    }

    /**
     * Constructs new player profile property
     *
     * @param key Property key
     * @param value Property value
     */
    public PlayerProfileProperty(@NotNull String key, @NotNull String value) {
        this.key = key;
        this.value = value;
        this.signature = null;
    }

    /**
     * Gets property key
     *
     * @return Property key
     */
    @NotNull
    public String getKey() {
        return key;
    }

    /**
     * Gets property value
     *
     * @return Property value
     */
    @NotNull
    public String getValue() {
        return value;
    }

    /**
     * Gets property signature. Might be absent
     *
     * @return Property signature
     */
    @Nullable
    public String getSignature() {
        return signature;
    }
}
