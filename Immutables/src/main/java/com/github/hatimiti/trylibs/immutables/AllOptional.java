package com.github.hatimiti.trylibs.immutables;

import java.util.*;
import org.immutables.value.Value;

@Value.Immutable
public interface AllOptional {
//    com.google.common.base.Optional<Integer> v1();
    Optional<Integer> v2();
    OptionalInt i1();
    OptionalLong l1();
    OptionalDouble d1();
}
