/*
 * This file is part of SpongeAPI, licensed under the MIT License (MIT).
 *
 * Copyright (c) SpongePowered <https://www.spongepowered.org>
 * Copyright (c) contributors
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
package org.spongepowered.api.data.manipulator.mutable.entity;

import org.spongepowered.api.data.manipulator.DataManipulator;
import org.spongepowered.api.data.manipulator.immutable.entity.ImmutableInvisibilityData;
import org.spongepowered.api.data.value.mutable.SetValue;
import org.spongepowered.api.data.value.mutable.Value;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.living.player.Player;

import java.util.UUID;

/**
 * A {@link DataManipulator} for the "invisible" state. If the value is true,
 * the {@link Entity} is rendered "invisible". Alternatively, the
 * {@link Entity} can be rendered invisible to a specific {@link Player} by
 * including the {@link Player#getUniqueId()} in the
 * {@link #invisibleToPlayerIds()}.
 */
public interface InvisibilityData extends DataManipulator<InvisibilityData, ImmutableInvisibilityData> {

    /**
     * Gets the {@link Value} of the "invisible" state of an {@link Entity}.
     *
     * @return The value of the invisible state
     */
    Value<Boolean> isInvisible();

    /**
     * Gets the {@link SetValue} of {@link Player} {@link UUID}s that the
     * owning {@link Entity} is rendered "invisible" to. If a {@link Player}'s
     * {@link UUID} is NOT included in the {@link SetValue}, then the entity is
     * not "invisible".
     *
     * @return The set value of player id's the entity is invisible to
     */
    SetValue<UUID> invisibleToPlayerIds();

}
