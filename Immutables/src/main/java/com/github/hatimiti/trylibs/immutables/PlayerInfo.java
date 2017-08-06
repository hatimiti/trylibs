package com.github.hatimiti.trylibs.immutables;

import org.immutables.value.Value;

@Value.Immutable
public abstract class PlayerInfo {

    @Value.Parameter
    public abstract long id();

    @Value.Default
    public String name() {
      return "Anonymous_" + id();
    }

    @Value.Default
    public int gamesPlayed() {
      return 0;
    }
}
