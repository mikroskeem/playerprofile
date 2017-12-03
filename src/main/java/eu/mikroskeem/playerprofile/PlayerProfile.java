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

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Player profile object
 *
 * @author Mark Vainomaa
 */
public class PlayerProfile {
    @NotNull private final String username;
    @NotNull private final UUID uuid;
    @NotNull private final Multimap<String, PlayerProfileProperty> properties;

    /**
     * Constructs new player profile
     *
     * @param username Username
     * @param uuid UUID
     * @param properties Properties
     */
    public PlayerProfile(@NotNull String username, @NotNull UUID uuid, @NotNull Multimap<String, PlayerProfileProperty> properties) {
        this.username = username;
        this.uuid = uuid;
        this.properties = properties;
    }

    /**
     * Constructs new player profile
     *
     * @param username Username
     * @param uuid UUID
     */
    public PlayerProfile(@NotNull String username, @NotNull UUID uuid) {
        this.username = username;
        this.uuid = uuid;
        this.properties = ArrayListMultimap.create();
    }

    /**
     * Gets profile username
     *
     * @return Profile username
     */
    @NotNull
    public String getUsername() {
        return username;
    }

    /**
     * Gets profile UUID
     *
     * @return Profile UUID
     */
    @NotNull
    public UUID getUuid() {
        return uuid;
    }

    /**
     * Gets profile properties
     *
     * @return Profile properties
     */
    @NotNull
    public Multimap<String, PlayerProfileProperty> getProperties() {
        return properties;
    }
}
